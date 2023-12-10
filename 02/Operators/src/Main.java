public class Main {
    public static void main(String[] args) {

        boolean True = true, False = false;

        //------------------Логические операторы------------------
        System.out.println(True || False); //true
        System.out.println(True || True); //true
        System.out.println(False || False); //false
        System.out.println(True && False); //false
        System.out.println(True && True); //true
        System.out.println(!True); //false
        System.out.println(!False); //true
        //--------------------------------------------------------

        //------------------Тенарный оператор------------------
        int x = 5, y = 2;
        System.out.println(x > y ? "Yes" : "No");
        System.out.println(x < y ? "Yes" : "No");
        //-----------------------------------------------------

        //------------------Поразрядные логические операции------------------
        int a = 59, b = 41;
        System.out.println("bitwise AND (&) operator: " + Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(a & b));
        System.out.println("bitwise OR (|) operator: " + Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(a | b));
        System.out.println("XOR (^) operator: " + Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(a ^ b));
        System.out.println("bitwise NOT (~) operator: ~" + Integer.toBinaryString(a) + " " + Integer.toBinaryString(~a));
        //-------------------------------------------------------------------

        //------------------Операции сдвига------------------
        int c = 612, negative_c = -612;
        System.out.println("Shift left by 4 bits: " + c + " << 4: " + Integer.toBinaryString(c << 4));
        System.out.println("Shift right by 4 bits for positive number: " + c + " >> 4: " + Integer.toBinaryString(c >> 4));
        System.out.println("Shift right by 4 bits for negative number: " + negative_c + " >> 4: " + Integer.toBinaryString(negative_c >> 4));
        System.out.println("Operation >>> always put zeros on the left: ");
        System.out.println("Shift right (>>>) by 4 bits for negative number: " + negative_c + " >> 4: " + Integer.toBinaryString(negative_c >>> 4));
        System.out.println("Shift right (>>>) by 4 bits for positive number: " + c + " >> 4: " + Integer.toBinaryString(c >>> 4));
        //---------------------------------------------------

    }
}
