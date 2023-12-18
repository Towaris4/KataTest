import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mathExample = in.nextLine();
        mathExample = mathExample.replaceAll("\\s", "");
        try {
            checkValid(mathExample);
            setNumber(mathExample);
            Number number_A = new Number();
            number_A.getValue(str_number_A);
            Number number_B = new Number();
            number_B.getValue(str_number_B);
            System.out.println(doMath(number_A, number_B, getSeparator(mathExample)));
        } catch (MyException | MyException2 | MyException3 | MyException4 e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkValid(String mathExample) throws MyException4 {
        String[] mathSimbol = {"-", "+", "/", "*"};
        Boolean isDuble = false;
        int yest = 0;
        Boolean valid = false;
        for (int i = 0; i < 4; i++) {
            if (mathExample.contains(mathSimbol[i])) {
                yest++;
            }
                if (mathExample.indexOf(mathSimbol[i]) != mathExample.lastIndexOf(mathSimbol[i])) {
                    isDuble = true;
                }
        }
        if (yest==1 && !isDuble) {
            valid = true;
        }
        if (!valid) {
            throw new MyException4 ("Problem");
        }
    }

    public static String getSeparator(String mathExample) {
        String[] mathSimbol = {"-", "+", "/", "*"};
        String separator = null;
            for (int i = 0; i < 4; i++) {
                if (mathExample.contains(mathSimbol[i])) {
                    separator = mathSimbol[i];
                }
            }
        return separator;
    }

    public static void setNumber(String mathExample) {
        int start = 0;
        int end = mathExample.indexOf(getSeparator(mathExample));
        char[] dst=new char[end - start];
        mathExample.getChars(start, end, dst, 0);
        str_number_A = new String(dst);
        start = mathExample.indexOf(getSeparator(mathExample))+1;
        end = mathExample.length();
        dst = new char[end - start];
        mathExample.getChars(start, end, dst, 0);
        str_number_B = new String(dst);
    }
    static String str_number_A;
    static String str_number_B;
    public static String doMath (Number A, Number B,String separator) throws MyException, MyException2 {
        int decision = 0;
        if (A.isRim==B.isRim) {
             switch (separator) {
                 case ("-"):
                     decision = A.value - B.value;
                     break;
                 case ("+"):
                     decision=A.value + B.value;
                     break;
                 case ("*"):
                     decision=A.value * B.value;
                     break;
                 case ("/"):
                     decision=A.value / B.value;
                     break;
            };
             if ((A.isRim)&&(decision<=0)) {
                 throw new MyException ("Problem");
             }
        } else {
            throw new MyException2 ("Problem");
        }
        if (A.isRim) {
            return Number.convertValue(decision);
        } else {
            return Integer.toString(decision);
        }
    }

}