package week4.task1;

public class hoaQua {
    private String loaiqua;
    private int ngaynhap;

    public hoaQua(){
        this.loaiqua = "";
        this.ngaynhap = 0;
    }

    public hoaQua(String lq, int n){
        this.loaiqua = lq;
        this.ngaynhap = n;
    }

    public String getLoaiqua() {
        return loaiqua;
    }

    public void setLoaiqua(String loaiqua) {
        this.loaiqua = loaiqua;
    }

    public int getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(int ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public void gioiThieuchung(){
        System.out.println("Hoa qua rat tot cho suc khoe moi nguoi");
        System.out.println("La nguon thuc an tot hang ngay");
        System.out.println("Moi loai hoa qua deu co tac dung tot rieng cua no");
    }

    public boolean soSanhngay(hoaQua q1, hoaQua q2){
        return q1.getNgaynhap() == q2.getNgaynhap();

    }
}
