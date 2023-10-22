
interface Movable{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();

}

class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    
    public MovableCircle(int xin, int yin, int xSpeedin, int ySpeedin, int radius_in){
        center = new MovablePoint(xin, yin, xSpeedin, ySpeedin);
        radius = radius_in;
    }

    public String toString(){
        return "\nx : "+center.x+"\ny : "+center.y;
    }

    public void getMovablePoint(){
        
        System.out.println(center);
    }

    @Override
    public void moveUp() {
        System.out.println("UP");
        center.y -= center.ySpeed;
        getMovablePoint(); 
    }

    @Override
    public void moveDown() {
        System.out.println("DOWN");
        center.y += center.ySpeed;
        getMovablePoint();
    }

    @Override
    public void moveLeft() {
        System.out.println("LEFT");
        center.x -= center.xSpeed;
        getMovablePoint();
    }

    @Override
    public void moveRight() {
        System.out.println("RIGHT");
        center.x += center.xSpeed;
        getMovablePoint();
    }

}

class MovablePoint implements Movable{
    int x = 0;
    int y = 0;
    int xSpeed = 2;
    int ySpeed = 2;

    public MovablePoint(int xin, int yin, int xSpeedin, int ySpeedin){
        x = xin;
        y = yin;
        xSpeed = xSpeedin;
        ySpeed = ySpeedin;
    }

    public String toString(){
        return "x : "+x+" , y : "+y;
    }

    @Override
    public void moveUp() {
        y -= ySpeed; 
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}


public class no6 {
    public static void main(String[] args){
        MovableCircle mc = new MovableCircle(0, 0, 2, 2, 20);
        mc.moveUp();
        mc.moveDown();
        mc.moveLeft();
        mc.moveRight();
    }
}
