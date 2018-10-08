package week4.task1;

public class camSanh extends camCaophong{
    private double can;
    private String soluong;

    public double getCan() {
        return can;
    }

    public void setCan(double can) {
        this.can = can;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public void gioiThieucamsanh(camCaophong c1){
        gioiThieu();
        System.out.println("Ngay nhap" + c1.getNgaynhap() + ", So luong nhap: " + getSoluong()
                +", Gia: " + c1.getGiaban() + ", Nha cung cap: " + c1.getNhacungcap() );
    }
}
