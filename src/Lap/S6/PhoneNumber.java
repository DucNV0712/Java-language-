package Lap.S6;

import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String>Phone;

    public PhoneNumber(String name,String Phone) {
        this.name = name;
        this.Phone =new ArrayList<>();
        this.Phone.add(Phone);
    }
    public void addPhone(String Phone){
        this.Phone.add(Phone);
    }
    public void removePhone(String Phone){
        this.Phone.remove(Phone);
    }
}
