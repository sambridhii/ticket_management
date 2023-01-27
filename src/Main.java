import model.Booking;
import model.Rate;
import model.Shows;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rate first = new Rate("Black Panther",400,12);
        Rate second = new Rate("Black Adam",500,1);
        Rate third = new Rate("Eternals",600,6);
        Shows show1 = new Shows("Black Panther","Civil Mall", 12);
        Shows show2 = new Shows("Black Adam ","Civil Mall", 1);
        Shows show3 = new Shows("Eternals","Civil Mall", 6);
        Booking book1= new Booking("Black Panther",400,4,false);
        Booking book2= new Booking("Black Adam",500,2,true);
        Booking book3= new Booking("Eternals",600,1,true);
        show1.printFormat();
        show2.printFormat();
        show3.printFormat();
        first.printFormat();
        second.printFormat();
        third.printFormat();
        book1.totalcost();
        book2.totalcost();
        book3.totalcost();
    }
}