import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayilari girin:");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Toplam: "+(x+y));
            
            sc.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}