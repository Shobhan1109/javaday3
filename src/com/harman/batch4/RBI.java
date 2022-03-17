package com.harman.batch4;

public interface RBI {
    void setInterestrate();
}
class SBI implements RBI{
    public  void setInterestrate(){
        System.out.println("7% intereset");
    }
}
class ICICI implements RBI{
    public void setInterestrate() {
        System.out.println("7.5% interest");
    }
}
class person{
    public static void main(String[] args) {
        RBI ob_sbi=new SBI();
        RBI ob_icici=new ICICI();
        System.out.println("SBI bank>>");
        ob_sbi.setInterestrate();
        System.out.println("ICICI bank>>");
        ob_icici.setInterestrate(); 
    }
}