package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2,comboBox3,comboBox4,comboBox5;

    JTextField textPan,textAdhar;

    JRadioButton r1,r2,r3,r4;

    JButton next;

    String fromno;

    Signup2(String fromno){
        super("APPLICATION FROM No: ");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank 2.png"));
        Image i2 =  i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.fromno = fromno;

        JLabel l1 = new JLabel("Page 2 :- ");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,170,120,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,220,120,30);
        add(l5);

        String income [] = {"Null","<1,50,000","<2,50,000","5,00,000","Uptp 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,270,150,30);
        add(l6);

        String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,330,150,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,16));
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setBounds(350,330,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,20));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9 = new JLabel("ADHAR Number : ");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,450,200,30);
        add(l9);

        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Raleway",Font.BOLD,20));
        textAdhar.setBounds(350,450,320,30);
        add(textAdhar);

        JLabel l10= new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,510,200,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,510,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,510,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11= new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,550,200,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,550,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(450,550,100,30);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);


        JLabel l12= new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(680,10,100,30);
        add(l12);

        JLabel l13= new JLabel(fromno);
        l13.setFont(new Font("Raleway",Font.BOLD,16));
        l13.setBounds(760,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
      }

      public void actionPerformed(ActionEvent e){
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String adhar = textAdhar.getText();

        String scitizen = null;
        if((r1.isSelected())) {
            scitizen = "Yes";
        }
        else if((r2.isSelected())){
            scitizen = "No";
        }
        String eAccount   = null;
        if((r3.isSelected())) {
            eAccount = "Yes";
        } else if ((r4.isSelected())) {
            eAccount = "No";
        }
        try {
            if(textPan.getText().equals("")||textAdhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                Connector c1 = new Connector();
                String q = "insert into signuptwo values('"+fromno+"','"+rel+"','"+cate+"','"+inc+"','"+education+"','"+occupation+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new  Signup3(fromno);

                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();

        }





      }








     public static void main(String[] args){
          new Signup2(" ");

    }
}
