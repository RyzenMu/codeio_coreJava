public class MultidimensionalArrays {
    public static void main(String[] args) {
        //2d int arrays
        int[][] pointsw = new int[5][2];
        pointsw[0][0] = 10;
        pointsw[0][1] = 20;
        pointsw[1][0] = 30;
        pointsw[1][1] = 40;
        pointsw[4][0] = 50;
        System.out.println(pointsw[1][0]);
        //nested for loop
        for (int i= 0; i < 5; i++){
            for(int j=0; j < 2 ; j++) {
                System.out.println(pointsw[i][j]);
            }
        }
    }
}
