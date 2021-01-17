public class HomeAppliancesStore {
    static String company_name="University of Peloponnise";
    static String adress="Sparti";
    static int workers=10;

    public String getCompany_name() {
        return this.company_name;
    }

    public void setCompany_name(String newcompany_name) {
        this.company_name = newcompany_name;
    }

    public String getAddress() {
        return this.adress;
    }

    public void setAddress(String newaddress) {
        this.adress = newaddress;
    }

    public int getWorkers() {
        return this.workers;
    }

    public void setWorkers(int newworkers) {
        this.workers = newworkers;
    }


    public static void main(String[] args) {
        System.out.println(company_name);
        System.out.println(adress);
        System.out.println(workers);
        if (company_name == null) {
            System.out.println("Company_name is null!");
        }
        if (adress == null) {
            System.out.println("Address is null!");
        }
        try {

        company_name = args[0];
        adress = args[1];
        workers = Integer.parseInt(args[2]);}
        catch(Exception e){
        System.out.println(company_name);
        System.out.println(adress);
        System.out.println(workers);}

        try {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        } catch (Exception e) {
            System.out.println(args[3]);
        }

    }
}
