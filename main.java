public class main {
    public static void main(String[] args) {
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        FilmRecipe filmRecipe = new FilmRecipe();
        //Film film = new Film("Pirates", "Johny Depp", "12-03-2011", "action");
        CompanyRecipe companyRecipe = new CompanyRecipe();

        applePieRecipe.printAllIngredients();
        applePieRecipe.printSteps();
        filmRecipe.printAllFilms();

        companyRecipe.printAllCompanyInfos();

        System.out.println();




    }
}

