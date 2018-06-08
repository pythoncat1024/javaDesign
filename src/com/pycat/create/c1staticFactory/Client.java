package com.pycat.create.c1staticFactory;

class Client {
    public static void main(String args[]) {  
        Product product;   
        product = Factory.getProduct("A"); //通过工厂类创建产品对象  
        product = Factory.getProduct("B"); //通过工厂类创建产品对象
        product.methodSame();
        product.methodDiff();  
    }  
} 