package baitaptuan2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("nhap hai so a, b: ");
        a = sc.nextInt();
        b= sc.nextInt();
        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+(a*b));
        if(b==0) System.out.println("khong the tinh");
        else  System.out.println("a/b= "+(a/b));
        System.out.println("a%b= "+(a%b));
    }
}
