package daten_lesen;

public class User {
    private String name;
    private String einlogg;
    private String auslogg;
    private String einloggDatum;
    private String ausloggDatum;

    public User(String name, String einlogg, String auslogg, String einloggDatum, String ausloggDatum) {
        this.name = name;
        this.einlogg = einlogg;
        this.auslogg = auslogg;
        this.einloggDatum = einloggDatum;
        this.ausloggDatum = ausloggDatum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEinlogg() {
        return einlogg;
    }

    public void setEinlogg(String einlogg) {
        this.einlogg = einlogg;
    }

    public String getAuslogg() {
        return auslogg;
    }

    public void setAuslogg(String auslogg) {
        this.auslogg = auslogg;
    }

    public String getEinloggDatum() {
        return einloggDatum;
    }

    public void setEinloggDatum(String einloggDatum) {
        this.einloggDatum = einloggDatum;
    }

    public String getAusloggDatum() {
        return ausloggDatum;
    }

    public void setAusloggDatum(String ausloggDatum) {
        this.ausloggDatum = ausloggDatum;
    }

    public void ausgeben() {
        System.out.println("Name: " + name + "\nEinlogg: " + einlogg + "\nAuslogg: " + auslogg + "\nEinlogg Datum: " + einloggDatum + "\nAuslogg Datum: " + ausloggDatum);
    }
}
