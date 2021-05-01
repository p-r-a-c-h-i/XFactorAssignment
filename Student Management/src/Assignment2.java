import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ch;
        boolean x=true;
        List<Student> sl=new ArrayList<>();
        List<Department> dl=new ArrayList<>();
        while(x){
            System.out.println("1. Add Student \n2. Display Student \n3. Add Department \n4. Display Department \n5. Delete Student \n6. Delete Department \n7. Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    String n,g,a;
                    int age;
                    sc.nextLine();
                    System.out.println("Enter name of student : ");
                    n=sc.nextLine();
                    System.out.println("Enter age of student : ");
                    age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter gender of student : ");
                    g=sc.nextLine();
                    System.out.println("Enter address of student : ");
                    a=sc.nextLine();
                    sl.add(new Student(n,age,g,a));
                    break;
                case 2:
                    System.out.println("Name of student |Age |Gender |Address : ");
                    for(Student s:sl)
                    {
                        s.display();
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter name of Department : ");
                    String na, hod;
                    na=sc.nextLine();
                    System.out.println("Enter name of HOD : ");
                    hod=sc.nextLine();
                    dl.add(new Department(hod, na));
                    break;
                case 4:
                    System.out.println("Name of Department| HOD");
                    for(Department dt: dl){
                        dt.display();
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Enter name of student you want to delete");
                    String name=sc.nextLine();
                    for(Student s:sl){
                        if(s.n==name)
                            s=null;
                            sl.remove(s);
                            break;
                    }
                    System.gc();
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Enter name of Department you want to delete");
                    String nam=sc.nextLine();
                    for(Department s:dl){
                        if(s.name==nam)
                            s=null;
                            dl.remove(s);
                            break;
                    }
                    System.gc();
                    break;
                case 7:
                    x=false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("___________________________________________");
        }
        sc.close();
        }
}
