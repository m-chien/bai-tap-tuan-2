
import java.util.Scanner;

public class b4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien gui (trieu dong): ");
        double soTienGui = scanner.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatHangNam = scanner.nextDouble() / 100;

        System.out.print("Nhap so thang gui: ");
        int soThangGui = scanner.nextInt();

        double laiSuatThang = laiSuatHangNam / 12;
        double soTienLai = soTienGui * laiSuatThang * soThangGui;
        double soTienGocCuoiKy = soTienGui + soTienLai;

        System.out.println("So tien lai: " + soTienLai + " trieu dong");
        System.out.println("So tien goc cuoi ky: " + soTienGocCuoiKy + " trieu dong");
    }
}
