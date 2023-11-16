
package menuClasss;
import java.util.Scanner;


class Menu {
    private String _WelcomeMessage;
    private String _GoodbyeMessage;
    private String[][] menuItems = {
        {"1) Create a new account"},
        {"2) Display Account Details"},
        {"3) Search by Account Number"},
        {"4) Deposit an amount"},
        {"5) Withdraw an amount"},
        {"6) Exit"}
    };
    
    /*************************************************************************************************
     * Author: Saba Begum
     * Method Description:This method is responsible for displaying the menu item to the user.
     * Method input parameters:N/A
     * Method return parameters:N/A
     * Assumptions:N/A
     * Create date:10/26/23
     *************************************************************************************************/
    public void getMenuItems() {
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i][0]);
        }
    }
    /*************************************************************************************************
     * Author: Saba Begum
     * Method Description:This method sets the welcome message.
     * Method input parameters:N/A
     * Method return parameters:N/A
     * Assumptions:N/A
     * Create date:10/26/23
     *************************************************************************************************/
    public void setWelcomeMessage(String message) {
        _WelcomeMessage = message;
    }
    /*************************************************************************************************
     * Author: Saba Begum
     * Method Description:This method sets the goodbye message.
     * Method input parameters:N/A
     * Method return parameters:N/A
     * Assumptions:N/A
     * Create date:10/26/23
     *************************************************************************************************/
    public void setGoodbyeMessage(String GM) {
        _GoodbyeMessage = GM;
    }
    /*************************************************************************************************
     * Author: Saba Begum
     * Method Description:This method is used to display the menu. It also as the user to enter their
     *  choice.
     * Method input parameters:N/A
     * Method return parameters:N/A
     * Assumptions:N/A
     * Create date:10/26/23
     *************************************************************************************************/
    public void menu() {
        System.out.println(_WelcomeMessage);
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i][0]);
        }
        System.out.print("Enter your choice: ");
    }
    /*************************************************************************************************
     * Author: Saba Begum
     * Method Description:This method is It's designed to provide a description or information about 
     * a specific menu item based on the user's choice.
     * Method input parameters:N/A
     * Method return parameters:N/A
     * Assumptions:N/A
     * Create date:10/26/23
     *************************************************************************************************/
    public String getMenuItemDescription(int choice) {
        if (choice >= 1 && choice <= menuItems.length) {
            return menuItems[choice - 1][1];
        }
        return "Invalid option";
    }
}


public class MenuClass {
	public static void main(String[] args) {
        Menu m = new Menu();

        m.setWelcomeMessage("Welcome to Bank Application");
        m.setGoodbyeMessage("Thank you for using the bank application");

        Scanner sc = new Scanner(System.in);
        int userinput = 0;

        while (userinput != 6) {
            m.menu();
            userinput = sc.nextInt();

            switch (userinput) {
                case 6:
                    System.out.println("Thank you for using the bank application");
                    break;
                default:
                    System.out.println("Not a valid option");
            }
        }

        sc.close();
    }
}


