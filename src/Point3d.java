/**
 * трёхмерный класс точки.
 **/
public class Point3d extends Point2d{
    /** координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d ( double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    /** Конструктор по умолчанию. **/
    public Point3d () {
//Вызовите конструктор с тремя параметрами и определите источник.
        this(0.0, 0.0, 0.0);
    }

    /** Возвращение кооринаты Z **/
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты X. **/

    /** Установка значения координаты Z. **/
    public void setZ ( double val) {
        zCoord = val;
    }

    public boolean compare(Point3d that){
        double thisX = this.getX();
        double thisY = this.getY();
        double thisZ = this.getZ();
        double thatX = that.getX();
        double thatY = that.getY();
        double thatZ = that.getZ();
        return thisX == thatX && thisY == thatY && thisZ == thatZ;
    }

    public double distanceTo(Point3d that) {
        Point3d point1 = new Point3d();
        Point3d point2 = new Point3d();
        double dist = Math.sqrt(Math.pow(this.getX()-that.getX(), 2)
                +Math.pow(this.getY()-that.getY(), 2)
                +Math.pow(this.getZ()-that.getZ(), 2));

        return Math.round(dist*100.0)/100.0;
    }
}
