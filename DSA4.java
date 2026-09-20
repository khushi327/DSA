import java.util.Scanner;
class DSA4{
    public static void main(String[]args){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 number:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number for every index where it appear:");
        int num=sc.nextInt();
        boolean found=false;
            for(int i=0;i<5;i++){
                if(num==arr[i]){
                    System.out.print(" "+i);
                    found=true;
                }
            }
        if(found!=true){
            System.out.print("element not found");
        }
        sc.close();
        
    }
}