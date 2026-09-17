import java.util.Scanner;
public class Insert_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []nums= new int[N];
        for(int i =0;i<N;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i =0;i<N;i++){
            if(nums[i] >= target){
                System.out.print(i);
                return;
            }
        }
        System.out.print(nums.length);

    }
    
}