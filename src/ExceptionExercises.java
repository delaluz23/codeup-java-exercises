public class ExceptionExercises {
    public static void divideNums(int numone, int numtwo){
        try{
            int i = numone / numtwo;
        }
        catch (ArithmeticException e){
            System.out.println("you can't divide by " + numtwo);
        }
        catch (ClassCastException e){
            System.out.println(e + " is not a valid integer");
        }
        catch (Exception e){
            System.out.println("uh oh");
        }
    }

    public static void main(String[] args) {
        divideNums(4,0);
    }
}
