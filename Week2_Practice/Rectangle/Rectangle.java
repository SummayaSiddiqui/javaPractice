public class Rectangle {
    // attributes 
    private float length;
    private float width;
    // constructor
    // 1. default constructor is only accessible when tou don't have your own constructor defined.
    // 2. no argument constructor
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // 3. parametrised constructor
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    // methods

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return this.width;
    }

    public double getArea() {
        return (this.length * this.width);
    }

    public double getPerimeter() {
        return ((2 * this.length) + (2 * this.width));
    }

    public String toString() {
        return ("The coordinates of the rectangle are: (" + this.length + ", " + this.width + ")");
    }







    // written this method after line 18 to display and have an idea that what we are doing.
    // public void display() {
    //     System.out.println(this.length + ", " + this.width);
    // }

}