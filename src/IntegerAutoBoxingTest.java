import java.io.IOException;

public class IntegerAutoBoxingTest {

    public static void main(String args[]) throws IOException {

        Integer number1 = 12;
        Integer number2 = 12; // two integers will be equal because Java maintains cache of Integers for values -128 to
        // 128

        if (number1 == number2) {
            System.out.println("Two Integers objects are equal with == because they created "
                    + "using auto boxing and there value is between -128 to 128");
        }

        number1 = new Integer(12); // two integers will not be equal because one new Integer() creates separate object

        if (number1 == number2) {
            System.out.println("Integer created using auto-boxing and created using new() " + "are equal using == ");
        } else {
            System.out.println("Integer created using auto-boxing and crated using new() " + "are not equal using == ");
        } // both Integers will be equals because there numeric value is same

        if (number1.equals(number2)) {
            System.out.println("Two Integers in Java are equal using equals method " + "because of same numeric value");
        } else {
            System.out.println("Integers in Java are not equal using equals method");
        }
        number1 = 150;
        number2 = 150; // Integers will not be equal as there are out of cache range -128 and 128.

        if (number1 == number2) {
            System.out.println("Two Integer objects created with auto boxing with value "
                    + "outside -128 to 128 are equal using == ");
        } else {
            System.out.println("Two Integer objects created with auto boxing with value "
                    + "outside -128 to 128 are not equal using == ");
        }
        if (number1.equals(number2)) {
            System.out.println("= Two Integers in Java are equal using equals method "
                    + "because of same numeric value");
        } else {
            System.out.println("Integers in Java are not equal using equals method");
        }

        number1 = new Integer(150);
        number2 = new Integer(150);

        if (number1 == 150) {
            System.out.println("Two Integers in Java are equal using equals method " + "because of same numeric value");
        }

        if (number1 == number2) {
            System.out.println("Two Integer objects created with new with value "
                    + "outside -128 to 128 are equal using == ");
        } else {
            System.out.println("INPENDING DOOM: Two Integer objects created with new with value "
                    + "outside -128 to 128 are not equal using == ");
        }

        if (number1.intValue() == number2.intValue()) {
            System.out.println("We got some work to do... this is the reason "
                    + "i ask about using the Integer Object vs the primative right after i joined.");
        }

        if (number1.equals(number2)) {
            System.out.println("Two Integers in Java are equal using equals method " + "because of same numeric value");
        } else {
            System.out.println("Integers in Java are not equal using equals method");
        }

    }
}
