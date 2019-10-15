import java.time.*;
import java.util.*;

public class Main{
    public static void main(String [] args){
        
        Passager p1=new Passager("maxime","noel");
        System.out.println(p1);

        Vol v1=new Vol("AF0001", ZonedDateTime.now(), ZonedDateTime.now());
        System.out.println(v1);

		Client c1=new Client("Nicolas", "quarantes euros", "lutin", "c1");
        System.out.println(c1);

        Reservation r1=new Reservation(new Date(1999,11,25), new Double(1));
        System.out.println(r1);
        r1.confirmer();
        System.out.println(r1);
    }
}
