public class Main {
    public static void main (String[] argc) {
        //Switch with byte type
        byte byteVar = 4;
        switch (byteVar) {
            case 4:
                System.out.println("The byteVar is 4. That`s good!");
                break;
            default:
                System.out.println("The byteVar isn`t 4. That`s bad(");
                break;
        }

        //Switch with short type
        short shortVar = 5;
        switch (shortVar) {
            case 1:
                System.out.println("The shortVar is 1");
                break;
            case 2:
                System.out.println("The shortVar is 2");
                break;
            case 3:
                System.out.println("The shortVar is 3");
                break;
            default:
                System.out.println("The shortVar is not equal to any of the values in case");
                break;
        }

        //Switch with int type
        int intVar = 7;
        switch (intVar) {
            case 1:
                System.out.println("The intVar is 1");
                break;
            case 2:
                System.out.println("The intVar is 2");
                break;
            case 3:
                System.out.println("The intVar is 3");
                break;
            case 4:
                System.out.println("The intVar is 4");
                break;
            case 5:
                System.out.println("The intVar is 5");
                break;
            case 6:
                System.out.println("The intVar is 6");
                break;
            case 7:
                System.out.println("The intVar is 7");
                break;
            default:
                System.out.println("The shortVar is not equal to any of the values in case");
                break;
        }

        //Switch with char type
        char charVar = 'X';
        switch (charVar) {
            case 'X':
                System.out.println("You project on the X-axis");
                break;
            case 'Y':
                System.out.println("You project on the Y-axis");
                break;
            case 'Z':
                System.out.println("You project on the Z-axis");
                break;
            default:
                System.out.println("Move to the coordinate system XYZ");
                break;

        }

        //Switch with String type
        String stringVar = "Elephant";
        switch (stringVar) {
            case "Elephant":
                System.out.println("This endemic is from Africa");
                break;
            case "Bison":
                System.out.println("This endemic is from Eurasia");
                break;
            case "Kangaroo":
                System.out.println("This endemic is from Australia");
                break;
            case "Emperor penguin":
                System.out.println("This endemic is from Antarctica");
                break;
            case "Capybara":
                System.out.println("This endemic is from South America");
                break;
            case "Sloth":
                System.out.println("This endemic is from North America");
                break;
            default:
                System.out.println("This animal isn`t live on earth or in air!");
                break;
        }

        //Switch with enum type
        enum Rifles {
            M4A1, AK74, FNFAl, GALIL, TYPE99, STURMGEWER;
        }
        Rifles enumVar = Rifles.AK74;
        switch (enumVar) {
            case M4A1:
                System.out.println("You`re American soldier");
                break;
            case AK74:
                System.out.println("You`re Russian soldier");
                break;
            case FNFAl:
                System.out.println("You`re Belgian soldier");
                break;
            case GALIL:
                System.out.println("You`re Israeli soldier");
                break;
            case TYPE99:
                System.out.println("You`re Chinese soldier");
                break;
            case STURMGEWER:
                System.out.println("You`re German soldier");
                break;
            default:
                System.out.println("Your country is undefined, solider!");
                break;
        }
    }
}
