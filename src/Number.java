public class Number {
    int value = 0;
    boolean isRim;

    public void getValue(String Str_num) throws MyException3 {
        switch (Str_num.toLowerCase()) {
            case "i":
                value = 1;
                isRim = true;
                break;
            case "ii":
                value = 2;
                isRim = true;
                break;
            case "iii":
                value = 3;
                isRim = true;
                break;
            case "iv":
                value = 4;
                isRim = true;
                break;
            case "v":
                value = 5;
                isRim = true;
                break;
            case "vi":
                value = 6;
                isRim = true;
                break;
            case "vii":
                value = 7;
                isRim = true;
                break;
            case "viii":
                value = 8;
                isRim = true;
                break;
            case "ix":
                value = 9;
                isRim = true;
                break;
            case "x":
                value = 10;
                isRim = true;
                break;
            case "0":
                value = 0;
                isRim = false;
                break;
            case "1":
                value = 1;
                isRim = false;
                break;
            case "2":
                value = 2;
                isRim = false;
                break;
            case "3":
                value = 3;
                isRim = false;
                break;
            case "4":
                value = 4;
                isRim = false;
                break;
            case "5":
                value = 5;
                isRim = false;
                break;
            case "6":
                value = 6;
                isRim = false;
                break;
            case "7":
                value = 7;
                isRim = false;
                break;
            case "8":
                value = 8;
                isRim = false;
                break;
            case "9":
                value = 9;
                isRim = false;
                break;
            case "10":
                value = 10;
                isRim = false;
                break;
            default:
                throw new MyException3("Problem1");
        }
    }
        public static String convertValue(int num) {
            if (num < 1 || num > 3999)
                return "Invalid Roman Number Value";
            StringBuilder s = new StringBuilder();
            while (num >= 1000) {
                s.append("M");
                num -= 1000;        }
            while (num >= 900) {
                s.append("CM");
                num -= 900;
            }
            while (num >= 500) {
                s.append("D");
                num -= 500;
            }
            while (num >= 400) {
                s.append("CD");
                num -= 400;
            }
            while (num >= 100) {
                s.append("C");
                num -= 100;
            }
            while (num >= 90) {
                s.append("XC");
                num -= 90;
            }
            while (num >= 50) {
                s.append("L");
                num -= 50;
            }
            while (num >= 40) {
                s.append("XL");
                num -= 40;
            }
            while (num >= 10) {
                s.append("X");
                num -= 10;
            }
            while (num >= 9) {
                s.append("IX");
                num -= 9;
            }
            while (num >= 5) {
                s.append("V");
                num -= 5;
            }
            while (num >= 4) {
                s.append("IV");
                num -= 4;
            }
            while (num >= 1) {
                s.append("I");
                num -= 1;
            }
            return s.toString();
            }
        }