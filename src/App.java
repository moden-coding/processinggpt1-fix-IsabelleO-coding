import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }

     @Override
     public void settings() {
         size(800, 600);
     }
 
     @Override
     public void draw() {
        background(173, 216, 230);

         fill(0, 0, 139);
         stroke(0);
         strokeWeight(10);
         triangle(600, 100, 700, 200, 500, 200);

         ellipse(50, 50, 100, 50);

         strokeWeight(3);
         line(100, 300, 600, 300);

         noStroke();
        rect(50, 50, 200, 550);

        fill(255, 0, 0);
        stroke(255, 0, 0);
        strokeWeight(5);
        ellipse(400,300, 50, 50);

     }


    


}
