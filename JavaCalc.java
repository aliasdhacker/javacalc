import java.util.Scanner;

/**
 * Java calculator.
 * 
 * This application is a demonstration of some basic Java functionality.
 * 
 * @author aliasdhacker
 * 
 */
public class JavaCalc {
    static String xS = new String(), yS = new String(), operS = new String();
    static Scanner s = new Scanner(System.in);

    /**
     * int values are initialized to 0 by default, (not complex types like
     * Integer, they are initialized to null.) See this page for a reference for
     * information on primitive value initial types. {@link http
     * ://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html}
     */
    static int oper, xI, yI;

    public static void main(String[] args) {
        System.out
                .println("Simple Java 2 Operator Command Line Calculator!\n\tBy:Andrew Carr\n\nCTRL+C to quit");

        while (!xS.equalsIgnoreCase("quit") || !yS.equalsIgnoreCase("quit")
                || !operS.equalsIgnoreCase("quit")) {

            while (xS.equals("")) {
                System.out.print("Enter Var 1? ");
                xS = s.nextLine().trim();                
            }
            while (yS.equals("")) {
                System.out.print("Enter Var 2? ");
                yS = s.nextLine().trim();
            }

            while (operS.equalsIgnoreCase("")) {
                System.out.println("\nvar1=" + xS + " var2=" + yS + "\n"
                        + "\tSelect an oper:" + "\n\t\t1 = +\n"
                        + "\n\t\t2 = -\n" + "\n\t\t3 = /\n" + "\n\t\t4 = *\n"
                        + "\n\t\t5 = %\n" + "\n\tChoice? ");

                operS = s.nextLine();
            }

            if (operS.equalsIgnoreCase("quit"))
                continue;

            System.out.println("Parsing...");
            try {
                xI = Integer.valueOf(xS);
                yI = Integer.valueOf(yS);
                oper = Integer.valueOf(operS);
            } catch (Exception e) {
                System.out.println("Values entered are bad, try again..."
                        + e.getMessage());
						xS="";
						yS="";
						operS="";
                continue;
            }

            switch (oper) {
            case 1:
                // addition
                try {
                    System.out.println("\n\n" + xI + " + " + yI + " = "
                            + String.valueOf(xI + yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 2:
                // sub
                try {
                    System.out.println("\n\n" + xI + " - " + yI + " = "
                            + String.valueOf(xI - yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 3:
                // div
                try {
                    System.out.println("\n\n" + xI + " / " + yI + " = "
                            + String.valueOf(xI / yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 4:
                // mult
                try {
                    System.out.println("\n\n" + xI + " * " + yI + " = "
                            + String.valueOf(xI * yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            case 5:
                // mod
                try {
                    System.out.println("\n\n" + xI + " % " + yI + " = "
                            + String.valueOf(xI % yI));
                    System.out.println("Press enter to continue...");
                    s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error performing calculation -- "
                            + e.getMessage());
                }
                break;
            default:
				System.out.println("Invalid choice...");
            }

            operS = "";
			xS = "";
			yS = "";

        }

        s.close();
    }
}