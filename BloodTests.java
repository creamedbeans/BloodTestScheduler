package bloodtests;

public class BloodTests {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true); // Open RegisterGUI on startup
            }
        });
    }
}