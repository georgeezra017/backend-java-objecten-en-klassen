public class Company {
    private String companyName;
    private String manager;

    public Company(String companyName, String manager) {
        this.companyName = companyName;
        this.manager = manager;
    }
    public String getCompanyName() {
        return companyName;
    }
    public String getManager() {
        return manager;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
}
