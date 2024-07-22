package delivery.dto;
public class DecisionDto {

    boolean employed;
    int loanAmount;
    int loanPeriod;
    int income;
    int debt;
    int age;

    public DecisionDto(int income, int debt, boolean employed, int loanAmount, int loanPeriod, int age) {
        this.income = income;
        this.debt = debt;
        this.employed = employed;
        this.loanAmount = loanAmount;
        this.loanPeriod = loanPeriod;
        this.age = age;
    }
}
