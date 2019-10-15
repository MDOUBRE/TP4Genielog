import java.time.*;

public class Vol{
    private String numVol;
    private String[] identifiant;
    private ZonedDateTime depart;
    private ZonedDateTime arrivee;

    public Vol(String numVol, ZonedDateTime depart, ZonedDateTime arrivee){
        this.numVol=numVol;
        this.identifiant=new String[100];
        this.depart=depart;
        this.arrivee=arrivee;        
    }

    public void duree(){
        System.out.println(arrivee.getHour()-depart.getHour());
    }

    public int ouvrir(){
        return 0;
    }

    public int fermee(){
        return 0;
    }

    @Override
    public String toString(){
        return "le numero de vol est : " + this.numVol + "\n" + "le depart est à : " + this.depart.getHour() + "\n" + "l'arrivee est à : " + this.arrivee.getHour() + "\n";
    }
}