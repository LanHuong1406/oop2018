package week4.task1;

public class quaCam extends hoaQua {
    private int giaban;
    private String xuatxu;

    public quaCam(){
        this.giaban = 0;
        this.xuatxu = "";
    }

    public quaCam(String xx, int g ){
        super("",0);
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public void gioiThieu(){
        System.out.println("Tac dung cua qua cam voi suc khoe: ");
        System.out.println("Tot cho tieu hoa");
        System.out.println("Ho tro giam can");
        System.out.println("Phong chong ung thu");
    }

    public void kiemTra(quaCam c1, quaCam c2){
        if (soSanhngay(c1,c2)){
            System.out.println("Duoc nhap cung ngay");
        }else{
            System.out.println("Nhap khac ngay");
        }
    }



}
