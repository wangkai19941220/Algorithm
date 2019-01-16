/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.SelectionSortComparable;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/16
 */
public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    // 定义Student的compareTo函数
    // 如果分数相等，则按照名字的字母序排序
    // 如果分数不等，则分数高的靠前
    @Override
    public int compareTo(Student o) {
        if (this.score<o.score){
            return -1;
        }else if (this.score>o.score){
            return 0;
        }else {
            return this.name.compareTo(o.name);
        }
    }
    // 定义Student实例的打印输出方式
    @Override
    public String toString() {
        return "Student: " + this.name + " " + Integer.toString( this.score );
    }
}