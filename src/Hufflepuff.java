public class Hufflepuff extends Hogwarts {
    protected String faculty = "Hufflepuff";
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return faculty + ": " + super.toString() + " " + ", industriousness = " + industriousness + ", loyalty = " + loyalty + ", honesty = " + honesty;
    }

    public void compareStudentsPuff (Hufflepuff first, Hufflepuff second) {
        int sumOfPropertiesFirst = first.honesty + first.loyalty + first.industriousness;
        int sumOfPropertiesSecond = second.honesty + second.loyalty + second.industriousness;
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(first.getName() + " лучший Пуфендуец, чем " + second.getName());
        } else if (sumOfPropertiesFirst == sumOfPropertiesSecond) {
            System.out.println(first.getName() + " и " + second.getName() + " одинаково хороши на своем факультете");
        } else {
            System.out.println(second.getName() + " лучший Пуфендуец, чем " + first.getName());
        }
    }
}

