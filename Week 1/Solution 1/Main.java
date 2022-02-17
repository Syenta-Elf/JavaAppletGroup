import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        //Tam sayı girilmediği sürece hata fırlatacak.
        try {
            int x = sc.nextInt();
            System.out.println("Girilen sayi: "+x);
            sc.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
}