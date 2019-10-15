import java.time.*;

public class Main{
    public static void main(String [] args){
        
        Passager p=new Passager("maxime","noel");
        System.out.println(p);

        Vol v1=new Vol("AF0001", ZonedDateTime.now(), ZonedDateTime.now());
        System.out.println(v1);
    }
}