public class ReverseInt {
    public int reverseInt(int n){

        String str = Integer.toString(n);
        int length = str.length();
        int[] NumberArray = new int[length];
        int i =0, j=0 ;
        int answer = 0 ;

        while(i<length){
            NumberArray[i]= n%10;
            n=n/10;
            i++;
        }

        for(i=NumberArray.length-1;i>=0;i--){
            for(j=0;j<i;j++){
                if(NumberArray[j]>=NumberArray[j+1]){
                    int temp = NumberArray[j];
                    NumberArray[j]=NumberArray[j+1];
                    NumberArray[j+1]=temp;
                }
            }
        }

        j=1;
        for(i=0;i<length;i++){
            answer+=NumberArray[i]*j;
            j=j*10;
        }
        return answer;
    }
    public static void main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
