import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total=0;
        int [] nums = new int[10];

        System.out.println("10 sayi girin:");
        
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();            
        }
        for (int i : nums) {
            total +=i;
        }
            System.out.println("Girdiginiz sayilarin toplami:"+total);
    }
}