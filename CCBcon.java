package apartments;

public class CCBcon extends ChungCu{
    private String soHuu = "Bcons";

    public CCBcon() {
    }

    public CCBcon(String ten, int sotang, double dientich, String tenql, String soHuu) {
        super(ten, sotang, dientich, tenql);
        this.soHuu = soHuu;
    }
    public String getTenql() {
        return super.getTenql();
    }
    public String getTen() {
        return super.getTen();
    }
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println(getTen()+"-"+getTenql()+"-"+soHuu);
    }
    public double tinhtien()
    {
        if(getDientich()<600)
        {
            return getDientich()*getSotang()*5;
        }
        else
        {
            return getDientich()*getSotang()*8;
        }
    }
}
