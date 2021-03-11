package Lap.S8;

public class KhachQT extends KhachHang{
    String country;

    public KhachQT() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country
    ) {
        this.country = country;
    }

    @Override
    public double tinhTien() {
        return getAmount()*2000;
    }
}
