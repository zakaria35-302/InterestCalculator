package zakaria.com.interestcalculator;

public class InterestCalculator {

    private double principalAmount;
    private float interestRate;
    private float timePeriod;


    public InterestCalculator(double principalAmount,float interestRate, float timePeriod){

        setPrincipalAmount(principalAmount);
        setInterestRate(interestRate);
        setTimePeriod(timePeriod);

    }

    public InterestCalculator()
    {

    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(float timePeriod) {
        this.timePeriod = timePeriod;
    }


    public double totalInterestAmount()
    {
        double interestAmount;
        interestAmount = (getInterestRate()*12)*getTimePeriod();

        return interestAmount;
    }


    public double totalAmountWithInterest()
    {
        double totalAmount;
        totalAmount = getPrincipalAmount()+getInterestRate()*12*getTimePeriod();
        return totalAmount;
    }




}
