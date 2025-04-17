
package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JTextField textField;

    JPasswordField jPasswordField;

    JButton b1,b2;



     public login (){




            // Username Label
            JLabel nameLabel = new JLabel("Username");
            nameLabel.setBounds(40, 20, 100, 30);
            nameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
            nameLabel.setForeground(Color.BLACK);
            add(nameLabel);

            // Username TextField
            textField = new JTextField();
            textField.setBounds(150, 20, 150, 30);
            textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
            textField.setBackground(new Color(255, 179, 204));
            add(textField);

            // Password Label
            JLabel passwordLabel = new JLabel("Password");
            passwordLabel.setBounds(40, 70, 100, 30);
            passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
            passwordLabel.setForeground(Color.BLACK);
            add(passwordLabel);

            // Password Field
            jPasswordField = new JPasswordField();
            jPasswordField.setBounds(150, 70, 150, 30);
            jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
            jPasswordField.setBackground(new Color(255, 179, 204));
            add(jPasswordField);


            ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource( "icon/login.png"));
            Image i1 = imageIcon.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
            ImageIcon imageIcon1 = new ImageIcon(i1);
            JLabel label = new JLabel(imageIcon);
            label.setBounds(320,-30,400,300);
            add(label);

            b1 = new JButton("LOGIN");
            b1.setBounds(40, 140, 120, 30);
            b1.setFont(new Font("serif",Font.BOLD,15));
            b1.setBackground(Color.BLUE);
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            add(b1);


            b2 = new JButton("CANCEL");
            b2.setBounds(180, 140, 120, 30);
            b2.setFont(new Font("serif",Font.BOLD,15));
            b2.setBackground(Color.BLUE);
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
            add(b2);



            getContentPane().setBackground(new Color(109,164,170));
            setTitle("Login Form");
            setSize(750, 350);
            setLocation(400,270);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                try {
                    conn c = new conn();
                    String user = textField.getText();
                    String pass = jPasswordField.getText();

                    String q = "SELECT * FROM login WHERE ID = '" + user + "' and PSD = '" + pass + "'";
                    ResultSet resultSet = c.statement.executeQuery(q);

                    if (resultSet.next()) {
                        new Reception(); // ya phir new Dashboard(); jaha redirect karna ho
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password");
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }else {

                System.exit(10);

            }


    }

    public static void main(String[] args) {
            new login();

    }
}