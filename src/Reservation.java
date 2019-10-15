import java.util.*;

public class Reservation{
    public Date date;
    public Double identifiant;
    public String etat;
    private Client client;
    private Passager passager;
    private Vol vol;

    public Reservation(Date date, Double identifiant){
        this.date=date;
        this.identifiant=identifiant;
        this.etat="en attente";
    }

    public void annuler(){
        this.etat="annule";
    }

    public void confirmer(){
        this.etat="confirme";
    }

    public void payer(){
        this.etat="paye";
    }

    @Override
    public String toString(){
        return "";
    }

}