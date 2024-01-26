
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Master");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 30));
        heading.setForeground(new Color(255,20,147));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setForeground(Color.white);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. The quiz is open to participants with a basic understanding of programming concepts." + "<br><br>" +
                "2. The quiz consists  multiple-choice questions to assess theoretical knowledge " + "<br><br>" +
                "3. Each question has a specified time limit. The total quiz duration will be communicated before the quiz starts." + "<br><br>" +
                "4. Points are awarded for correct answers, and there are no penalties for incorrect answers.." + "<br><br>" +
                "5. Every questions carry 10 points" + "<br><br>" +
                "6. Participants must complete the quiz individually. " + "<br><br>" +
                "7. Collaboration with others or using external resources is strictly prohibited" + "<br><br>" +
                 "         Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(255,20,147));
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(255,20,147));
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
     new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
