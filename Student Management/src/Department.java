public class Department{
    String name,hod;
    Department(String h,String n){
        hod=h;
        name=n;
    }
    void display(){
        System.out.println(name+" | "+hod);
    }
}