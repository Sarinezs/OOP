class ComparableCircle extends Circle{

    ComparableCircle(double Radius) {
        super(Radius);
    }


   @Override
    public boolean equals(Object a) {
        if (a instanceof ComparableCircle) {
            ComparableCircle otherCircle = (ComparableCircle) a;
            return this.radius == otherCircle.radius;
        }
        return false;
    }

    // @Override
    // public int compareTo(ComparableCircle otherCircle) {
    //     if(this.radius == otherCircle.radius){
    //         return 1;
    //     }
    //     return 0;
    // }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

}