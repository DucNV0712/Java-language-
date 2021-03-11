package Lap.s1;

public class SanPham {
    String ma;
    String ten;
    double gia;
    int soluong;
    String donvi;

    void tangSoluong(int a) {
        soluong += a;
    }

    void giamSoluong(int a) {
        if (soluong > a) {
            soluong -= a;
            return;
        }
        System.out.println("khong the giam");

    }

    void doiSoLuong(int a) {


        if (soluong + a > 0) {
            soluong = soluong + a;
        } else {
            soluong = 0;
        }
    }

    void doiGia(int a) {
        if (gia + a > 0) {
            gia = gia + a;
        } else {
            gia = 0;
        }
    }

    void kiemTra() {
        if (soluong > 0) {
            System.out.println("Sản Phẩm Còn Hàng");
        } else {
            System.out.println("Sản Phẩm Hết Hàng");

        }
    }

        void inSanpham(){
            System.out.println("ma: " + ma);
            System.out.println("ten: " + ten);
            System.out.println("gia: " + gia);
            System.out.println("Sl: " + soluong);
        }
}

