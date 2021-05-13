import java.awt.*;
import java.awt.event.InputEvent;

public class Navigation {
    final int[]referenecke={188,105};
    final int[]start={referenecke[0]+230,referenecke[1]+780};
    final int[]home={start[0]-60,start[1]};
    final int[]pause={start[0]+60,start[1]};
    final int[]untermenu={referenecke[0]+10,referenecke[1]+10};
    final int[]meineLandroids={referenecke[0]+20,referenecke[1]+120};
    final int[]landroid1={referenecke[0]+20,referenecke[1]+80};
    final int[]landroid2={referenecke[0]+20,referenecke[1]+150};

    Navigation(){
    }
    public void aktualiesieren() {
        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.mouseMove(referenecke[0]+100,referenecke[1]+100);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(referenecke[0]+100,referenecke[1]+200);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(3000);
    }
    public void landroidAuswahl(int a){
        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.mouseMove(untermenu[0],untermenu[1]);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(500);
        robot.mouseMove(meineLandroids[0],meineLandroids[1]);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(500);
        if (a==1){
            robot.mouseMove(landroid1[0],landroid1[1]);
        }else if (a==2){
            robot.mouseMove(landroid2[0],landroid2[1]);
        }
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    public void landroidStarten(int a){
        landroidAuswahl(a);

        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.delay(1000);
        robot.mouseMove(start[0],start[1]);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
    }

    public void landroidHome(int a){
        landroidAuswahl(a);

        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.delay(1000);
        robot.mouseMove(home[0],home[1]);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(60000);
    }

    public void landroidnPause(int a){
        landroidAuswahl(a);

        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.delay(1000);
        robot.mouseMove(pause[0],pause[1]);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
    }


    public boolean getAmMaehen(int a){

        aktualiesieren();

        if (getAmLaden(a) && getAmZurückfahren(a) && !getIfFehler(a)){
            return true;
        }
        return false;
    }
    public boolean getAmLaden(int a){
        landroidAuswahl(a);
        aktualiesieren();


        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        //robot.mouseMove(referenecke[0]+349,referenecke[1]+690);
        Color refFarbe=robot.getPixelColor(referenecke[0]+230,referenecke[1]+700);
        Color auswahlFarb=robot.getPixelColor(referenecke[0]+349,referenecke[1]+690);
       // System.out.println(refFarbe.getBlue());
        //System.out.println(auswahlFarb.getBlue());



        if (refFarbe.getBlue()!=auswahlFarb.getBlue() && !getIfFehler(a)){
            return true;
        }
        return false;
    }
    public boolean getAmZurückfahren(int a){
        landroidAuswahl(a);
        aktualiesieren();


        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        //robot.mouseMove(referenecke[0]+405,referenecke[1]+718);
        Color refFarbe=robot.getPixelColor(referenecke[0]+230,referenecke[1]+700);
        Color auswahlFarb=robot.getPixelColor(referenecke[0]+405,referenecke[1]+718);
       //System.out.println(refFarbe.getBlue());
       // System.out.println(auswahlFarb.getBlue());



        if (refFarbe.getBlue()!=auswahlFarb.getBlue() && !getIfFehler(a)){
            return true;
        }
        return false;
    }
    public boolean getIfFehler(int a){
        landroidAuswahl(a);
        aktualiesieren();

        Robot robot= null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Color refFarbe=robot.getPixelColor(referenecke[0]+250,referenecke[1]+700);
        if (refFarbe.getGreen()<50){
            return true;
        }
        return false;

    }
}
