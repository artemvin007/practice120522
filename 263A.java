import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int str_num;
        for (str_num = 0; str_num < 5 && str.indexOf('1') == -1; str_num++){
            str = scan.nextLine();
        }
        System.out.println(Math.abs(2 - str.indexOf('1') / 2) + Math.abs(2 - str_num));
    }
}