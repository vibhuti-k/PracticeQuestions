/*Print this pattern
      1
    1 2
  1 2 3
1 2 3 4
*/

public class PQ16 {
    public static void main(String[] args) {
        int x=6;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=x; j++){
                System.out.print(" ");
            }
            x=x-2;
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}
