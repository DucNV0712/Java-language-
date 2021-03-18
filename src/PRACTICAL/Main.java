package PRACTICAL;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập Tên:");
        c.name = nhap.nextLine();
        System.out.println("ten: "+c.getName());
        System.out.println("Vận tốc tối đa:"+c.moveMax());

        Motor m = new Motor();
        System.out.println("nhập tên:");
        m.name = nhap.nextLine();
        System.out.println("ten:"+m.getName());
        System.out.println("vận tốc tối đa:"+m.moveMax());

    }
}
