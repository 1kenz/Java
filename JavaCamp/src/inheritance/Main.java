package inheritance;

public class Main {
    

    public static void main(String[] args) {
        
        IndividualCustomer ken = new IndividualCustomer();
        ken.id = 1;
        ken.customerNumber= "123";
        ken.firstName = "ken";
        ken.nationalIdentity = "123456";


        CorporateCustomer dnzsec = new CorporateCustomer();
        dnzsec.id = 1;
        dnzsec.companyName = "dnzsec";
        dnzsec.customerNumber = "13";
        dnzsec.taxNumber = "14578";


    }

}
