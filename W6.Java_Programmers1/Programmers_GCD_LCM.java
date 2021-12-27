import java.util.Arrays;

class TryHelloWorld{
    public int[] gcdlcm(int a, int b){
        int[] answer = new int[2];
        int gcd_a = a; //gcd계산을 위해 값을 따로 복사해둠 
        int gcd_b = b; //gcd계산을 위해 값을 따로 복사헤둠
        int lcm = 0; //최소공배수를 저장할 변수
        int gcd = 0; //최대공약수를 저장할 변수
        // GCD 계산
        while(gcd_a*gcd_b!=0){
            if(gcd_a>gcd_b){
                gcd%=gcd_b;
            }
            else{
                gcd_b%=gcd_a;
            }
        }
        // LCM 계산
        if(gcd_a > gcd_b){
            a/=gcd_a;
            b/=gcd_a;
            lcm = gcd_a*a*b;
            gcd=gcd_a;
        }
        else{
            a/=gcd_b;
            b/=gcd_b;
            lcm = gcd_a*a*b;
            gcd=gcd_b;
        }
        answer[0]=gcd;
        answer[1]=lcm;
        return answer;
    }

    public static void main(String[] args){
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3,12)));
    }
}