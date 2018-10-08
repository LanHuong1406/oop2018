package week4.task1;

public class camCaophong extends quaCam {
    private String mausac;
    private String nhacungcap;

    public camCaophong(String m, String nc){
        this.mausac = m;
        this.nhacungcap = nc;
    }

    public camCaophong(){
        this.mausac = "";
        this.nhacungcap = "";
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }


    public void gioiThieucamcaophong(camCaophong s){
        gioiThieu();
        System.out.println("Duoc cung cap boi " + s.getNhacungcap());
        System.out.println("Cam cao phong co mau " + s.getMausac());
    }

    public void inCamcaophong( camCaophong c1, camCaophong c2){
        kiemTra(c1,c2);
        System.out.println(c1.getLoaiqua()+", Ngay nhap:  " + c1.getNgaynhap()
                + ", Nguon goc: " + c1.getXuatxu() + ", Gia: " + c1.getGiaban());

        System.out.println(c2.getLoaiqua()+", Ngay nhap:  " + c2.getNgaynhap()
                + ", Nguon goc: " + c2.getXuatxu() + ", Gia: " + c2.getGiaban());
    }

}
