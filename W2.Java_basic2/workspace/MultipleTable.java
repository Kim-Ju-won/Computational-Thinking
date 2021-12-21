public class MultipleTable {
    public static void main(String[] args) {
      int j = 1;
      int i = 1;
      
      for(i=1;i<=9;i++){
           for(j=1;j<=9;j++){
              System.out.print(i*j+"\t");
           }
           System.out.print("\n");
      }
  }
}
