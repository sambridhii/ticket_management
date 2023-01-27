package model;

import java.sql.Time;

public class Rate {
    String movie_name;
    int rate;
    int movie_time;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(int movie_time) {
        this.movie_time = movie_time;
    }


    public Rate(String movie_name, int rate, int movie_time) {
        this.movie_name = movie_name;
        this.rate = rate;
        this.movie_time = movie_time;
    }
    public void printFormat(){
        System.out.println("Name            Available Rate");
        System.out.println(this.movie_name +"       " +this.rate);
    }

}
