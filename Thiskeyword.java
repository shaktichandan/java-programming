public class Thiskeyword {
    int id;
    int regd;
    int roll;
    Thiskeyword(int id,int regd,int roll){
        this.id=id;
        this.regd=regd;
        this.roll=roll;
    }
    void show(){
        System.out.println(id+" "+regd+" "+roll);
    }
    public static void main(String[] args) {
        Thiskeyword obj=new Thiskeyword(2, 3, 5);
        obj.show();
    }
}
