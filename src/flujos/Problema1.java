package flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person p = new Person("Juan", "García", 1968);
        personas.add(p);

        p = new Person("María", "García", 1985);
        personas.add(p);

        long cuantas = personas.stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .count();

        System.out.println(cuantas);

    }
}
