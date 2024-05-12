public class Arrays {
    public static void main(String[] args) {
        //int array
        int[] rollNo = new int[50];
        rollNo[0] = 1;
        rollNo[5] = 6;
        System.out.println(rollNo[0]);
        System.out.println(rollNo[4]);

        // string array
        String[] strs = new String[4];
        strs[0] = "my";
        strs[1] = "name";
        strs[2] = "is";
        strs[3] = "code io";
        for(int i=0; i<strs.length; i++){
            System.out.println(strs[i]);
        };
    }
}
