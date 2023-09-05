package work1;

public class DateException extends Exception {
   

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }
}