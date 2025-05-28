public class CompanyRecipe {

    Company apple = new Company("Apple", "Tim Cook");
    Company microsoft = new Company("Microsoft", "Satya Narayana");

    public void printCompanyInfo(Company company) {
        System.out.println("Company Name: " + company.getCompanyName() + " Company Manager:" + company.getManager());
    }

    public void printAllCompanyInfos(){
        printCompanyInfo(apple);
        printCompanyInfo(microsoft);
    }

}
