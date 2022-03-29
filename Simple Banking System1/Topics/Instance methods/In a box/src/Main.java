
class Box {

    double height;
    double width;
    double length;

    public double getVolume() {
        return this.height * this.width * this.length;
    }

    // Creating a new Box object and calling the instance method.
    /*public static void main(String[] args) {
        Box black = new Box();
        black.height = 10.5;
        black.width = 12.7;
        black.length = 20.1;
        System.out.println(black.getVolume());
    }*/
}