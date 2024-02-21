public class Slytherin extends Hogwarts {
    private String faculty = "Slytherin";
    private int cunning;
    private int determination;
    private int ambition;
    private int savvy;
    private int thirstForPower;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int savvy, int thirstForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.savvy = savvy;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getSavvy() {
        return savvy;
    }

    public void setSavvy(int savvy) {
        this.savvy = savvy;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return faculty + ": " + super.toString() + " " +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", savvy=" + savvy +
                ", thirstForPower=" + thirstForPower;
    }

    public void compareStudentsRin (Slytherin first, Slytherin second) {
        int sumOfPropertiesFirst = first.thirstForPower + first.determination + first.savvy + first.cunning + first.ambition;
        int sumOfPropertiesSecond = second.thirstForPower + second.determination + second.savvy + second.cunning + second.ambition;
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(first.getName() + " лучший Слизерианец, чем " + second.getName());
        } else if (sumOfPropertiesFirst == sumOfPropertiesSecond) {
            System.out.println(first.getName() + " и " + second.getName() + " одинаково хороши на своем факультете");
        } else {
            System.out.println(second.getName() + " лучший Слизерианец, чем " + first.getName());
        }
    }
}