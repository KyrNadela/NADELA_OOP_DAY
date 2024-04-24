
public class Calculator {

    private double firstOp = 0.0;
    private double secondOp = 0.0;
    private double result = 0.0;
    private int choice;

    public Calculator(double firstOp, double secondOp, double result, int choice) {
        this.firstOp = firstOp;
        this.secondOp = secondOp;
        this.result = result;
        this.choice = choice;
    }

    public double getFirstOp() {
        return firstOp;
    }

    public double getSecondOp() {
        return secondOp;
    }

    public double getResult() {
        return result;
    }

    public void setFirstOp(double firstOp) {
        this.firstOp = firstOp;
    }

    public void setSecondOp(double secondOp) {
        this.secondOp = secondOp;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public double calculate() {
        switch (choice) {
            case 1 -> {
                result = firstOp + secondOp;
                break;
            }
            case 2 -> {
                result = firstOp - secondOp;
                break;
            }
            case 3 -> {
                result = firstOp * secondOp;
                break;
            }
            case 4 -> {
                result = firstOp / secondOp;
                break;
            }
            case 5 -> {
                result = firstOp % secondOp;
                break;
            }
            case 6 -> {
                result = firstOp * firstOp;
                break;
            }
            case 7 -> {
                result = Math.sqrt(firstOp);
                break;
            }
            case 8 -> {
                result = 1 / firstOp;
                break;
            }
            case 9 -> {
                result = 1;
                if (firstOp == 0) {
                    return result;
                } else if (firstOp < 0) {
                    throw new IllegalArgumentException("Factorial of negative number not defined");
                }
                for (int i = 1; i <= firstOp; i++) {
                    result *= i;
                }
            }

            default -> {
                throw new IllegalArgumentException("Unsupported operation: " + choice);
            }
        }
        return result;
    }
}