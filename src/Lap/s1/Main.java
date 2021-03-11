package Lap.s1;

public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.ma="01";
        sp1.ten="Samsung s21u";
        sp1.gia=20.000000;
        sp1.soluong=2;
        SanPham sp2 = new SanPham();
        sp2.ma="02";
        sp2.ten="Samsung Z fold2";
        sp2.gia=50.000000;
        sp2.soluong=3;
        sp1.inSanpham();
        sp2.inSanpham();
        sp1.tangSoluong(3);
        sp2.giamSoluong(1);
        sp1.doiSoLuong(4);
    }
}
