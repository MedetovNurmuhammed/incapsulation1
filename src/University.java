public class University {
    private String studentname;
    private  String studentlastname;
    private  int age;
    public String getStudentname(){
        return  studentname;
    }
    public  void setStudentname(String studentname){
        this.studentname = studentname;
    }
    public String getStudentlastname(){
        return studentlastname;
    }
    public void setStudentlastname(String studentlastname){
        this.studentlastname = studentlastname;
    }
    public int getAge(){
        return  age;
    }
    public  void setAge(int age){
        this.age = age;
    }
    public void resuniver(){
        System.out.println("Студенты:");
        System.out.println("studentname = " + studentname);
        System.out.println("studentlastname = " + studentlastname);
        System.out.println("age = " + age);
    }
}
