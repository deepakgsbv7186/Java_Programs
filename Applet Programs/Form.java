import java.awt.*;
import java.applet.*;
/* 
<applet code="Form" width=350 height="400">
</applet>
*/
public class Form extends Applet{
TextField tf1,tf2,tf3,tf4;
Label l1,l2,l3,l4,l5;
Button b;
public void init(){
l1=new Label("Registration Form");
l1.setFont(new Font("Verdana",Font.BOLD,24));
l2=new Label("Full Name: ");
l2.setFont(new Font("Verdana",Font.BOLD,14));
l3=new Label("City: ");
l3.setFont(new Font("Verdana",Font.BOLD,14));
l4=new Label("State: ");
l4.setFont(new Font("Verdana",Font.BOLD,14));
l5=new Label("Mobile Number: ");
l5.setFont(new Font("Verdana",Font.BOLD,14));

tf1=new TextField(15);
tf2=new TextField(15);
tf3=new TextField(15);
tf4=new TextField(15);

b=new Button("Submit");
setLayout(null);
l1.setBounds(65,50,250,50);
add(l1);
add(l2);
add(tf1);
add(l3);
add(tf2);
add(l4);
add(tf3);
add(l5);
add(tf4);
add(b);
}
}
