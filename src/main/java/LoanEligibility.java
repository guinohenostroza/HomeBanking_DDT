public class LoanEligibility {
    private int age;
    private double loanAmount;
    private int creditScore;

    public LoanEligibility(int age, double loanAmount, int creditScore) {
        this.age = age;
        this.loanAmount = loanAmount;
        this.creditScore = creditScore;
    }

    public String checkEligibility() {
        if (age < 18) {
            return "No elegible: El solicitante debe tener al menos 18 años.";
        } else if (loanAmount > 50000 && creditScore < 700) {
            return "No elegible: Préstamos altos requieren un puntaje de crédito de 700 o más.";
        } else if (creditScore < 600) {
            return "No elegible: Puntaje de crédito demasiado bajo.";
        } else {
            return "Elegible: Préstamo aprobado.";
        }
    }
}

