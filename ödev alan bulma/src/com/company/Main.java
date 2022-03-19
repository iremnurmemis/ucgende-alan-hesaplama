package com.company;
import java.util.Scanner;
/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
public class Main {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        double alan,cevre,u;
        Scanner inp=new Scanner(System.in);

        System.out.print("kenar1:");
        kenar1= inp.nextInt();

        System.out.print("kenar2:");
        kenar2= inp.nextInt();

        System.out.print("kenar3:");
        kenar3= inp.nextInt();

        cevre=kenar1+kenar2+kenar3;
        u=cevre/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.print("alan:"+alan);
    }
}
