package com.pycat.create.c1;

/**
 * <pre>
 * Created by cat on 2018/6/8.
 * 1-- 简单工厂模式
 * 简单工厂模式(Simple Factory Pattern)：定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。
 * 因为在简单工厂模式中用于创建实例的方法是静态(static)方法，因此简单工厂模式又被称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
 * </pre>
 */
public class Factory {
    // 静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            //初始化设置product  
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            //初始化设置product  
        }
        return product;
    }
}  