package Question4;
abstract class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public Bank() {
    }

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }


    //@Override
    public String toString() {
        return "Bank" + "name='" + name + ", headOfficeAddress='" + headOfficeAddress + ", chairmanName='" + chairmanName +
                ", branchCount=" + branchCount + ", fdInterestRate=" + fdInterestRate + ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate ;
    }

    public static void main(String[] args) {
        get_bank_details bd=new get_bank_details();
       Bank user = bd.getdetail("SBI");
       user.setChairmanName("Shashank Daksh");

    }
}

// Subclass
class SBI extends Bank {
    public SBI(String name, String headOfficeAddress, String chairmanName, int branchCount,
               double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(name, headOfficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);

    }

    public SBI() {

    }
}

// Subclass Question1.BOI
class BOI extends Bank {
    public BOI(String name, String headOfficeAddress, String chairmanName, int branchCount,
               double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(name, headOfficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }

}
class ICICI extends Bank {
    public ICICI(String name, String headOfficeAddress, String chairmanName, int branchCount,
                 double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(name, headOfficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}
 class get_bank_details{
    public Bank getdetail(String bank){
        if(bank==null)return null;

        if(bank.equalsIgnoreCase("SBI")){
            return new SBI("State Bank of India",
                    "kolkata","raman",100,
                    7,7.6,8.9);

        }
        else if(bank.equalsIgnoreCase("BOI")){
            return new BOI("Bank of India",
                    "CALCULTA","PURUSHOTTAM",210,
                    4,8,12);

        }
        else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI("ICICI BANK",
                    "noida","anil",128,
                    7,15,16);

        }
        return null;
    }
 }