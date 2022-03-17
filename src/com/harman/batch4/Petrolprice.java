package com.harman.batch4;

abstract class Petrolprice {
    abstract void changeprice();
}
class govt extends Petrolprice{
    void changeprice(){
        System.out.println("Increased by 2%");
    }

    public static void main(String[] args) {
        Petrolprice price=new govt();
        price.changeprice();
    }
}