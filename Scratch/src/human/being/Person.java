package human.being;

import java.time.LocalDate;
import java.time.Period;
/*
* An immutable class. More accurately, this is a class definition written
* in such a way that instances of it (Person objects) cannot have their properties
* changed once created. Getters but no setters!
*
*
* IMMUTABLE CLASS
* NOT CHANGEABLE
* CANNOT SET ONCE CREATED
* MUST ASSIGN PROPERTIES AT INSTANTIATION OF OBJECT/PERSON-OBJECT
*
 */



class Person {
    // properties (fields opr instances variables)
    // IMMUTABLE CLASSES/ ASSIGN DIRECTLY (NO SETTERS)
    private String name;
    private LocalDate birthDate;

    // ctors
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //accessor methods

    /** Returns
     * person's age in wholeyears
     * can be derived from BIRTHDATE and TODAYS DATE
     * Get Period of time (whole years) between 2 dates
     */
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        Period period = Period.between(getBirthDate(), LocalDate.now());
        return period.getYears();
    }

    //private isBirthDateValid???

    public String toString(){
        // another concat method String.format()
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}