package Lap.S5;


import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person{
    ArrayList<GiaoVien> classList;
    double wagel;
    int numSubjects;
    ArrayList<GiaoVien> subjectsList;


    public double getWagel() {
        return wagel;
    }

    public void setWagel(double wagel) {
        this.wagel = wagel;
    }

    public int getNumSubjects() {
        return numSubjects;
    }

    public void setMumSubjects(int numSubjects) {
        this.numSubjects = numSubjects;
    }


    public GiaoVien() {

    }
    public void inforIn()
    {
        int a;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Số lớp gồm:" );
            a =sc.nextInt();
        }while (a>0 && a<100);
        System.out.println("Nhập mức lương:");
        Gender = sc.next();
        System.out.println("Nhập số môn giảng dạy:");
        birthday =sc.next();
        System.out.println("Nhập các môn giảng dạy:");
        address = sc.next();
    }
    public void inforOut()
    {
        System.out.println("danh sách lớp giảng dạy:");
        System.out.println("mức lương:"+getWagel());
        System.out.println("số môn giảng dạy:"+getNumSubjects());
        System.out.println("Nhập các môn giảng dạy:");
    }

}
