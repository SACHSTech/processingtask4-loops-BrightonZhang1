import processing.core.PApplet;

/**
  * Description: This program is designed to sketch different drawings in each quadrant.
  * @author: B. Zhang
  */

public class Sketch extends PApplet {

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
    // Quad 1
    for(int lineX = width / 2 / 10; lineX <= width / 2 - (width / 2 / 10); lineX += width / 2 / 10){
      stroke(0);
      line(lineX, 0, lineX, height / 2);
      line(0, lineX, width / 2, lineX);
    }
    // Quad 2
    for(int circleY = height / 13; circleY <= height / 2 - height / 13; circleY += height / 13){
      for(int circleX = (width / 2) + width / 13; circleX <= width - width / 13; circleX += width / 13){
        fill(231, 84, 128);
        ellipse(circleX + width / 13 / 2, circleY + height / 13 / 2, width / 2 / 9, height / 2 / 9);
      }
    }
    // Quad 3
    for(int lineX = 0; lineX <= width / 2; lineX ++){
      stroke(0 + lineX);
      line(lineX, height / 2, lineX, height);
    }
    // Quad 4
    stroke(0);
    translate(width/2 + width/4, height/2 + height/4);
    
    for (int flower = 0; flower <= 8; flower+=1) {
      rotate(radians(45));
      fill(255, 95, 31);
      ellipse(0, 0, width/20, height/3);  
    }

    fill(0, 100, 0);
    ellipse(0, 0, width/8, height/8);
  }
}