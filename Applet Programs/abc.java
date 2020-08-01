import java.awt.*;
import java.applet.*;
/*
<applet code="abc" width=750 height=500>
</applet>
*/
public class abc extends Applet{
String mesg="welcome to Applet";
public void init(){
setBackground(Color.cyan);
setForeground(Color.red);
}
public void start(){
mesg=mesg+" Appy";
}
public void stop(){}

public void paint(Graphics g){
g.drawString(mesg,50,30);
}
}