public class WeightSum {
    public static void main(String[] args) {
      int i = 1;//3g��
      int j = 1;//5g��
      int k = 1;//7g��
      
      for(i=1;i<=26;i++){
           for(j=1;j<=16;j++){
                for(k=1;k<=11;k++)
                    if((i*3)+(j*5)+(k*7)==90){
                          System.out.println("3g�� : "+i+"��,\t5g�� : "+j+"��\t7g�� : "+k+" ���� �ʿ��մϴ�");
                    }
           }
      }
  }
}
