import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] people, String person){
         Person[] peopleCopy = Arrays.copyOf(people, people.length + 1);
         Person newPerson = new Person(person);
         peopleCopy[people.length] = newPerson;
         return peopleCopy;
    }

    public static void main (String[] args){

        //EXERCISE 1
//        int[] numbers = {1, 2, 3, 4, 5};
//        String num = Arrays.toString(numbers);
//        System.out.println(num);
//
//        Person bob = new Person("bob");
//        Person mary = new Person("mary");
//        Person fred = new Person ("fred");
//
//        Person[] people = new Person[3];
//        people[0] = bob;
//        people[1] = mary;
//        people[2] = fred;
//
//        people = addPerson(people, "Gregory");
//
//        for (Person person : people){
//            System.out.println(person.getName());
//        }





    }
}
