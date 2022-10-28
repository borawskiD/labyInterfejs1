package com.company;

import java.util.Scanner;

public class Task1 {
    Scanner scanner = new Scanner(System.in);
    public void run(){
        int counter = 0;
        Double [] rectangle = new Double[6];
        do{
            try{
                System.out.println("Podaj dlugosc boku numer " + (counter+1) + ": ");
                String input = scanner.next();
                rectangle[counter] = Double.parseDouble(input);
                counter++;
            }catch(Exception e){
                System.out.println("Wrong input");
            }
        }while(counter < 6);

        findTheBest(rectangle);
    }
    public void findTheBest(Double[] rectangle){
        Double [] areas = new Double[3];
        for (int i = 0; i < areas.length; i++) {
            areas[i] = area(rectangle[2 * i], rectangle[2 * i+1]);
        }
        Double theBest = areas[0];
        int index = 0;
        for (int i = 1; i < areas.length; i++) {
            if (areas[i] > theBest){
                theBest = areas[i];
                index = i;
            }
        }
        System.out.println("Najwiekszym prostokatem jest ten " + (index + 1) + ". o polu: " + theBest);
    }
    public Double area(double one, double two){
        return one * two;
    }
}
