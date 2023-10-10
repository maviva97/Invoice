public class Main {
    public static void main(String[] args) {
        Invoice invoice=new Invoice();
      invoice.setModel(Modell.Siemens);
      invoice.setDescriere("Masina de spalat A+++");
      invoice.setCantitatea(9);
      invoice.setPret(14000.00);
        System.out.println("Aveti in cos "+ invoice.getModel()
                +"  "+invoice.getDescriere()+
               " Cantitatea "+  invoice.getCantitatea()
                +" Suma totala  "+ invoice.getAmount()+" lei");
    }
}