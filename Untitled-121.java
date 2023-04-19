import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int[] s=new int[4];
        for(int i=0;i<4;i++){
            s[i]=sc.nextInt();
        }
        int max1=Math.max(s[0],s[1]);
        int max2=Math.max(s[2],s[3]);
        Arrays.sort(s);
         if((max1==s[3] && max2==s[2]) || (max1==s[2] && max2==s[3]))
         System.out.println("Yes");
         else
         System.out.println("No");
    }
}