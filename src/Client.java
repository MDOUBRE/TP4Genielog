public class Client{
    private String nom;
    private String paiement;
    private String contact;
    private String reference;

    public Client(String nom, String paiement, String contact, String reference){
        this.nom=nom;
        this.paiement=paiement;
        this.contact=contact;
        this.reference=reference;
    }

	@Override
    public String toString(){
        return "le nom du client est : " + this.nom + "\n" + "Le montant du paiement est : " + this.paiement + "\n" + "Le contact du client est : " + this.contact + "\n" + "La reference du client est : " + this.reference + "\n";
    }
}
