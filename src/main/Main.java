package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(-1);
        list.add(-5);
        list.add(12);
        list.add(13);
        //list.add("1");

        int sum = 0;
        for (Integer o : list) {
            sum += o;
        }
        http://www.berkut.mk.ua/download/pdf/oop_java/oop_lab_2_2017.pdf
        System.out.println(sum);
        System.out.println("---------------");
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            integerStack.push(list.get(i));
        }

        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop()+" ");
        }
        System.out.println();

        Person[] p2 = new Person[3];
        p2[0] = new Person(2, "Ivanov", 23);
        p2[1] = new Person(1, "Ivanov", 33);
        p2[2] = new Person(3, "Petrov", 21);
        for (int i=0; i<p2.length; i++) {
            if (i%2==0) {
                System.out.println(p2[i]);
            }
        }
//        List<Person> people = new ArrayList<>(Arrays.asList(p2));
//        people.add(new Person(4,"fd",45));
//
//        List<Person> list2 = people.stream()
//                .filter(p -> p.getName().startsWith("I"))
//                .filter(p->p.getAge()>23)
//                .collect(Collectors.toList());
        List<Person> people = Stream.of(p2).filter(predicate).collect(Collectors.toList());
        System.out.println(people);

    }

    Predicate<Person> predicate = new Predicate<>() {
        @Override
        public boolean test(Person person) {
            return person.getName().startsWith("I");
        }
    };
}
