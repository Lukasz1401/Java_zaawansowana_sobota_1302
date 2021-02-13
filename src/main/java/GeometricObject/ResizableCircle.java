package GeometricObject;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * (percent / 100);
    }

    //rezie(100)
    //rezie(50)
    //rezie(200);
}
