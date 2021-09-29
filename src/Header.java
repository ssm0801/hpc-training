import javax.swing.*;

public class Header {
    Header(JFrame main_frame){
        ImageIcon header = new ImageIcon(ClassLoader.getSystemResource("images/header.png"));
        JLabel header_label = new JLabel(header);
        header_label.setBounds(0,0,1550,100);
        main_frame.add(header_label);
    }

    public static void main(String[] args) {
    }
}
