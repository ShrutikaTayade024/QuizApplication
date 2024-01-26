import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    private static final int Red = 0;
	JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-100, 0, 700, 400);
        add(image);
        
        JLabel heading = new JLabel("Quiz Master");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 42));
        heading.setForeground(new Color(255,20,147));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(new Color(255,20,147));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(255,20,147));
        rules.setForeground(Color.black);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(255,20,147));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
