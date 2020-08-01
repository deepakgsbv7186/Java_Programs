import java.awt.*;
import java.applet.*;

/* <applet code="first" width=200 height=300></applet> */

public class first extends Applet{
String str;
public void init(){
str="Hello First Applet";
}

public void paint(Graphics g){
g.drawString(str,60,30);
}

}
