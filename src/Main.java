import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2= new Car();
        car1.setMarka("BMW");
        car1.setMadel("X5");
        car1.setObem(3.2);
        car1.setColor("Черный");
        car2.setMarka("Leksus");
        car2.setMadel("570");
        car2.setObem(3.2);
        car2.setColor("Белый");
        Car[] mass = {car1,car2};
        for (int i = 0; i < mass.length; i++) {
            mass[i].rescar();}
        University university  = new University();
        University university1 = new University();
        university.setStudentname("Нурмухаммед");
        university.setStudentlastname("Медетов");
        university.setAge(20);
        university1.setStudentname("Камчыбек");
        university1.setStudentlastname("Турдакунов");
        university1.setAge(28);
        University[] stud = {university,university1};
        for (int i1 = 0; i1 < stud.length; i1++) {
            stud[i1].resuniver();



        } Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        School school1 = new School();
        School school2 = new School();
        System.out.println("Введите имя :");

        school1.setName(scanner.nextLine());
        System.out.println("Фамилия:");
        school1.setLastname(scanner.nextLine());
        System.out.println("Введите возраст:");
        school1.setAge(scanner.nextInt());
        System.out.println("Введите имя:");
        school2.setName(scanner1.nextLine());
        System.out.println("Фамилия:");
        school2.setLastname(scanner1.nextLine());
        System.out.println("Введите возраст:");
        school2.setAge(scanner1.nextInt());
        School[] massive = {school1,school2};
        for (int j = 0; j < massive.length; j++) {
            massive[j].resschool();

        }

    }
}