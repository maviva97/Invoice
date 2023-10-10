public class Invoice {
    private Modell Model ;
    private String Descriere;
    private  int Cantitatea;
    private  Double Pret;
    private  Double Amount;
    public void setModel(Modell model) {

        this.Model = model;
    }
    public void setDescriere(String descriere) {
        this.Descriere = descriere;
    }
    public void setCantitatea(int cantitatea) {
        if (Cantitatea<0) this.Cantitatea=0;
        else this.Cantitatea = cantitatea;
    }
    public void setPret(Double pret) {
        if (pret<0) this.Pret= 0.0;
        else this.Pret = pret;
    }
    public Modell getModel() {
        return Model;
    }
    public String getDescriere() {
        return Descriere;
    }
    public int getCantitatea() {
        return Cantitatea;
    }
    public Double getPret() {
        return Pret;
    }
public  Double getAmount(){
return this.Amount=Pret*Cantitatea;
    }
}
