//Make a variable to hold the X co-ordinate of the dot and set it to 
int h = 0;
void setup() {
  
    size(800, 200);background(#cbcbcb);
}

void draw() {
    //make it a nice color
    noStroke();
fill(#737373);
    //if the mouse is pressed...
    if(h<=800){
      if(mousePressed){
       background(#cbcbcb);
       ellipse(h,100,50,50);
       h=h+10;
       }
    }
      

    //... change the X co-ordinate so that the dot moves to the right
    
    
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
    //    (you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 
}

//import ddf.minim.*;
//boolean soundPlayed = false;
//void playSound() {
//    if (!soundPlayed) {
//        Minim minim = new Minim(this);
//        AudioSample sound = minim.loadSample("ding2.wav");
//        sound.trigger();
//        soundPlayed = true;
//    }
//}