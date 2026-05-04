import java.util.ArrayList;
public class Main {

addStudent("Alice");
addStudent("Bob");
viewStudents();
deleteStudent("Alice");
countStudents();
searchStudent(String name);


 static ArrayList<String> students = new ArrayList<>();
 public static void main(String[] args) {
 System.out.println("Student Record Manager");
 }

 static void addStudent(String name) {
 students.add(name);
 System.out.println(name + " added.");
}
static void viewStudents() {
 System.out.println("Student List:");
 for (String s : students) {
 System.out.println(s);
 }
}
static void deleteStudent(String name) {
 students.remove(name);
 System.out.println(name + " removed.");
}
static void countStudents() {
 System.out.println("Total students: " + students.size());
}

static void searchStudent(String name){
    for (String s: students){
        if (s.equalIgnoreCase(name)){
            System.out.println("Found :" + s);
        }
        System.out.println("Not Found");
    }
}
{
static void updateStudent(String oldName, String newName){
    int index = students.indexOf(oldName);
    if (index!= -1)
        students.set(index,newName);
}

}
}
