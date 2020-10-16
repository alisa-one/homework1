package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in=new Scanner (System.in);
        System.out.print("Введите Ваше имя:");
        String name=in.nextLine();
        System.out.println("Здравствуйте"+" "+name);
        in.close();



    }
}
