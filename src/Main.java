
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    char number = 'p';
    check(number);
    }
    public static void check(char x ){
        if(Character.isDigit(x)){
            System.out.println("questo carattere è un numero");
        }else{
            throw new ArithmeticException("il char non è un numero");
        }
    }
}