import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        String[] people = {
                "joe",
                "jose",
                "joseph"
        };
        String[] people2 = addPerson(people, "jo");
        System.out.println(Arrays.toString(people2));
    }
        public static String[] addPerson(String[] people, String pplToAdd) {
            String[] people2 = Arrays.copyOf(people, people.length + 1);
            people2[people2.length-1] = pplToAdd;
            return people2;
        }
}
