package Movable;

public class MovableCircle implements Movable {

    MovablePoint circleCenter;
    double radius;

    public MovableCircle() {
        circleCenter = new MovablePoint();
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        circleCenter = new MovablePoint(x, y, xSpeed, ySpeed);
    }


    @Override
    public void moveUp() {
        this.circleCenter.moveUp();
    }

    @Override
    public void moveDown() {
        this.circleCenter.moveDown();
    }

    @Override
    public void moveLeft() {
        this.circleCenter.moveLeft();
    }

    @Override
    public void moveRight() {
        this.circleCenter.moveRight();
    }
}
