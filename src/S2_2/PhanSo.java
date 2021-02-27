package S2_2;

import java.util.Scanner;

public class PhanSo {
    private int tu, mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getTu() {
        return this.tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getMau() {
        return this.mau;
    }

    public void nhapPhanSo() {
        int t;
        int m;
        do {
            Scanner nhapPhanso = new Scanner(System.in);
            System.out.println("Nhập Tử Số: ");
            t = nhapPhanso.nextInt();
            System.out.println("Nhập Mẫu Số: ");
            m = nhapPhanso.nextInt();
            if (m == 0) {
                System.out.println("Nhập mẫu số lớn hơn 0");
            } else {
                tu = t;
                mau = m;
            }
        } while (m == 0);
    }

    public void inPhanso() {
        if (tu * mau < 0) {
            System.out.println("-" + Math.abs(tu) + "/" + Math.abs(mau));

        } else {
            System.out.println(+Math.abs(tu) + "/" + Math.abs(mau));
        }

    }

    public PhanSo congPhanso(PhanSo pSo2){
        int a = tu * pSo2.mau + pSo2.tu * mau;
        int b = mau* pSo2.mau;
        return new PhanSo();
    }
    public PhanSo truPhanso(PhanSo pSo2){
        int a = tu * pSo2.mau - pSo2.tu * mau;
        int b = mau* pSo2.mau;
        return new PhanSo();
    }
    public PhanSo nhanPhanso(PhanSo pSo2){
        int a = tu *pSo2.tu;
        int b = mau* pSo2.mau;
        return new PhanSo();
    }
    public PhanSo chiaPhanso(PhanSo pSo2){
        int a = tu *pSo2.mau;
        int b = mau* pSo2.tu;
        return new PhanSo();
    }





}
