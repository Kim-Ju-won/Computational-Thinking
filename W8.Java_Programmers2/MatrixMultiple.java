class ProductMatrix{
    public int[][] productMatrix(int[][] A, int[][] B){
        int[][] answer = new int[A.length][B[0].length];//길이만큼 초기화
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <B[0].length ; j++){
                for(int k = 0; j <B.length ; k++){
                    answer[i][j]+=(A[i][k]*B[k][j]);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        ProductMatrix c = new ProductMatrix();
        int[][] A = {{1,2},{2,3}};
        int[][] B = {{3,4},{5,6}};

        System.out.println("행렬의 곱셈 " + c.productMatrix(A, B));
    }
}