package week2.task3;

import java.sql.SQLOutput;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
// Doi tuong 1 la con Meo
class conMeo{
    private String ten;
    private String thuocloai;
    private int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThuocloai() {
        return thuocloai;
    }

    public void setThuocloai(String thuocloai) {
        this.thuocloai = thuocloai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public conMeo(){
        this.ten = "Happy";
        this.thuocloai = "Canh";
        this.tuoi = 3;
    }

    public void mieuTa(){
        System.out.println(ten + " Co mau long trang va den, thuoc loai meo "+ thuocloai);
        System.out.println("Hien tai meo" + ten +", duoc " + tuoi +" tuoi va da duoc nhan nuoi");
    }

    public boolean sosanh(conMeo m1, conMeo m2){
        return (m1.getTuoi() == m2.getTuoi());
    }
}
// Doi tuong 2 la hoc sinh
class hocsinh{
    private String ten;
    private String diachi;
    private int tuoi;
    private String truong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public hocsinh(){
        ten = "Nguyen Lan Huong";
        diachi = "Ha Noi";
        tuoi = 19;
        truong = "Dai hoc cong nghe - DHQGHN";

    }

    public void thongTin(){
        System.out.println(ten + " sinh ngay 14/06/1999 tai " + diachi + " tuoi " + tuoi);
        System.out.println("Hien tai dang hoc tai truong " + truong);
    }

    public boolean soSanhsv(hocsinh p1, hocsinh p2){
        return (p1.getTruong().equals(p2.getTruong()) && p1.getTuoi() == p2.getTuoi());
    }
}
// Doi tuong 3 la giao vien
class giaoVien{
    private String ten;
    private String monhoc;
    private String truongday;
    private int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public String getTruongday() {
        return truongday;
    }

    public void setTruongday(String truongday) {
        this.truongday = truongday;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public giaoVien(){
        ten = "Nguyen Thi A";
        monhoc = "Sinh hoc";
        truongday = "THPT A";
        tuoi = 30;
    }

    public void gioiThieu(){
        System.out.println("Giao vien "+ten+" tung hoc o truong dai hoc su pham Ha Noi");
        System.out.println("Hien tai co dang day hoc o truong " + truongday + " mon " + monhoc);
        System.out.println("Nam nay co " + tuoi +" tuoi");
    }

    public void tuoiNghe(){
        if (tuoi >= 30)
            System.out.println("Da co nhieu nam kinh nghiem");
    }

}
