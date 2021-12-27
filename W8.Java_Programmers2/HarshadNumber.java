public class HarshadNumber {
    public boolean isHashard(int num){
        String str = Integer.toString(num);
        int length = str.length();
        int NumberArray[] = new int[length];
        int i =0;
        int n = num;
        int devisor = 0;

        while(i<length){
            NumberArray[i] = n%10;
            n=n/10;
            devisor+=NumberArray[i];
            i++;
        }

        if(num%devisor==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHashard(18));
    }
}
