// AcademicClass.java


import java.util.*;


public class AcademicClass
{
  private Teacher teacher;
  private ArrayList<Student> students;

  public AcademicClass(Teacher teacher)
  {
    this.teacher = teacher;
    students = new ArrayList<Student>();
  }

  public void addStudent(String name, int favNum)
  {
    Student s = new Student(name, favNum);
    students.add(s);
  }

  public void classInfo()
  {
    System.out.println(teacher.getName() + ", " + teacher.getSubject() + " Class:");
    for(Student s : students)
      System.out.println("    " + s.getName() + ": favorite number - " + s.getFavNum());
  }

  public ArrayList<String> sameFavNum (int n)
  {
    ArrayList<String> ans = new ArrayList<String>();
    for(Student s : students)
    {
      if(s.getFavNum() == n)
        ans.add(s.getName());
    }

    return ans;
  }

  public ArrayList<String> oddFavNum ()
  {
    ArrayList<String> ans = new ArrayList<String>();
    for(Student s : students)
    {
      if(s.getFavNum() % 2 == 1)
        ans.add(s.getName());
    }

    return ans;
  }


  public static void main(String[] args)
  {
    Teacher teacher = new Teacher("Dr. Kessner", "Computer Science");
    AcademicClass classes = new AcademicClass(teacher);

    classes.addStudent("Sophia", 13);
    classes.addStudent("Linda", 4);
    classes.addStudent("Briley", 5);
    classes.addStudent("Jasmine", 4);

    classes.classInfo();

    ArrayList<String> same = classes.sameFavNum(4);

    System.out.println("\nfavorite number is 4: ");
    for(String s : same)
      System.out.println("    " + s);

    ArrayList<String> odd = classes.oddFavNum();

    System.out.println("favorite number is odd: ");
    for(String s : odd)
      System.out.println("    " + s);

  }
}
