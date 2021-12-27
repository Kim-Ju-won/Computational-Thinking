class Fibonacci{
    public long fibonacci(int num){
        long answer = 0;
        long fibo_n_2=0, fibo_n_1 = 1, fibo_n;//초기값 설정
        for(int i=1;i<=num;i++){
            fibo_n=fibo_n_2+fibo_n_1;
            if(i>=1){
                fibo_n_2=fibo_n_1;
                fibo_n_1=fibo_n;
            }
            answer = fibo_n;
        }
        return answer;
    }
    public static void main(String[] args){
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}