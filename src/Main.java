/**
 * Created by JamesHartanto on 3/7/17.
 */

public class Main {
    public static void main(String[] args){
        /*
            These two lines demonstrate that the Main class (and all "outside"
            code) can access the public constructor of Person. If there was a
            private constructor it would only be accessible inside the Person
            class.
         */
        Person person1 = new Person("Leon Ernesto 1", "doesn't really like dogs", true);
        Person person2 = new Person("Paulina Cato 2", "is actually a weasel disguised as a person", false);

        /*
            The next two lines demonstrate how the Main class has access to
            public properties of the Person class (name and gender). We cannot
            access the private properties (deepestDarkestSecret and isTrustworthy).
         */
        System.out.println("main() created a person named " + person1.name + ".");
        System.out.println("main() created a person named " + person2.name + ".");
        System.out.println("----");

        /*
            The next lines show that the Main class can invoke the public method
            tellSecret() of the Person class.
         */
        person2.tellSecret(person1);
        System.out.println("----");
        person1.tellSecret(person2);
    }
}