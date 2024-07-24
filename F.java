class AgeException extends Exception {
    private String msg;

    public AgeException(String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}

class F {
    public static void main(String args[]) {
        int a = -1;
        try {
            a = Integer.parseInt(args[0]);
            if (a < 0 || a > 100) {
                throw new AgeException("Invalid Age");
            }
            System.out.println("Valid age");
        } catch (AgeException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer");
        }
    }
}
