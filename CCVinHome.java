package apartments;

import java.util.Scanner;

public class CCVinHome extends ChungCu{
    private String soHuu="Vinhomes";

    public CCVinHome() {
    }

    public CCVinHome(String ten, int sotang, int dientich, String tenql, String soHuu) {
        super(ten, sotang, dientich, tenql);
        this.soHuu = soHuu;
    }
    public void nhapthongtin(Scanner sc) {
        super.nhapthongtin(sc);
    }

    public String getTenql() {
        return super.getTenql();
    }

    public String getTen() {
        return super.getTen();
    }

    public double getDientich() {
        return super.getDientich();
    }

    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println(getTen()+"-"+getTenql()+"-"+soHuu);
    }
    public double tinhtien()
    {
        if(getDientich()<600)
        {
            return getDientich()*getSotang()*6;
        }
        else
        {
            return getDientich()*getSotang()*10;
        }
    }

}
