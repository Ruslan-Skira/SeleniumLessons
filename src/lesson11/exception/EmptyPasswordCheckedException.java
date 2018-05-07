package lesson11.exception;

public class EmptyPasswordCheckedException extends Exception {
    private int countErrors;
    public EmptyPasswordCheckedException(String msg) {
        super(msg);
    }

    public int getCountErrors() {
        return countErrors;
    }

    public void setCountErrors(int countErrors) {
        this.countErrors = countErrors;
    }
}
