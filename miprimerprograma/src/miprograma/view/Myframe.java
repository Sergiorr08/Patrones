package miprograma.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Myframe extends JFrame {
    public JTextField tf = new JTextField();
    public JButton b= new JButton("Click here");

    
    public Myframe(){
        init();

    }

    public void init(){
        this.setSize(400,400);
        this.setLayout(null);
        this.add(tf);
        this.add(b);
        this.setVisible(true);

    }
}
