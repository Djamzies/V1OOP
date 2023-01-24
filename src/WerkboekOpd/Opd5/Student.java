package WerkboekOpd.Opd5;

public class Student {
    private String naam;
    private int studentnummer;

    public Student(String nm) {
        naam = nm;
    }

    public Student(String nm, int studnr) {
        naam = nm;
        studentnummer = studnr;
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentNummer() {
        return studentnummer;
    }

    public void setStudentNummer(int nwstudnr) {
        studentnummer = nwstudnr;
    }

    public String toString() {
        String s = "Deze student heet: " + naam + " en heeft nummer: " + studentnummer;
        return s;
    }
}
