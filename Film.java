public class Film {
    private String titel;
    private String regisseur;
    private String releasedatum;
    private String genre;

    public Film(String titel, String regisseur, String releasedatum, String genre) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.releasedatum = releasedatum;
        this.genre = genre;
    }

    public String getTitel() {
        return titel;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public String getReleasedatum() {
        return releasedatum;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public void setReleasedatum(String releasedatum) {
        this.releasedatum = releasedatum;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void printFilm() {
        System.out.println();
    }
}
