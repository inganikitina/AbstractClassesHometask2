package com.company;

public class Phone {
    String number, model;
    double weight;

    Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    ;

    public String receiveCall(String name) {
        return ("Звонит " + name + ".");
    }

    public String getNumber(String number){return number;}

    public String receiveCall(String name,String number) {
        return ("Звонит " + name + "."+number);
    }
    public void sendMessage(String number){
        System.out.println(number);
    }
}