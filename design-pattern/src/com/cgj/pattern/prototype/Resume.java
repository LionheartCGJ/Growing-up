package com.cgj.pattern.prototype;

/**
 * 1.虽然Clone方法在Object中存在的，
 *   但是如果想要调用clone必须实现Cloneable接口，
 *   否则会抛出java.lang.CloneNotSupportedException。
 * 2.在类中加上clone方法，然后方法中只需要调用super.clone()即可。
 * 
 * （ps：Oblect的clone方法只会复制基本属性和对象的引用，
 *       称为浅复制 想要实现深复制需要对象中每个引用类型的属性，
 *       都实现Cloneable接口，并主动clone和复制这些属性。
 *  ）
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience experience;

    public Resume(String name, String sex, String age) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public WorkExperience getExperience() {
        return experience;
    }

    public void setExperience(WorkExperience experience) {
        this.experience = experience;
    }

    public void setExperience(String time, String company) {
        experience.setTime(time);
        experience.setCompany(company);
    }

    @Override
    public String toString() {
        return "Resume [name=" + name + ", sex=" + sex + 
                ", age=" + age + ", experience=" + experience + "]";
    }

    // clone 方法，调用引用类型属性的clone方法，并手动赋值实现深复制
    public Resume clone() throws CloneNotSupportedException {
        Resume cloned = (Resume) super.clone();
        cloned.setExperience(experience.clone());
        return cloned;
    }
}
