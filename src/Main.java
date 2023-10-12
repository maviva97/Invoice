public class Main {
    public static void main(String[] args) {
        Invoice invoice=new Invoice();
      invoice.setModel(Modell.Siemens);
      invoice.setDescriere("Masina de spalat A+++");
      invoice.setCantitatea(9);
      invoice.setPret(-4000.00);
       invoice.Afisare();
    }
}