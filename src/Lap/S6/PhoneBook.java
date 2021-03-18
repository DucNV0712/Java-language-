package Lap.S6;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber>PhoneList;
    public PhoneBook(){
        PhoneList =new ArrayList<>();
    }
    @Override
    void insertPhone(String name, String phone) {
        for(PhoneNumber p:PhoneList);

    }

    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String newphone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }
}
