public class Invoice {
    private Modell Model ;
    private String Descriere;
    private  int Cantitatea;
    private  Double Pret;
    private  Double Amount;
    public String getDescriere() {

        return Descriere;
    }
    public int getCantitatea() {

        return Cantitatea;
    }
    public Double getPret() {
        return Pret;
    }
    public void setModel(Modell model) {

        this.Model = model;
    }
    public void setDescriere(String descriere) {

        this.Descriere = descriere;
    }

    public void setCantitatea(int cantitatea) {
        if (cantitatea>0) {
            this.Cantitatea = cantitatea;
        }
        else {
            this.Cantitatea=0;
            System.out.println("Cantitatea nu este setata ");

        }
    }
    public void setPret(Double pret) {
        if (pret>0) {this.Pret = pret;
        }   else {
      this.Pret =0.0;
        System.out.println("Pretul este gresit ");
        }
    }
    public Modell getModel() {
        return Model;
    }

public  Double getAmount(){
return this.Amount=Pret*Cantitatea;
    }
    public  void Afisare(){
    System.out.println("Aveti in cos "+ getModel()+"  "+getDescriere());
    System.out.println("La pretul "+ getPret());
    System.out.println("Cantitatea "+  getCantitatea());
    System.out.println("Suma totala  "+ getAmount()+" lei");
    }
}
