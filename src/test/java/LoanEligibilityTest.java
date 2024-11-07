import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoanEligibilityTest {

    @Test
    void testEligibilityUnderage() {
        // Arrange
        LoanEligibility loanEligibility = new LoanEligibility(16, 10000, 650);

        // Act
        String result = loanEligibility.checkEligibility();

        // Assert
        assertEquals("No elegible: El solicitante debe tener al menos 18 años.", result);
    }

    @Test
    void testEligibilityHighLoanLowCreditScore() {
        // Arrange
        LoanEligibility loanEligibility = new LoanEligibility(30, 60000, 650);

        // Act
        String result = loanEligibility.checkEligibility();

        // Assert
        assertEquals("No elegible: Préstamos altos requieren un puntaje de crédito de 700 o más.", result);
    }

    @Test
    void testEligibilityLowCreditScore() {
        // Arrange
        LoanEligibility loanEligibility = new LoanEligibility(25, 20000, 580);

        // Act
        String result = loanEligibility.checkEligibility();

        // Assert
        assertEquals("No elegible: Puntaje de crédito demasiado bajo.", result);
    }

    @Test
    void testEligibilityHighLoanHighCreditScore() {
        // Arrange
        LoanEligibility loanEligibility = new LoanEligibility(40, 70000, 720);

        // Act
        String result = loanEligibility.checkEligibility();

        // Assert
        assertEquals("Elegible: Préstamo aprobado.", result);
    }

    @Test
    void testEligibilityNormalCase() {
        // Arrange
        LoanEligibility loanEligibility = new LoanEligibility(30, 15000, 680);

        // Act
        String result = loanEligibility.checkEligibility();

        // Assert
        assertEquals("Elegible: Préstamo aprobado.", result);
    }

}
