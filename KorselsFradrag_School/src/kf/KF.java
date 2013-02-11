package kf;

/**
 *
 * @author Patrick
 */
public class KF {

    private KFGUI kFGUI;

    public KF() {
        kFGUI = new KFGUI();
        kFGUI.setVisible(true);
    }

    public static double calculate(int kilometer) {
        if (kilometer < 120) {
            return (kilometer - 24) * 1.05;

        } else if (kilometer > 24) {
            return (kilometer - 24) * 2.10;


        } else {
            return 0;
        }


    }

    public static void main(String args[]) {
        new KF();
    }
}
