import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Frame {
    private static JFrame frame;
    private static JLabel label;
    public static void display(BufferedImage image){
        if (frame==null){
            frame=new JFrame();
            frame.setTitle("Bild");
            frame.setSize(image.getWidth(),image.getHeight());
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            label=new JLabel();
            label.setIcon(new ImageIcon(image));
            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.setLocale(null);
            frame.pack();
            frame.setVisible(true);
        }else label.setIcon(new ImageIcon(image));
    }
}
