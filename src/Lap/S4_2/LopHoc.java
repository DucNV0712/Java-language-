package Lap.S4_2;

import java.util.ArrayList;

public class LopHoc {
    int malop;
   String tenlop;
   String phonghoc;
   ArrayList<SinhVien>svList;
   public LopHoc(){

   }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }


    public void addSV(SinhVien SV){
       svList.add(SV);

    }

    public void removeSV(){


    }

    public  void inSVList(){
       for(SinhVien s:svList){
           System.out.println("MS:"+s.getMaso()+" Ten: "+s.getHoten());
       }
    }



}
