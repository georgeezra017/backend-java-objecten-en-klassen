public class FilmRecipe {
    Film Pirates = new Film("Pirates", "Johny Depp", "12-03-2011", "action");

    public void printFilm(Film film){
        System.out.println(film.getTitel() + " " + film.getRegisseur() + " " + film.getReleasedatum() +" " + film.getGenre());
    };

    public void printAllFilms(){
      printFilm(Pirates);
    };
}
