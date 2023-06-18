package org.example;
public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int myIndex = calculate.index((int) 84, 1.82);

        //weight - вес в кг
        //height - рост в м

        System.out.println(myIndex);
    }
}