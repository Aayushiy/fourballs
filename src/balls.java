import processing.core.PApplet;

public class balls extends PApplet {
    public static final float HEIGHT=420;
    public static final int WIDTH= 640;
    float circle_1,circle_2,circle_3,circle_4;
    float speed=2;

    public static void main(String[] args) {
        PApplet.main("balls", args);
    }

    public void settings() {
        size(WIDTH ,640);
    }

    public void setup(){
        background(255);

    }

    public void draw(){

        fill(51);
        stroke(101);
        ellipse(circle_1,HEIGHT/5,10,10);
        ellipse(circle_2,(HEIGHT/5)*2,20,20);
        ellipse(circle_3,(HEIGHT/5)*3,30,30);
        ellipse(circle_4,(HEIGHT/5)*4,40,40);
        circle_1=circle_1+ speed;
        circle_2=circle_2+ 2*(speed);
        circle_3=circle_3+ 3*(speed);
        circle_4=circle_4+ 4*(speed);
        if(circle_1>640)
            circle_1=circle_1-speed;
        if(circle_2>640)
            circle_2=circle_2-2*(speed);
        if(circle_3>640)
            circle_3=circle_3-3*(speed);
        if(circle_4>640)
            circle_4=circle_4-4*(speed);

    }
}


