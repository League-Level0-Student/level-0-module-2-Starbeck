 // create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int a = 100;
    int b = 100;
    int c = 50;
    void setup() {
      //set the size of your sketch
    size(300,300);
    background(#cdcdcd);
    
    }
    
    void draw() {
      //set the background color of your sketch
      noStroke();
      fill(#6a016a);
      //c=50;
      //draw an ellipse. Make sure it fits in the window.
      ellipse(a,b,c,c);
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     int distance=getDistance(mouseX,mouseY,a,b);
      //print the distance variable
    //println(distance);
      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance<=25){
        background(#cdcdcd);
        a = (int)random(301);
        b = (int)random(301);
        }
        //8b.  set the x and y of the ellipse to a random location on the window
       //}else
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }