package com.harman.batch4;

public class checkingexception {
    public static void main(String[] args) {
        try{
            int x=2,y=0,z;
            z=x/y;
            System.out.println(z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by ZERO is not possible.");
        }
        catch (NullPointerException e)
        {
            System.out.println("NULL value is not accepted.");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
