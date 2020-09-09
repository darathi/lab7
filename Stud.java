package Stud;
import java.util.*;
/**
 *
 * @author User
 */
public class Stud {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("ram","1",8.5));
        list.add(new student("ravi","2",8.7));
        list.add(new student("pooja","3",8.6));
        list.add(new student("keerthana","4",8.94));
        list.add(new student("dharani","5",8.64));
        list.add(new student("david","6",9.56));
        list.add(new student("dany","7",8.9));
        list.add(new student("freddy","8",8.8));
        list.add(new student("salmon", "9",8.7));
        list.add(new student("joeb","10",8.63));
        list.add(new student("esther","11",9));
        list.add(new student("ruth","12",9.8));
        list.add(new student("abigail","13",9.2));
        list.add(new student("mary","14",8.4));
        list.add(new student("martha","15",8.75));
        list.add(new student("jhon","16",9.67));
        list.add(new student("matthew","17",8.32));
        list.add(new student("mark","18",9.14));
        list.add(new student("luke","19",9.36));
        list.add(new student("peter","20",9.59));
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println("\nName in Descending Order:"+list);
        // TODO code application logic here
    }
    
}
class student
{
    String name,rollno;
    double cgpa;
    student(String n,String r,double c)
    {
        name=n;
        rollno=r;
        cgpa=c;
    }
    public String toString()
    {
        return "\nStudent Name:"+name+"\tRoll No:"+rollno+"\tCgpa:"+cgpa;
    }
}
class namesort implements Comparator<student>
{
    public int compare(student s1,student s2)
    {
        return s2.name.compareTo(s1.name);
    }
}
