package human.being;

import java.time.LocalDate;

class PersonClient {

        public static void main(String[] args){
            // instantiate at birth NAME/ BIRTHDATE --
            // IMMUTABLE CLASSES -- NOT CHANGEABLE
            Person p1 = new Person("Liliana", LocalDate.of(1995, 3, 10));
            System.out.println(p1);
            System.out.println();

            // Liliana is 27 years old
            System.out.printf("%s is %s years old", p1.getName(), p1.getAge());


        }
}