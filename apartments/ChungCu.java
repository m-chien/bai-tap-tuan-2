package apartments;

import java.util.Scanner;

public class ChungCu {
    private String ten;
    private int sotang;
    private double dientich;
    private String tenql;

    public ChungCu() {
    }

    public ChungCu(String ten, int sotang, double dientich, String tenql) {
        this.ten = ten;
        this.sotang = sotang;
        this.dientich = dientich;
        this.tenql = tenql;
    }

    public int getSotang() {
        return sotang;
    }

    public double getDientich() {
        return dientich;
    }

    public String getTenql() {
        return tenql;
    }

    public String getTen() {
        return ten;
    }

    public void nhapthongtin(Scanner sc)
    {
        System.out.println("nhap ten: ");
        ten = sc.nextLine();
        System.out.println("nhap so tang: ");
        sotang = sc.nextInt();sc.nextLine();
        System.out.println("nhap dien tich: ");
        dientich = sc.nextInt();sc.nextLine();
        System.out.println("nhap ten quan ly: ");
        tenql = sc.nextLine();
    }
    public void hienthithongtin()
    {

    }
}
