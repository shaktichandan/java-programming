import javax.swing.*;
import java.awt.*; //above two are for design window
import java.awt.event.*;//control the event
class Myapp extends JFrame
{
    Container cn;
    JLabel t,t1,t2,t3,t4;
    JTextField tt3;
    JPasswordField tt4;
    ImageIcon m;
    public Myapp(String tnm){
        cn=getContentPane();
        setTitle(tnm);
       cn.setBackground(Color.YELLOW);
       cn.setForeground(Color.GREEN);

        setLayout(null);
        m=new ImageIcon("shakti.png");
       // t=new JLabel(" Welcome to my application");//this line is written instead of next two line
       t= new JLabel();
       t.setText("welcome to my application ");
       t.setForeground(Color.RED); //use for text color
         t.setBounds(300,50,200,100);
       //t.setBounds(100,50,100,300);
        cn.add(t);
        t1=new JLabel("INDIA");
        t1.setBackground(Color.GREEN);
        t1.setForeground(Color.BLACK);
        t1.setBounds(900,50,200,30);
        cn.add(t1);
        t2=new JLabel(m);
        t2.setBounds(0,0,1300,1200);
        cn.add(t2);
        t3=new JLabel(" Full name");
        t3.setBounds(50,100,100,30);
        cn.add(t3);
        t4=new JLabel(" Password");
        t4.setBounds(50,150,100,30);
        cn.add(t4);


        tt3=new JTextField("Last middle First Name");
        tt3.setBounds(200,100,200,30);
        cn.add(tt3);
        tt4=new JPasswordField();
        tt4.setBounds(200,150,200,30);
        cn.add(tt4);

        setSize(1000,1200);
        setVisible(true);
       // JLabel     //image icon is a abstract class use to convert any image to icon //jTextField abstarct class use to create 
                                     //editable text fill, JTextField(),
        //jLabel()          //ImageIcon(image name) //JPassword field is an abstract class create editable text field,....
                                                            // ....in which data willbe hidden from user
        //jLabel(String s)  //
        //jLabel(Icon m)

    }
}
public class swing {
    public static void main(String[] args) {
        new Myapp(" My window");
    }
}
