package com.cgj.test.socket.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;


/**
 * NIO ������
 * 
 */
public class NIOServer{
    // �����ַ���
    private static final String LocalCharsetName = System.getProperty("file.encoding");

    // ���ط����������Ķ˿�
    private static final int Listenning_Port=8888;
    
    // ��������С
    private static final int Buffer_Size=1024;
    
    // ��ʱʱ��,��λ����
    private static final int TimeOut=3000;
    
    public static void main(String[] args) throws Exception{
        // ����һ���ڱ��ض˿ڽ��м����ķ���Socket�ŵ�.������Ϊ��������ʽ
        ServerSocketChannel serverChannel=ServerSocketChannel.open();
        serverChannel.socket().bind(new InetSocketAddress(Listenning_Port));
        serverChannel.configureBlocking(false);
        
        // ����һ��ѡ��������serverChannelע�ᵽ������
        Selector selector=Selector.open();
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);
        
        while(true){
            // �ȴ�ĳ���ŵ�����
            if(selector.select(TimeOut)==0){
                System.out.println(".");
                continue;
            }
            
            // ��þ����ŵ��ļ�������
            Iterator<SelectionKey> keyIter=selector.selectedKeys().iterator();
            
            // ʹ�õ��������б��������ŵ�
            while(keyIter.hasNext()){
                SelectionKey key=keyIter.next();
                
                // ����������пͻ������ӹ���,׼��һ��clientChannel��֮ͨ��
                if(key.isAcceptable()){
                    SocketChannel clientChannel=((ServerSocketChannel)key.channel()).accept();
                    clientChannel.configureBlocking(false);
                    clientChannel.register(key.selector(), SelectionKey.OP_READ,ByteBuffer.allocate(Buffer_Size));
                }
                
                // �ͻ�����д��ʱ
                if(key.isReadable()){
                    // �����ͻ���ͨ�ŵ��ŵ�
                    SocketChannel clientChannel=(SocketChannel)key.channel();
                    
                    // �õ������û���������Ҫ����ֵ
                    ByteBuffer buffer=(ByteBuffer)key.attachment();
                    buffer.clear();
                    
                    // ��ȡ��Ϣ��ö�ȡ���ֽ���
                    long bytesRead=clientChannel.read(buffer);
                    
                    if(bytesRead==-1){
                      // û�ж�ȡ�����ݵ����
                      clientChannel.close();
                    }
                    else{
                      // ��������׼��Ϊ���ݴ���״̬
                      buffer.flip();
                      
                      // ������ֽ��ַ���(ʹ��Charset���н���)   
                      String receivedString=Charset.forName(LocalCharsetName).newDecoder().decode(buffer).toString();
                      
                      // ����̨��ӡ����
                      System.out.println("���յ���Ϣ:"+receivedString);
                      
                      // ׼�����͵��ı�
                      String sendString="���,�ͻ���. �Ѿ��յ������Ϣ"+receivedString;
                      
                      // ��Ҫ���͵��ַ�������(ʹ��Charset���б���)���ٽ��а�װ
                      buffer=ByteBuffer.wrap(sendString.getBytes(LocalCharsetName));
                      
                      // ���ͻ�ȥ
                      clientChannel.write(buffer);
                      
                      // ����Ϊ��һ�ζ�ȡ����д����׼��
                      key.interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
                    }
                }
                
                keyIter.remove();
            }
        }
        
    }
}