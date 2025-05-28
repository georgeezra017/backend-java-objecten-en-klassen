public class main { //opgave 4 en 5 begreep ik niet
    public static void main(String[] args) {
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        FilmRecipe filmRecipe = new FilmRecipe();

        WheelType wheelType = new WheelType("opel", 25, "good");
        Engine engine = new Engine(2500, 1000);
        Car car = new Car("red","diesel","opel", wheelType, engine);
        Car car2 = new Car("red","diesel","opel", wheelType, engine);


        //Film film = new Film("Pirates", "Johny Depp", "12-03-2011", "action");
        CompanyRecipe companyRecipe = new CompanyRecipe();

        applePieRecipe.printAllIngredients();
        applePieRecipe.printSteps();
        filmRecipe.printAllFilms();

        System.out.println("Car 1 fuel: " + car.getFuel());
        System.out.println("Car 2 fuel: " + car2.getFuel());
        car.refuel(500);

        System.out.println("Car 1 fuel: " + car.getFuel());
        System.out.println("Car 2 fuel: " + car2.getFuel());

        companyRecipe.printAllCompanyInfos();

        System.out.println();




    }
}

