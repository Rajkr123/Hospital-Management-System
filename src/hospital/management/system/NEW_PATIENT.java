package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class NEW_PATIENT  extends JFrame {

    JComboBox comboBox;
    JTextField textFieldNumber, textName,textFieldDisease, textFieldDeposite;
    JRadioButton r1, r2;

    Choice c1;
    JLabel date;
    JButton b1 , b2;

    NEW_PATIENT(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon  = new ImageIcon(ClassLoader.getSystemResource( "icon/patient.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550,150,200,200);
        panel.add(label);

        JLabel labelName  = new JLabel("NEW PATIENT FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(labelName);

        JLabel labelID = new JLabel(" ID ");
        labelID.setBounds(35,76,200,14);
        labelID.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelID.setForeground(Color.WHITE);
        panel.add(labelID);

        comboBox = new JComboBox(new String[] {"  ","Aadhar Card","Voter Id","Driving License"});
        comboBox.setBounds (271,73,150,20);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(comboBox);


        JLabel labelNumber = new JLabel(" NUMBER");
        labelNumber.setBounds(35,111,200,14);
        labelNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelNumber.setForeground(Color.WHITE);
        panel.add(labelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add (textFieldNumber);


        JLabel labelName1 = new JLabel(" NAME:");
        labelName1.setBounds(35,151,200,14);
        labelName1.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelName1.setForeground(Color.WHITE);
        panel.add(labelName1);

        textName  = new JTextField();
        textName.setBounds(271,151,150,20);
        panel.add (textName);

        JLabel labelGender = new JLabel(" GENDER:");
        labelGender.setBounds(35,191,200,14);
        labelGender.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelGender.setForeground(Color.WHITE);
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(Color.white);
        r1.setBounds (271,191,80,15);
        r1.setBackground(new Color(109,164,170));
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setForeground(Color.white);
        r2.setBounds (350,191,80,15);
        r2.setBackground(new Color(109,164,170));
        panel.add(r2);


        JLabel labelDisease = new JLabel(" DISEASE:");
        labelDisease.setBounds(35,231,200,16);
        labelDisease.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelDisease.setForeground(Color.WHITE);
        panel.add(labelDisease);

        textFieldDisease  = new JTextField();
        textFieldDisease.setBounds(271,231,150,20);
        panel.add (textFieldDisease);


        JLabel labelRoom = new JLabel(" ROOM:");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelRoom.setForeground(Color.WHITE);
        panel.add(labelRoom);

        JLabel labelDate = new JLabel(" TIME:");
        labelDate.setBounds(35,316,200,14);
        labelDate.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelDate.setForeground(Color.WHITE);
        panel.add(labelDate);

        Date date1 = new Date();

        date = new JLabel(" "+ date1);
        date.setBounds(271,316,250,14);
        date.setFont(new Font("Tahoma", Font.BOLD, 15));
        date.setForeground(Color.WHITE);
        panel.add(date);


        JLabel labelDeposite= new JLabel(" DEPOSITE:");
        labelDeposite.setBounds(35,359,200,17);
        labelDeposite.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelDeposite.setForeground(Color.WHITE);
        panel.add(labelDeposite);

        textFieldDeposite  = new JTextField();
        textFieldDeposite.setBounds(271,359,150,20);
        panel.add (textFieldDeposite);






        setSize(850,550);
        setLayout(null);
        setLocation(300,250);
        setVisible(true);

    }
    public static void main (String[] args){
        new NEW_PATIENT();
    }
}
