package WerkboekOpd.Opd8;

public class TariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven bt = new BelastingTarieven();
        boolean us = true;

    while (us) {
            try {
                bt.produceerBelastingTarieven();
                us = false;

            } catch (ArithmeticException ae) {
                 System.out.println("Fout: " + ae.getMessage());
        }
    }
}}
