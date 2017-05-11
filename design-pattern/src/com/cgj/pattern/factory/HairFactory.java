package com.cgj.pattern.factory;

public class HairFactory {

    public static HairInterface getHair(String hair) {
        try {
            return (HairInterface) Class.forName(PropertiesReader.getValue(hair)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
