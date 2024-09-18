
package baitaptuan2;

import java.util.Scanner;


public class bai4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int TienGui, ThangGui;
        double LaiSuat, TienLai, TienCuoiKi;
        System.out.println("Nhap vao so tien gui: ");
        TienGui = scn.nextInt();
        System.out.println("Nhap vao thang gui: ");
        ThangGui = scn.nextInt();
        System.out.println("Nhap vao lai suat: ");
        LaiSuat = scn.nextDouble();
        TienLai = TienGui*LaiSuat*ThangGui/1200;
        TienCuoiKi = TienGui + TienLai;
        System.out.printf("So tien lai: %.2f VND\n ", TienLai);
        System.out.printf("Số tien goc cuoi ki: %.2f VND\n", TienCuoiKi);
    }
    
}
