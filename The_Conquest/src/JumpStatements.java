public class JumpStatements {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            if (i==5){
                continue;
            }
            if (i==7) {
                break;
            }
            System.out.println(i);
        }
        method1();
    }
    public static void method1(){
        for (int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
