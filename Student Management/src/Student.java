public class Student{
    String n,g,a;
    int age;
    Student(String name,int ag, String gender, String address)
    {
        n=name;
        age=ag;
        g=gender;
        a=address;
    }
    void display()
    {
        System.out.println(n+" | "+age+" | "+g+" | "+a);
    }
}