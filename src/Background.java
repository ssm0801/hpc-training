import javax.swing.*;

public class Background {
    Background(JFrame main_frame){
        ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("images/background.jpg"));
        JLabel background_label = new JLabel(background);
        background_label.setBounds(0,0,1550,1060);
        main_frame.add(background_label);
    }

    public static void main(String[] args) {
    }
}
