import javax.swing.*;

public class hpc_portal {
    public static void main(String[] args) {

        JFrame main_frame = new JFrame();

//        background of portal
        new Background(main_frame);

//        it will display the heading of CDAC
        new Header(main_frame);

//
        new Content(main_frame);

        main_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setLayout(null);
        main_frame.setVisible(true);
    }
}
