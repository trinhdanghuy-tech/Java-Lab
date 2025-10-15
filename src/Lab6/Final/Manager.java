package Lab6.Final;

public class Manager extends Person implements Trainable{
    private int teamSize;

    public Manager(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println("Manager " + getName() + "is managing a team of " + this.teamSize + " people.");
    }

    @Override
    public void attendTrain(String topic) {
        System.out.println("Manager " + getName() + "is attending management training on " + topic);
    }

    @Override
    public void feedback() {
        Trainable.super.feedback();
    }
}
