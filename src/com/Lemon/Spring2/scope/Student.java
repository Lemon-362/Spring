package com.Lemon.Spring2.scope;

public class Student {

    private Integer sId;

    private String sName;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sId +
                ", sName='" + sName + '\'' +
                '}';
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Student(Integer sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public Student() {
        System.out.println("无参构造器");
    }
}
