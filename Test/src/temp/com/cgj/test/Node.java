package temp.com.cgj.test;

public class Node {
    private int num;

    public Node(int num) {
        super();
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

}
