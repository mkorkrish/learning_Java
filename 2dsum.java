public class 2dsum {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int[] row : matrix){
            for(int num: row){
                sum+=num;
            }
        }
        system.out.println("Sum: "+sum);
    }

}
