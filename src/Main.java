import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static String Control(int number){
        int control=0;
        String result;
        for(int i=1; i<=number; i++){
            if(number%i == 0){
                control ++;
            }
        }
        if(control==2) result="Asal Bir Sayıdır";
        else result="Asal Bir Sayı Değildir";

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Lütfen Bir Sayı Giriniz:");
        int read=scanner.nextInt();
        String result = Control(read);
        System.out.println(read+" "+result);
    }
}