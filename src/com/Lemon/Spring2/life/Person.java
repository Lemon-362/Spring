package com.Lemon.Spring2.life;

public class Person {

    private Integer id;

    private String sex;

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("2：赋值，依赖注入");
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("1：创建对象");
    }

    public void init(){
        System.out.println("4：初始化");
    }

    public void destroy(){
        System.out.println("7：销毁");
    }
}
