
import java.util.Scanner;

public class b2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = scanner.nextInt();

        System.out.print("Nhap chieu cao cua ban (m): ");
        double chieuCao = scanner.nextDouble();

        System.out.print("Ban co thich lap trinh khong? (true/false): ");
        boolean thichLapTrinh = scanner.nextBoolean();

        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieuCao + " met");
        System.out.println("Thich lap trinh: " + thichLapTrinh);
    }
}
