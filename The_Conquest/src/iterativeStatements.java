public class iterativeStatements {
    public static void main(String[] args) {
        // for loop
        for(int i =1; i<101; i++) {
            System.out.println("code io " + i);
        }

        // while loop
        int j = 0;
        while (j <=5) {
            System.out.println("code io " + j);
            j++;
        }

        // do while loop
        int k = 8;
        do {
            System.out.println("This is do while falsey condition");
            k++;
        } while(k<5);
    }
}
