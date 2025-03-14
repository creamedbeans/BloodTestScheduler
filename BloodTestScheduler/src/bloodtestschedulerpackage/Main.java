package bloodtestschedulerpackage;

public class Main {
    public static void main(String[] args) {
        // Create and show RegistrationGUI
        RegistrationGUI regGUI = new RegistrationGUI();
        regGUI.setVisible(true);

        // Create and show ManagementGUI
        ManagementGUI mgGUI = new ManagementGUI();
        mgGUI.setVisible(true);
    }
}