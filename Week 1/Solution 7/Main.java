import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Bir sayi girin: ");
            int x = sc.nextInt();
            sc.close();
            int total=0;
            while(x>0)
            {
                total += x%10;
                x/=10;
            }
            System.out.println("Basamaklar toplami: "+total);
            
        } catch (Exception e) {
            System.out.println(e.toString());
            sc.close();
        }
    }
}