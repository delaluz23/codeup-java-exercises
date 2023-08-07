import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));


        Person[] people = {
                new Person("joe"),
                new Person("jojo"),
                new Person("mojo")
        };

        Person[] people2 = addPerson(people, new Person("Joseph"));
        System.out.println(Arrays.toString(people2));
        for (int i = 0; i < people2.length; i++) {
            System.out.println(people2[i].getName());
        }
    }


    public static Person[] addPerson(Person[] people, Person pplToAdd) {
        Person[] people2 = Arrays.copyOf(people, people.length + 1);
        people2[people2.length - 1] = pplToAdd;
        System.out.println("people2");
        return people2;
    }
}
