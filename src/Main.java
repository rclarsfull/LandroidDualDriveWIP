import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Main {



    public static void main(String []args){
        final int[]referenecke={153,148};
        final int[]start={referenecke[0]+230,referenecke[1]+780};
        final int[]home={start[0]-60,start[1]};
        final int[]pause={start[0]+60,start[1]};
        final int[]untermenu={referenecke[0]+20,referenecke[1]+10};
        final int[]meineLandroids={referenecke[0]+20,referenecke[1]+120};
        final int[]landroid1={referenecke[0]+20,referenecke[1]+80};
        final int[]landroid2={referenecke[0]+20,referenecke[1]+120};
        Navigation navigation=new Navigation();

        System.out.println(navigation.getAmZurückfahren(1));
        System.out.println(navigation.getAmZurückfahren(2));
        System.out.println(navigation.getAmMaehen(1));
        System.out.println(navigation.getAmMaehen(2));
        System.out.println(navigation.getAmLaden(1));
        System.out.println(navigation.getAmLaden(2));



            //BufferedImage bild= robot.createScreenCapture(new Rectangle(1920,1080));
            //Frame.display(bild);




    }
}
