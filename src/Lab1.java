// пример ввода координат 0.2 4 6 0.3 5 0.9 4 6 7
public class Lab1 {
    //создание трёх точек по трём координатам(x,y,z) и вывод на экран площади треугольника, построенного по этим точкам
    public static void main(String[] args){

        Point3d point1 = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Point3d point2 = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        Point3d point3 = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));

        if (point1.compare(point2) || point1.compare(point3) || point2.compare(point3)){
            System.out.println("Точки введены некорректно. Одна из точек равна другой");
        } else {
            System.out.println("Площадь заданного треугольника составляет " + computeArea(point1, point2, point3));
        }

    }
    // расчёт площади треугольника, образованного тремя точками
    static double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double side12 = point1.distanceTo(point2);
        double side13 = point1.distanceTo(point3);
        double side23 = point2.distanceTo(point3);
        double perimeter = side12 + side13 + side23;
        return Math.sqrt(perimeter/2 * (perimeter/2 - side12) * (perimeter/2 - side13) * (perimeter/2 - side23));
    }
}
