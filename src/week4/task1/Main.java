package week4.task1;

public class Main {
    public static void main(String[] args) {
        //Main m = new Main();
        hoaQua h = new hoaQua();
        hoaQua h2 = new hoaQua("qua Cam", 14);
        hoaQua h1 = new hoaQua("qua Tao",15);
        h.gioiThieuchung();
        System.out.println("\n");
        quaCam c = new quaCam();
        quaCam c1 = new quaCam("Ha Noi",15);
        quaCam c2 = new quaCam("Da Nang",15);
        c.gioiThieu();
        c.kiemTra(c1,c2);
        System.out.println("\n");
        camCaophong cp = new camCaophong();
        camCaophong cp1 = new camCaophong();

        cp1.setLoaiqua("Cam Cao Phong 1");
        cp1.setNgaynhap(1);
        cp1.setGiaban(25);
        cp1.setXuatxu("Trung Quoc");

        camCaophong cp2 = new camCaophong();
        cp2.setLoaiqua("Cam Cao Phong 2");
        cp2.setNgaynhap(1);
        cp2.setGiaban(20);
        cp2.setXuatxu("Viet Nam");

        camCaophong cp3 = new camCaophong("Vang nhat","Cong ty thuc pham Ha Noi");
        cp.gioiThieucamcaophong(cp3);
        System.out.println("\n");
        cp.inCamcaophong(cp1,cp2);

        System.out.println("\n");
        quaTao t = new quaTao();
        t.gioiThieutao();
        t.kiemTraloai(h1,h2);
    }
}
