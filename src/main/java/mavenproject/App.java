package mavenproject;

public class App {
    public static void main(String[] args) {
    	System.out.println(ANSI_GREEN + "Hello Worl!!!" + ANSI_RESET);
    }
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
}
