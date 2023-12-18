import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mathExample = in.nextLine();
        mathExample = mathExample.replaceAll("\\s", "");
        setNumber(mathExample);
        System.out.println(doMath(str_number_A, str_number_B, detectSeparator(mathExample)));
    }

    public static boolean checkValid(String mathExample) {
        String[] mathSimbol = {"-", "+", "/", "*"};
        Boolean Duble = false;
        int yest = 0;
        Boolean valid = false;
        for (int i = 0; i < 4; i++) {
            if (mathExample.contains(mathSimbol[i])) {
                yest++;
            }
                if (mathExample.indexOf(mathSimbol[i]) != mathExample.lastIndexOf(mathSimbol[i])) {
                    Duble = true;
                }
        }
        if (yest==1 && !Duble) {
            valid = true;
        }
        return valid;
    }

    public static String detectSeparator(String mathExample) {
        String[] mathSimbol = {"-", "+", "/", "*"};
        String separator = null;
        if (checkValid(mathExample)) {
            for (int i = 0; i < 4; i++) {
                if (mathExample.contains(mathSimbol[i])) {
                    separator = mathSimbol[i];
                }
            }
        }
        return separator;
    }

    public static void setNumber(String mathExample) {
        int start = 0;
        int end = mathExample.indexOf(detectSeparator(mathExample));
        char[] dst=new char[end - start];
        mathExample.getChars(start, end, dst, 0);
        str_number_A = new String(dst);
        start = mathExample.indexOf(detectSeparator(mathExample))+1;
        end = mathExample.length();
        dst = new char[end - start];
        mathExample.getChars(start, end, dst, 0);
        str_number_B = new String(dst);
    }
    static String str_number_A;
    static String str_number_B;
    public static int doMath (String oneNumber, String twoNumber,String separator) {
        int A = Integer.parseInt (oneNumber);
        int B = Integer.parseInt (twoNumber);
        return switch (separator) {
            case ("-") -> A - B;
            case ("+") -> A + B;
            case ("*") -> A * B;
            case ("/") -> A / B;
            default -> 0;
        };
    }
  }