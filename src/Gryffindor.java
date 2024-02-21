public class Gryffindor extends Hogwarts {
    private String faculty = "Gryffindor";
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return faculty + ": " + super.toString() + " " + ", nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery;
        // Во всех классах-факультетах вот так переопределен toString
    }

    public void compareStudentsDor (Gryffindor first, Gryffindor second) {
        int sumOfPropertiesFirst = first.getBravery() + first.getHonor() + first.getNobility();
        int sumOfPropertiesSecond = second.getBravery() + second.getHonor() + second.getNobility();
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(first.getName() + " лучший Гриффендорец, чем " + second.getName());
        } else if (sumOfPropertiesFirst == sumOfPropertiesSecond) {
            System.out.println(first.getName() + " и " + second.getName() + " одинаково хороши на своем факультете");
        } else {
            System.out.println(second.getName() + " лучший Гриффендорец, чем " + first.getName());
        }
    }
}
