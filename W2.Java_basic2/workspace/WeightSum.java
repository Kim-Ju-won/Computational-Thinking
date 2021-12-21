public class WeightSum {
    public static void main(String[] args) {
      int i = 1;//3g추
      int j = 1;//5g추
      int k = 1;//7g추
      
      for(i=1;i<=26;i++){
           for(j=1;j<=16;j++){
                for(k=1;k<=11;k++)
                    if((i*3)+(j*5)+(k*7)==90){
                          System.out.println("3g추 : "+i+"개,\t5g추 : "+j+"개\t7g추 : "+k+" 개가 필요합니다");
                    }
           }
      }
  }
}
