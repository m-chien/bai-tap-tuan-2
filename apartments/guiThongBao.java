package apartments;

import java.util.ArrayList;
import java.util.Scanner;

public class guiThongBao {
    private ArrayList<ChungCu> qlythongbao = new ArrayList<>();

    public guiThongBao() {
        qlythongbao = new ArrayList<>();
    }

    public guiThongBao(ArrayList<ChungCu> qlythongbao) {
        this.qlythongbao = qlythongbao;
    }
    public void themnguoi(ChungCu chungcu)
    {
        qlythongbao.add(chungcu);
    }
    public void nhapdanhsach()
    {
        Scanner sc = new Scanner(System.in);
        ChungCu chungcu;
        System.out.println("nhap so luong chung cu: ");
        int n = sc.nextInt();sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("chung cu thu "+(i+1)+" la: ");
            System.out.print("ban song o dau(1-Vinhomes hay 2-Bcons): ");
            int nhap = sc.nextInt();sc.nextLine();
            if(nhap==1)
            {
                chungcu = new CCVinHome();
            }
            else
            {
                chungcu = new CCBcon();
            }
            chungcu.nhapthongtin(sc);
            themnguoi(chungcu);
        }
    }
    public void hienthithongtin()
    {
        for(ChungCu chungcu : qlythongbao)
        {
            chungcu.hienthithongtin();
        }
    }
}
