import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HogMeth hogwarts = new HogMeth();

        Gryffindor harry = new Gryffindor("Harry Potter", 100, 92, 82, 97, 88);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 99, 97, 78, 92, 85);
        Gryffindor ron = new Gryffindor("Ron Weasley", 54, 74, 98, 80, 80);
        Hufflepuff zachariah = new Hufflepuff("Zachariah Smith", 71, 65, 87, 90, 87);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 76, 67, 92, 95, 98);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 82, 74, 89, 99, 95);
        Ravenclaw zhou = new Ravenclaw("Zhou Chang", 86, 86, 86, 99, 91, 99);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 92, 77, 90, 83, 89, 92);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 88, 99, 94, 84, 91, 97);
        Slytherin draco = new Slytherin("Draco Malfoy", 100, 98, 92, 100, 95, 100, 100);
        Slytherin graham = new Slytherin("Graham Montague", 95, 88, 98, 90, 94, 96, 100);
        Slytherin gregory = new Slytherin("Gregory Goyle", 89, 84, 92, 95, 94, 99, 100);

        System.out.println("Список студентов Hogwarts:");

        hogwarts.printStudents(harry);
        hogwarts.printStudents(hermione);
        hogwarts.printStudents(ron);
        hogwarts.printStudents(zachariah);
        hogwarts.printStudents(cedric);
        hogwarts.printStudents(justin);
        hogwarts.printStudents(zhou);
        hogwarts.printStudents(padma);
        hogwarts.printStudents(marcus);
        hogwarts.printStudents(draco);
        hogwarts.printStudents(graham);
        hogwarts.printStudents(gregory);

        System.out.println("  ");
        System.out.println("Сравнение студентов по силе Магии:");
        hogwarts.compareAnyStudentsM(zachariah, draco);

        System.out.println("  ");
        System.out.println("Сравнение студентов по Трангрессии:");
        hogwarts.compareStudentsT(zachariah, draco);

        System.out.println("  ");
        System.out.println("Сравнение студентов внутри факультетов:");
        ron.compareStudentsDor(hermione, ron);// Вызываю метод сравнения Гриффендорцев через случайный объект класса Gryffindor
        cedric.compareStudentsPuff(zachariah, cedric);
        zhou.compareStudentsClow(padma, marcus);
        draco.compareStudentsRin(draco, gregory);





    }
}
