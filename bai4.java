import java.util.Scanner;

class bai4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao so tien gui: ");
        int TienGui = scn.nextInt();
        System.out.println("Nhap vao thang gui: ");
        int ThangGui = scn.nextInt();
        System.out.println("Nhap vao lai suat: ");
        double LaiSuat = scn.nextDouble();
        double TienLai = (double)TienGui * LaiSuat * (double)ThangGui / 1200.0;
        double TienCuoiKi = (double)TienGui + TienLai;
        System.out.printf("So tien lai: %.2f VND\n ", TienLai);
        System.out.printf("Số tien goc cuoi ki: %.2f VND\n", TienCuoiKi);
    }
}
