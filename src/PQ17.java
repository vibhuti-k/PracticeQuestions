/*Print this pattern
      A
    A B
  A B C
A B C D
*/

public class PQ17 {
    public static void main(String[] args) {
        int x=6;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=x; j++){
                System.out.print(" ");
            }
            x=x-2;
            for(char k=65; k<=i+64; k++){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}
