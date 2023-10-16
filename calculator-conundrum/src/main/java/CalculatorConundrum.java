import java.text.MessageFormat;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        int result = 0;

        try {
            switch(operation) {
                case "*": result = operand1 * operand2;
                    break;

                case "+": result = operand1 + operand2;
                    break; 

                case "/": result = operand1 / operand2;
                    break;

                default: throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }

        return MessageFormat.format("{0} {1} {2} = {3}", 
        String.format("%s", operand1), 
        operation, 
        String.format("%s", operand2), 
        String.format("%s", result));
    }
}
