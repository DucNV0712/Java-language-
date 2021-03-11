package Lap.s3;

import java.util.ArrayList;

public class Room {
    public String name;
    String position;
    ArrayList<String> users;
    public Room(){
        users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void addUser(String u){
        users.add(u);

    }
    public void removeUser(int index){
        users.remove(index);
    }



}
