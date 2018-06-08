package com.pycat.create.c2staticFactory;

public class Client {
    public static void main(String args[]) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); // 通过静态工厂方法创建产品
        chart.display();
        System.out.println("----------------------");
        chart = ChartFactory.getChart("pie"); // 通过静态工厂方法创建产品
        chart.display();
    }
} 