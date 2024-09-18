import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int so2 = scanner.nextInt();

        int tong = so1 + so2;
        int hieu = so1 - so2;
        int nhan = so1 * so2;

        if (so2 != 0) {
            int chia = so1 / so2;
            int sodu = so1 % so2;
            System.out.println("Thương: " + chia);
            System.out.println("Phần dư: " + sodu);
        } else {
            System.out.println("Không thể chia");
        }

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + nhan);

    }
}
