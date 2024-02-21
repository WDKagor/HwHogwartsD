public class Ravenclaw extends Hogwarts {
    protected  String faculty = "Ravenclaw";
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return faculty + ": " + super.toString() + " " + ", mind = " + mind + ", wisdom = " + wisdom + ", wit = " + wit + ", creativity = " + creativity;
    }

    public void compareStudentsClow (Ravenclaw first, Ravenclaw second) {
        int sumOfPropertiesFirst = first.wisdom + first.wit + first.mind + first.creativity;
        int sumOfPropertiesSecond = second.wisdom + second.wit + second.mind + second.creativity;
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(first.getName() + " лучший Когтевранец, чем " + second.getName());
        } else if (sumOfPropertiesFirst == sumOfPropertiesSecond) {
            System.out.println(first.getName() + " и " + second.getName() + " одинаково хороши на своем факультете");
        } else {
            System.out.println(second.getName() + " лучший Когтевранец, чем " + first.getName());
        }
    }
}

