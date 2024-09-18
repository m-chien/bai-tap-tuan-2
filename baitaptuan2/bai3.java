
package baitaptuan2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap hai so nguyen: ");
        a = scn.nextInt();
        b = scn.nextInt();
        System.out.println("Tong a+b = " +(a + b));
        System.out.println("Hieu a-b = " +(a - b));
        System.out.println("Tich a*b = " +(a * b));
        System.out.println("khong the tinh");
        System.out.println("Thuong a/b = " +((float)a / b));
        System.out.println("Phan du a/b = " +(a % b));
    }
    
}
