package Lab6.Final;

public class Main {

    public static void main(String[] args) {
        Engineer engineer = new Engineer("Huy", 20, "không biết");
        Manager mng = new Manager("H", 30, 6);

        Person[] people = {engineer, mng};

        for (Person person : people){
            person.introduce();
            person.work();

            if (person instanceof Trainable){
                Trainable test = (Trainable) person;
                test.attendTrain("learn Java");
                test.feedback();
                System.out.println();
            }
        }
    }
}
