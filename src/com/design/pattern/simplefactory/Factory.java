package com.design.pattern.simplefactory;

public class Factory {

    public static Product toProduce(String productName) {
        Product product = null;
        switch (productName) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            case "C":
                product = new ProductC();
                break;

        }
        return product;
    }
}
