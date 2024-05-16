public class Point {

        // write code here

    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        int xA = this.getX();
        int yA = this.getY();
        double distance = Math.sqrt((0-xA)*(0-xA)+(0-yA)*(0-yA));

        return distance;

    }

    public double distance(Point point){
        double xA = this.getX();
        double yA = this.getY();

        double xB = point.getX();
        double yB = point.getY();

        double distance = Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
        return distance;
    }

    public double distance(int x, int y){

        return this.distance(x,y);
    }
}

