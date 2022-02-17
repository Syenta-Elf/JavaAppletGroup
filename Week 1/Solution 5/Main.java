import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,total=0;
        try {
            System.out.print("Bir sayi girin:");
            x = sc.nextInt();
            sc.close();
            for (int i = 0; i <= x; i++) 
            total +=i;
        
            System.out.println("1'den "+x+"'e kadar olan sayilarin toplami: "+total);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        
    }
}