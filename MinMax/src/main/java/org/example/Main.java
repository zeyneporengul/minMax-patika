package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int counter, deger, min=0, max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        counter = input.nextInt();


        while(counter!=0){
            System.out.print("Sayıyı giriniz: ");
            deger = input.nextInt();
            if(deger>max){
                max = deger;
            }else if(deger<max){
                min = deger;
            }
            counter--;
        }
        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);

    }
}