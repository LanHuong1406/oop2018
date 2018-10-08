package week4.task1;

public class quaTao extends hoaQua {
    private int soluong;
    private String kichthuoc;

    public quaTao(){
        this.kichthuoc = "";
        this.soluong = 0 ;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public void gioiThieutao(){
        gioiThieuchung();
        System.out.println("Nhung loi ich cua qua tao mang lai :");
        System.out.println("Tot cho da");
        System.out.println("Tot cho xuong");
        System.out.println("Tang cuong he mien dich");
    }

    public void kiemTraloai(hoaQua t1, hoaQua t2){
        if (t1.getLoaiqua().equals(t2.getLoaiqua()))
            System.out.println("Thuoc cung mot loai");
        else System.out.println("khong thuoc cung mot loai");

    }
}
