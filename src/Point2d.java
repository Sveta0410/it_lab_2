/**
 * двумерный класс точки.
 **/
public class Point2d {
/** координата X **/
    double xCoord;
/** координата Y **/
    double yCoord;
/** Конструктор инициализации **/
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
/** Конструктор по умолчанию. **/
    public Point2d () {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }
/** Возвращение кооринаты X **/
    public double getX () {
        return xCoord;
    }
/** Возвращение кооринаты Y **/
    public double getY () {
        return yCoord;
    }
/** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }
/** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }
}