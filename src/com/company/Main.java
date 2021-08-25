package com.company;

public class Main {

    public static void main(String[] args) {
	Phone phone1=new Phone("12345","iPhone",100);
    Phone phone2=new Phone("67890","Samsung",120);
    Phone phone3=new Phone("52679","Honor",115);
        System.out.println(phone1.number+" "+phone1.model+" "+phone1.weight);
        System.out.println(phone2.number+" "+phone2.model+" "+phone2.weight);
        System.out.println(phone3.number+" "+phone3.model+" "+phone3.weight);
        System.out.println(phone1.getNumber("12345"));
        System.out.println(phone2.getNumber("67890"));
        System.out.println(phone3.getNumber("80324"));
        System.out.println(phone1.receiveCall("Ivan"));
        System.out.println(phone2.receiveCall("Vlad"));
        System.out.println(phone2.receiveCall("Alexey"));
        Phone phone4=new Phone("58762","Siemens");
        System.out.println(phone4.number+" "+phone4.model);
        System.out.println(phone4.receiveCall("Dan","74520"));
        phone4.sendMessage("12537");
    }
}
