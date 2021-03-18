package Lap.S5;

import java.util.Scanner;

public class Person {
    public String fullName;
    public String Gender;
    public String birthday;
    public String address;

    public Person(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String fullName, String gender, String birthday, String address) {
        this.fullName = fullName;
        Gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public void inforIn()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ Tên:" );
        fullName =sc.nextLine();
        System.out.println("Nhập giới tính:");
        Gender = sc.nextLine();
        System.out.println("Nhập Ngày Sinh:");
         birthday =sc.nextLine();
        System.out.println("Nhập Địa Chỉ:");
         address = sc.nextLine();
    }
    public void inforOut()
    {
        System.out.println("Họ Tên:"+this.getFullName());
        System.out.println("giới tính:"+this.getGender());
        System.out.println("Ngày Sinh:"+this.getBirthday());
        System.out.println("Địa Chỉ:"+this.getAddress());
    }
//nạp trồng (overload)
    //gi đè (override)

}
