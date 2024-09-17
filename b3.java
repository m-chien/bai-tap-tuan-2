
import java.util.Scanner;

public class b3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int soThuNhat = scanner.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int soThuHai = scanner.nextInt();

        int tong = soThuNhat + soThuHai;
        int hieu = soThuNhat - soThuHai;
        int tich = soThuNhat * soThuHai;
        int thuong = soThuNhat / soThuHai;
        int phanDu = soThuNhat % soThuHai;

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phan du: " + phanDu);
    }
}
