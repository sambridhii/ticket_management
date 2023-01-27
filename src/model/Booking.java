package model;

public class Booking {
    String mov_name;
    int rate;
    int numberofseats;
    Boolean is3d;
    double total;

    public String getMov_name() {
        return mov_name;
    }

    public void setMov_name(String mov_name) {
        this.mov_name = mov_name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(int numberofseats) {
        this.numberofseats = numberofseats;
    }

    public Boolean getIs3d() {
        return is3d;
    }

    public void setIs3d(Boolean is3d) {
        this.is3d = is3d;
    }



    public Booking(String mov_name, int rate, int numberofseats, Boolean is3d) {
        this.mov_name = mov_name;
        this.rate = rate;
        this.numberofseats = numberofseats;
        this.is3d = is3d;
    }

   public double totalcost(){
        double cost= rate*numberofseats;
        if(is3d == true){
             total = cost + 50;
        }
        else{
             total = cost;
        }
       System.out.println("Total cost of watching  "+ this.mov_name+ " is "+ total );
        return cost;
   }


}
