class Main{
    public static void main(String[] args) {
        //1 – 1.000.000 Arasındaki Asal Sayıları Listeleme

        int m  =1000000;
        int count = 0;
        for (int i = 0; i < m; i++) {
            
            for (int j = 2; j < i; j++) {
                if(i%j==0)
                {
                    count++;
                }        
            }
            if(count!=0)
            {
                count=0;
            }
            else{
                if(i!=0&&i!=1)
                {
                    System.out.print(i+" ");
                }
            }   
        }
    }
}