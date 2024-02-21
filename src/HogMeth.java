public class HogMeth {
    public void printStudents(Hogwarts student) {
        System.out.println(student);
    }

    public void compareAnyStudentsM(Hogwarts first, Hogwarts second) {
        if (first.getPowerOfMagic() > second.getPowerOfMagic()) {
            System.out.println(first.getName() + " обладает большей силой Магии, чем " + second.getName());
        } else if (first.getPowerOfMagic() == second.getPowerOfMagic()) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе Магии");
        } else {
            System.out.println(second.getName() + " обладает большей силой Магии, чем " + first.getName());
        }
    }

    public void compareStudentsT(Hogwarts first, Hogwarts second) {
        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println(first.getName() + " трансгрессирует дальше, чем " + second.getName());
        } else if (first.getTransgressionDistance() == second.getTransgressionDistance()) {
            System.out.println(first.getName() + " и " + second.getName() + " трансгрессируют на одинаковое расстояние");
        } else {
            System.out.println(second.getName() + " трансгрессирует дальше, чем " + first.getName());
        }
    }

}