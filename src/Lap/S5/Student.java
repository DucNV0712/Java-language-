package Lap.S5;

import java.util.Scanner;

public class Student extends Person{
    public int id;
    public double test;
    public String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) {
        this.test = test;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student() {
    }

    public void inforIn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã SV:");
        id = sc.nextInt();
        System.out.println("Nhập Điểm Thi:");
        test = sc.nextDouble();
        System.out.println("Nhập email:");
        email = sc.next();

    }
    public void inforOut(){
        System.out.println("mã SV:"+getId());
        System.out.println("Điểm Thi:"+getTest());
        System.out.println("email:"+getEmail());

    }
    public void kiemTra(){
        if(test>8.0){
            System.out.println("Được Học Bổng");
        }else {
            System.out.println("Không Được Học Bổng");
        }
    }


}
