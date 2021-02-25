package Assignment1;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = nhap.nextDouble();
        System.out.println("Nhập b:");
        b = nhap.nextDouble();
        System.out.println("Nhập c:");
        c = nhap.nextDouble();
        if(a <= 0 || b <=0 || c <= 0){
            System.out.println("Hãy nhập số dương");
            //kiểm tra tam giác

        }else if(a + b > c && a + c  > b && c + b > a) {
            System.out.println("Đây là một tam giác");
            float chuvi;
            float p;
            //tính chu vi
            p=(float)(a+b+c)/2;
            chuvi = p*2;
            System.out.println("Chu vi tam giác là: "+ chuvi);
            //tính diện tích
            float Dientich;
            Dientich =(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Diện tích tam giác là "+Dientich);
        }else{
            System.out.println("Đây không phải tam giác");
        }


    }
}
