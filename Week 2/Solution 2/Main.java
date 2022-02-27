import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1-N arası 3 e ve 7’ye Tam Bölünen Sayıları Listeleme
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin :");

        int n = sc.nextInt();

        for (int i =1 ; i <= n; i++) {
            
            if(i%3==0 &&i%7==0)
            {
                System.out.println(i);
            }
        }
    }
}
