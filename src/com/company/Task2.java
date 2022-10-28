package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    Scanner sc = new Scanner(System.in);

    public void run(){
        System.out.println("Podaj liczbe: ");
        String input = sc.nextLine();
        System.out.println("Podaj nowa podstawe: ");
        String baseInput = sc.next();
        Integer base = Integer.parseInt(baseInput);
        splitNumber(input, base);
    }
    public void splitNumber(String num, int base){
        String[] newNumber = num.split("\\.");
        System.out.println("Wynik: " + leftPart(Integer.parseInt(newNumber[0]), base) + "." + rightPart(Double.parseDouble("0." + newNumber[1]), base));
    }
    public String leftPart(Integer a, Integer base){
        String output = "";
        while(a >= 1){
            output += a % base;
            a = a / base;
        }
        char [] letters = output.toCharArray();
        String score = "";
        for (int i = output.length() -1; i >= 0; i--){
            score = score +""+ letters[i];
        }
        return score;
    }
    public String rightPart(Double b, Integer base){
        List<Integer> parts = new LinkedList<>();
        int i = 0;
        do{
            b = b * base;
            int number = (int) Math.floor(b);
            b = b - number;
            i++;
            parts.add(number);
        }while(i < 5);
        String output = "";
        for (Integer part : parts) {
            output += part;
        }
        return output;
    }
}
