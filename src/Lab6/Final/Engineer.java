package Lab6.Final;

public class Engineer extends Person implements Trainable{
    private String specialty;

    public Engineer(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    void work() {
        System.out.println("Engineer " + getName() + " is working on " + this.specialty + " project");
    }

    @Override
    public void attendTrain(String topic) {
        System.out.println("Engineer " + getName() + " is attending training on " + topic );
    }

    @Override
    public void feedback() {
        Trainable.super.feedback();
    }
}
