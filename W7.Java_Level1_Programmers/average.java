public class GetMean{
    public int getMean(int[] arragy){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (sum/array.length);
    }

    public static main(String[] args){
        int x[] = {5,4,3};
        GetMean getmean = new GetMean();
        System.out.println("평균값: "+ getmean.getMean(x));
    }
}