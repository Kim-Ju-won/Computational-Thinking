class SumDivisor{
    public int sumDivisor(int num){
        for(int divisor=1;divisor<=num;divisor++){
            if(num%divisor==0){answer+=divisor;}
        }
        return answer;
    }

    public static void main(String[] args){
        SumDivisor c = new SumDivisor();
        System.out.println(c.sumDivisor(12));
    }
}