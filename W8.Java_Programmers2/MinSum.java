class TryHelloWorld{
    public int getMinSum(int[] A, int[] B){
        int answer = 0;
        int j=0, i=0;
        for(i=A.length-1;i<j;i--){
            for(j=0;j<i;j++){
                if(A[j]>=A[j+1]){
                    int temp = A[j];
                    A[j]>=A[j+1];
                    A[j+1]=temp;
                }
            }
        }

        for(i=B.length-1;i<j;i--){
            for(j=0;j<i;j++){
                if(B[j]>=B[j+1]){
                    int temp = B[j];
                    B[j>=B[j+1];
                    B[j+1]=temp;
                }
            }
        }

        for(i=0;i<A.)

        public static void main(String[] args){
            TryHelloWorld test = new TryHelloWorld();
            int[] A = {1,2};
            int[] B = {3,4};
            System.out.println(test.getMinSum(A,B));
        }


    }
}