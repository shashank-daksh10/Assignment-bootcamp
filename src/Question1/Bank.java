package Question1;

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


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", headOfficeAddress='" + headOfficeAddress + '\'' +
                ", chairmanName='" + chairmanName + '\'' +
                ", branchCount=" + branchCount +
                ", fdInterestRate=" + fdInterestRate +
                ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate +
                '}';
    }

    public static void main(String[] args) {
        SBI sb= new SBI("State Bank of India",
                "kolkata","raman",100,
                7,7.6,8.9);

        // calling the default constructor
       SBI sb1 = new SBI();
       sb1.setName("purushottam");



        System.out.println(sb.getBranchCount());
        System.out.println(sb.getChairmanName());
        System.out.println(sb.getName());
        System.out.println(sb.toString());

        sb.setBranchCount(100);


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


//super function is used to implement the base class constructor.
//super.f() will be used to use base class method.
// inshort we can use the same member again
// concept of inherintance is used above.
// super can be used only in inheritance
// super will be used for a class just above and not beyond.
 // if the non updated assingment is done then there are some method that we neeed to define in abstarct method and
 // give defination in each base class.



