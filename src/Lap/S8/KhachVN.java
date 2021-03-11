package Lap.S8;

public class KhachVN extends KhachHang{
    String customer;

    public KhachVN() {
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public double tinhTien() {
        double tongtien = 0;
        if(getAmount()<=50){
            tongtien= getAmount()*1000;
        }else if(getAmount()>50 && getAmount()<=100){
            tongtien = (getAmount()-50) * 1200 +50 * 1000;
        }else if(getAmount() >100 && getAmount()<=200){
            tongtien =  (getAmount()-100)*1500 + 50 * 1000+ 50 * 1200;
        }else{
            tongtien = (getAmount()-200) * 2000+ 100*1500+50*1200+50*1000;
        }
        return tongtien;
    }
}
