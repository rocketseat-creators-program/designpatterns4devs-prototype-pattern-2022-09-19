package animation;

import animation.model.Person;
import animation.model.PersonModels;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private static List<Person> frames = new ArrayList<Person>();

    public static void animate() throws InterruptedException {
        System.out.println("*********************************");
        System.out.println("* ");
        System.out.println("* Start the dance");
        System.out.println("* ");
        System.out.print("*********************************");
        Thread.sleep(3000);
        for(Person frame: frames) {
            frame.draw();
            Thread.sleep(500);
        }
        System.out.println("**********************");
        System.out.println("* ");
        System.out.println("* Finish.");
        System.out.println("* ");
        System.out.print("**********************");
    }

    public static Person addLeft(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.left();
        frames.add(person);
        return person;
    }

    public static Person addRight(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.right();
        frames.add(person);
        return person;
    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        PersonModels samples = new PersonModels();

//		Person person = samples.get("firstMan");
        Person person = samples.get("secondMan");
        frames.add(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        animate();
    }

}
