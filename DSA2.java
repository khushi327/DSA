//Last occurence of x
import java.util.Scanner;
class DSA2{
    public static void main(String[]args){
    int[] arr=new int[5];
    int result=-1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 5 number:");
    for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter number to find last occurence:");
    int num=sc.nextInt();
    for(int i=4;i>=0;i--){
        if(num==arr[i]){
            result=i;
        break;
        }
    }
    if(result!=-1){
        System.out.print("Last occurence of"+num+"is:"+result);
    }
    else{
        System.out.print("Last occurenceis not found.");
    }
    sc.close();
    }
    
}