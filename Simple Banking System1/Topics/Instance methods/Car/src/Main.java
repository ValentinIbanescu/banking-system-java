
class Car {

    int yearModel;
    String make;
    int speed;
    final int speedUnit = 5;

    public void accelerate() {
        this.speed += this.speedUnit;
    }

    public void brake() {
        this.speed -= this.speedUnit;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}