public class ApplePieRecipe {

    Ingredient roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient witteBastardSuiker = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient zelfrijzendBakmeel = new Ingredient(300, "gram", "ongezouten roomboter");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ongezouten roomboter");
    Ingredient vanilleSuiker = new Ingredient(8, "gram", "ongezouten roomboter");
    Ingredient zout = new Ingredient(1, "snuf", "ongezouten roomboter");
    Ingredient zoetzureAppels = new Ingredient(1500, "gram", "ongezouten roomboter");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "ongezouten roomboter");
    Ingredient kaneel = new Ingredient(3, "theelepels", "ongezouten roomboter");
    Ingredient paneerMeel = new Ingredient(15, "gram", "ongezouten roomboter");

    public void stap1() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void stap2() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void stap3() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void stap4() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void stap5() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void stap6() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void stap7() {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void stap8() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void stap9() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void stap10() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printIngredient(Ingredient ingredient) {
        System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }

    public void printAllIngredients() {
        printIngredient(roomboter);
        printIngredient(witteBastardSuiker);
        printIngredient(zelfrijzendBakmeel);
        printIngredient(ei);
        printIngredient(vanilleSuiker);
        printIngredient(zout);
        printIngredient(kaneel);
        printIngredient(paneerMeel);
    }

    public void printSteps(){
        stap1();
        stap2();
        stap3();
        stap4();
        stap5();
        stap6();
        stap7();
        stap8();
        stap9();
        stap10();




    }
}
