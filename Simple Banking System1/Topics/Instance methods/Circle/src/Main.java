
class Circle {

    double radius;

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // Create an instance of Circle and call the instance methods;
    /*public static void main(String[] args) {
        Circle one = new Circle();
        one.radius = 1.00;
        System.out.println(one.getLength());
        System.out.println(one.getArea());
    }*/
}