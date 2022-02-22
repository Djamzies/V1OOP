package Prac1.Opd5;

public class Main {
    public static void main(String[] arg){
        String zaag = "s";
        int x = 0;
        while (x < 10) {
            if(zaag == "s") {
                zaag = "ss";
            } else {
                zaag = "s";
            }
            System.out.println(zaag);
            x++;
        }
    }
}
