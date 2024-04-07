import java.util.Date;
import java.awt.Point;
public class referenceDEataTypes {
    public static void main(String[] args) {
        // date is an reference data type
        Date today = new Date();
        System.out.println(today);
        // in reference data types space allocation done manually using "new" key word

        // point is another reference data type
        Point p1 = new Point(4, 5);
        Point p2 = p1;
        p2.x = 7;
        System.out.println(p1);
        System.out.println(p2);

        // reference data types have same address.
        


    }
}
