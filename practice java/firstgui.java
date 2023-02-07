import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Graphics;

public class firstgui {

    
    public firstgui() {


        
        JFrame frame = new JFrame();
        GridLayout experimentLayout = new GridLayout(1, 0);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(experimentLayout);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test Gui");
        frame.pack();
        frame.setVisible(true);

    }

    //public class looks(Graphics graphics){
    //    graphics.drawLine(4, 50, 90, 100);
    //}

    public static void main(String[] args) throws Exception{
        new firstgui();

    }
}
