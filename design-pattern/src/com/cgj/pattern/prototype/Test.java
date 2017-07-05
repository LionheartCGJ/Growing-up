package com.cgj.pattern.prototype;

public class Test {

    public static void main(String[] args) {
        try {
            Resume resume = new Resume("CGJ", "Male", "23");
            resume.setExperience(new WorkExperience("Two years", "Borland"));
            Resume cloned = resume.clone();
            cloned.setAge("22");
            cloned.setExperience("Two month", "JXD");
            System.out.println(cloned.toString());
            System.out.println(resume.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
