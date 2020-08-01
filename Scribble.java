import java.applet.*; 
import java.awt.*; 
import java.awt.event.*;
/* <applet code="Scribble" width=500 height=500></applet> */
public class Scribble extends Applet implements MouseListener, 
                                            MouseMotionListener, 
                                            ActionListener { 
    int last_x = 0; 
    int last_y = 0; 
    Color current_color = Color.black; 
    Button clear_button = new Button("Clear");

    // This function is called initially, when the program begins 
    // executing.  It initializes the applet and adds components to it. 
    public void init() { 
        // Set the background color 
        this.setBackground(Color.white);

        // Add a clear button and a mouse listener to the applet 
        add(clear_button); 
        addMouseListener(this); 
        addMouseMotionListener(this); 
        clear_button.addActionListener(this); 
    }

    // Called when the user presses the mouse button to start a 
    // scribble.  Sets the values of variables last_x and last_y 
    // to mark the point of the click. 
    public void mousePressed(MouseEvent e) { 
       last_x = e.getX(); 
       last_y = e.getY(); 
    }

 // These four are unused by this program, but must be included 
 // with MouseListener 
    public void mouseReleased(MouseEvent e) { } 
    public void mouseClicked(MouseEvent e) { } 
    public void mouseExited(MouseEvent e) { } 
    public void mouseEntered(MouseEvent e) { }

    // Called when the user scribbles with the mouse button down 
    // Draws a line between the points (last_x, last_y) and (x, y) 
    public void mouseDragged(MouseEvent e) 
    { 
        int x = e.getX(); 
        int y = e.getY(); 
        Graphics g = this.getGraphics(); 
        g.drawLine(last_x, last_y, x, y); 
        last_x = x; 
        last_y = y; 
    }

    // This one is unused, but must be included with MouseMotionListener 
    public void mouseMoved(MouseEvent e) {}

    // Called when the user clicks the Clear button, and 
    // clears the graphics window. 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == clear_button) { 
            Graphics g = this.getGraphics(); 
            Rectangle r = this.bounds(); 
            g.setColor(this.getBackground()); 
            g.fillRect(r.x, r.y, r.width, r.height); 
        } 
    } 
}