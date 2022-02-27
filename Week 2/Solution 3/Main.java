import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bir cümle girin:");
        String str = sc.nextLine();

        String[] strSplit = str.split(" ");

        Arrays.sort(strSplit);

        for (String string : strSplit) {
                System.out.print(string+" ");
        }
    }
}