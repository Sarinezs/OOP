public abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    protected GeometricObject(){

    }

    protected GeometricObject(String Color, boolean Filled){
        this.color = Color;
        this.filled = Filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String Color){
        this.color = Color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean Filled){
        this.filled = Filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}




