public class conditionalStatements {
    public static void main(String[] args) {
        char attendance = 'P';
        int total_present = 40;
        if (attendance == 'P'){
            if (total_present >= 50) {
                System.out.println("Attended class");
            } else {
                System.out.println("Teacher Absent");
            }
        } else if (attendance == 'O'){
            System.out.println("I am on duty");
        } else {
            System.out.println("I am on leave");
        }

        // switch case
        char atten = 'o';

        switch (atten) {
            case 'A':
                System.out.println("Attended classes");
                break;
            case 'o':
                System.out.println("On duty");
                break;
            case 'B':
                System.out.println("leave");
                break;
            default:
                System.out.println(" value not provided");
        }
    }
}
