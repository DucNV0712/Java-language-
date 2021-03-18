package Lap.S4_2;

public class Main {
    public static void main(String[] args){
        SinhVien SV1 = new SinhVien();
        SV1.setMaso(1);
        SV1.setHoten("Bùi Minh Khải");
        SV1.setDiachi("Hanoi");


        LopHoc lh = new LopHoc();
        lh.setMalop(1);
        lh.setTenlop("t2009");
        lh.setMalop(1);
        lh.setTenlop("T2009M");
        lh.setPhonghoc("A8");
        lh.removeSV();
        lh.inSVList();
    }

}
