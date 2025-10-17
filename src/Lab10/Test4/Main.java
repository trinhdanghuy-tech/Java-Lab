package Lab10.Test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void doSomething(List<? super Student> list){
        for (Object o : list){
            System.out.println(o);
        }
//        list.add(new Person());
        list.add(new Student());
        list.add(new GraduateStudent());
    }


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(Arrays.asList(new Student()));
        List<GraduateStudent> list2 = new ArrayList<>(Arrays.asList(new GraduateStudent()));
        List<Person> list3 = new ArrayList<>(Arrays.asList(new Person()));

        doSomething(list);
//        doSomething(list2);
        doSomething(list3);
    }
}

