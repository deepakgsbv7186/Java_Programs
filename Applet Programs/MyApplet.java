import java.applet.*;
import java.awt.*;

/* <applet code="MyApplet" width=200 height=100></applet> */

public class MyApplet extends Applet{
public void paint (Graphics g){
g.setColor(Color.blue);
g.drawString("Hello!....Hello!....Hello@",10,20);
}
}