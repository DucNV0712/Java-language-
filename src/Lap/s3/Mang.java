package Lap.s3;


public class Mang {
    public static void main(String[] args) {
        Room r = new Room();
        r.setName("Phong 1");
        r.setPosition("Tầng 2");
        r.addUser("Đức");
        for (String s : r.users){
            System.out.println(s);
        }
    }
}
