package Prac3.B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        if (rad > 1) {
            radius = rad;
            xPositie = x;
            yPositie = y;
        } else {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }
    public String toString(){
        return "cirkel (" + xPositie + ", " + yPositie +") met radius: " + radius;
    }
}

//Als je het try-catch block weghaalt, heeft dit tot gevolg dat de applicatie tijdens het uitvoeren stopt.
