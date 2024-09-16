package baitaptuan2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiengui,thanggui;
        double laisuat;
        System.out.println("nhap lan luot tien gui, lai suat va so thang gui: ");
        tiengui = sc.nextInt();
        laisuat = sc.nextDouble();
        thanggui = sc.nextInt();
        double tienlai = tiengui*laisuat/1200*thanggui;
        System.out.println("tien lai la: " + tienlai);
        System.out.println("tien goc cuoi ky la: "+ (tiengui+tienlai));
    }
}
