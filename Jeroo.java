/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    
    public void plantCross() {
      start();
      quadrant();
      quadrant();
      quadrant();
      quadrant();
      finish();
    }
    public void quadrant(){
      plant3();
      turn(RIGHT);
      plant3();
      turn(LEFT);
      plant2();
      turn(LEFT);
    }
    public void start(){
      hop();
      hop();
      hop();
      hop();
      hop();
      turn(RIGHT);
      hop();
      hop();
      hop();
      turn(LEFT);
      hop();
      turn(RIGHT);
    }
    public void finish(){
      turn(RIGHT);
      hop();
    }
    
    // Put any helpermethods here
      public void plant3(){
      hop();
      plant();
      hop();
      plant();
      hop();
      plant();
    }
      public void plant2(){
      hop();
      plant();
      hop();
      plant();
    }
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
