package pascal;
public class Pascal {
    private int num;
    public Pascal(int n){
        num = n;
    }
   
    public void triangle(){
         
            int[][] pascalArray  = new int[num+1][];

            pascalArray[1] = new int[1 + 2];
            pascalArray[1][1] = 1;

            for (int i = 2; i <= num; i++) {
                pascalArray[i] = new int[i + 2];
                for (int j = 1; j < pascalArray[i].length - 1; j++)
                    pascalArray[i][j] = pascalArray[i-1][j-1] + pascalArray[i-1][j];
            }

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j < pascalArray[i].length - 1; j++) {
                    System.out.print(pascalArray[i][j] + " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Pascal p = new Pascal(10);
        p.triangle();
      
    }
   
   
}