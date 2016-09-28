package com.xyy.stream;

/**
 * <p>
 * </p>
 * User: xuyuanye Date: 2016/9/28 Project: JDK1.8-NEW
 */
public class Employee {
    public Employee(String name,String city,int sales){
        this.name=name;
        this.city=city;
        this.sales=sales;
    }
    private String name;
    private String city;
    private int sales;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", sales=" + sales +
                '}';
    }
}
