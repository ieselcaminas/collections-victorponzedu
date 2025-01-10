package comparable;

public class Person  implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    @Override
    public String toString(){
        return this.getFirstName() + ", " + this.getLastName()  + " - " + this.getBirthYear();
    }
    @Override
    public int compareTo(Person other) {
        return other.getBirthYear() - this.getBirthYear();
        // O así
        // return Integer.compare(other.getBirthYear(), this.birthYear);

        /*//Si mi altura es igual a la del otro, devuelve 0. Por tanto, no se toca
        if (this.getLastName().compareTo(other.getLastName())==0) {
            return 0;
        } else if (this.getLastName().compareTo(other.getLastName()) > 0) {
            //Si mi altura es mayor, pasa adelante
            return 1;
        } else {
            //Si mi altura es menor, pasa atrás
            return -1;
        }*/
    }
}
