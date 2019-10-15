public class Passager{
    private String nom;
    private String contact;

    public Passager(String nom, String contact){
        this.nom=nom;
        this.contact=contact;
    }

    @Override
    public String toString(){
        return "le nom du passager est : " + this.nom + "\n" + "Le nom du contact est : " + this.contact + "\n";
    }
}