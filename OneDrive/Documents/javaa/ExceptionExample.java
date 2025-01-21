public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Calling a method that throws an exception
            methodThatThrowsException();
        } catch (CustomException e) {
            System.err.println("Caught exception: " + e.getMessage());

            // Rethrowing the caught exception
            rethrowException(e);
        }
    }

    // Method that throws a custom exception
    private static void methodThatThrowsException() throws CustomException {
        // Simulating an exception condition
        throw new CustomException("This is a custom exception.");
    }

    // Method that rethrows the caught exception
    private static void rethrowException(CustomException e) {
        // Rethrow the caught exception
        throw e;
    }
}

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
