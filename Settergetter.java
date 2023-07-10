class Circle{
    private int rad,area;
    public void setradius(int r){
        rad=r;
    }
    public int getradius(){
        return rad;
    }
    public void setarea(int a){
        area=a;
    }
    public int getarea(){
        return area;
    }
}

public class Settergetter {
    
    public static void main(String[] args) {
       Circle obj=new Circle();
       obj.setarea(123);
       obj.setradius(12);
       System.out.println(obj.getradius());
       System.out.println(obj.getarea());
    }
}
