void setup(){
        size(600,600);
        background(0,255,0);
  
   PImage face = loadImage("Scorch_titan.png");
 
   face.resize(width,height);
    background(face);
 



}
void draw(){
  
  if(mouseX<217){
    mouseX = 217;
  }
   if(mouseY<196){
    mouseY = 196;
  }
  if(mouseY>226){
    mouseY = 226;
  }
  if(mouseX>248){
    mouseX = 248;
  }
  
  
  
  if(mousePressed){
    println(mouseX+" "+mouseY);
    
    
    
  }
  fill(255,255,255);
  ellipse( 234, 210, 45, 45);
  fill(0,0,0);
      ellipse(mouseX,mouseY, 10, 10);
    
        
    }
     
