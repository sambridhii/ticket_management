package model;

import java.sql.Time;

public class Shows {
    String name;
    String location;
    int  time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }



    public Shows(String name, String location, int time) {
        this.name = name;
        this.location = location;
        this.time = time;
    }

    public void printFormat(){
        System.out.println("Name            Available Location");
        System.out.println(this.name +"       " +this.location);
    }


}
