package com.harman.batch4;

abstract class Collegefees {
    abstract void setAcademicFee();
}
class CSE_dept extends Collegefees{
    void setAcademicFee(){
        System.out.println("100000");
    }
}
class ME_dept extends Collegefees{
    void setAcademicFee(){
        System.out.println("75000");
    }
}
class CollegeOffice {
    public static void main(String[] args) {
        Collegefees cse=new CSE_dept();
        Collegefees me=new ME_dept();
        System.out.println("CSE fees structure.");
        cse.setAcademicFee();
        System.out.println("ME fees structure.");
        me.setAcademicFee();
    }
}