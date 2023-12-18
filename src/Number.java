public class Number {
    int value = 0;
    boolean isRim;
    public void getType(String Str_num) {
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
                System.out.println("Ошибка, таких чисел нет");
        }
    }
}