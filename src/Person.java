/**
 * This class models a person. There's a lot going on here, but we can
 * summarize it as follows:
 *
 * A person has a name, a deepest darkest secret, and is or is not trustworthy.
 *
 * A person can tell another person their deepest darkest secret and can hear
 * another person's deepest darkest secret. However, if a person is not
 * trustworthy, they will betray the person and share their secret.
 */
public class Person {

    /*
        This public property is accessible (and modifiable) from any "outside"
        code. For example, the Main class can read both of these properties. IF
        a Person is not trustworthy, their betrayFriend() method gives their
        friend a mean nickname.
     */
    public String name;

    /*
        These two properties are private. They are accessible only within the
        a particular instance of the Person class. An example of this can be
        seen in the tellSecret() and listenToSecret() methods below.
t
        Because the isTrustworthy property is private, no code outside of an
        instance of a Person can know if an instance of a Person is trustworthy.

        Person 1 doesn't know if Person 2 is trustworthy.
     */
    private String deepestDarkestSecret;
    private boolean isTrustworthy;

    /**
     * This public constructor sets all four properties, both public and
     * private. This demonstrates that a constructor, or any code in a block can
     * access the public and private properties of that class. (But only that
     * instance of the class.)
     *
     * Note that the constructor receives four arguments. These are put into the
     * constructor block's local scope. These are only accessible within the
     * constructor. No other function or constructor, inside or outside the
     * class, even in the same instance, can read these variables. Additionally,
     * they only exist while the constructor is being executed. That means each
     * time the constructor is executed, different instances of these values
     * exist in memory, even if they're the same values.
     *
     * Local variables have precedence when Java looks up variables. This is why
     * properties in this constructor must be prefixed with `this`. Without it,
     * Java would assume we were referencing the variables in the local scope.
     *
     * @param name The name of the person
     * @param deepestDarkestSecret The person's secret
     * @param isTrustworthy Whether the person is trustworthy or not.
     */
    public Person(String name, String deepestDarkestSecret, boolean isTrustworthy) {
        this.name = name;
        this.deepestDarkestSecret = deepestDarkestSecret;
        this.isTrustworthy = isTrustworthy;
    }

/**
 * This method allows a Person instance to tell a different Person instance
 * its secret. Note that the person 2 can't read person 1's secret directly,
 * and vice versa. A person must volunteer their secret.
 *
 * The tellSecret() method is public so any code "outside" or "inside"
 * person can invoke it. In this example, the Main class invokes this
 * method.
 *
 * When invoked, the method receives a Person to tell their secret to via an
 * argument named friend. The friend is placed into the local scope of the
 * method. The local scope only exists while the method is being executed
 * and is only accessible within the method's body. No code other than this
 * method can access this variable and only while it's being executed.
 *
 * The Person class also exposes a public method named listenToSecret().
 * Because it's public, the tellSecret() method can invoke it on the friend.
 * Take note that this Person CANNOT invoke private methods or read private
 * properties of different Person instances. IE: Person Fred cannot read
 * whether or not person Susan is trustworthy, nor can Fred invoke Susan's
 * betrayFriend() method.
 *
 * Because the deepestDarkestSecret property is private, this Person
 * instance can choose to pass it to the friend. However, the friend cannot
 * forcefully read it.
 *
 * One other thing of note is that the "this" scope is being passed to the
 * friend's listenToSecret() method. It might seem like this would provide
 * access to this person's private data (IE: the deepestDarkestSecret is
 * stored in the "this" scope), but it won't. The "this" scope is just a
 * variable pointing to the Person instance itself. If the "this"
 * scope is returned or passed to any other object, it's just passing a
 * reference to the instance of the object. Any "outside" code still can't
 * access private data.
 *
 * @param friend A friend to tell a secret to.
 */


        /*
            This tells the friend this person's secret. The listenToSecret()
            method will return true of the secret is kept safe. It will return
            false if the friend betrays this person's secret.
         */


            /*
                The friend has kept this person's secret. Note that this person
                can read their own properties (in this case they are public) and
                their friend's public properties. However, it can't read the
                friend's private properties.

                The say() method is  private, so no "outside" code can invoke it.
             */


/**
 * This method receives a friend and their secret as arguments. These
 * arguments end up in the method's local scope. You should pause and
 * consider for a moment why we are receiving both the friend and their
 * secret as separate arguments. This is because the friend's secret is
 * private. This person can't read the other person's secret. Instead, the
 * other person volunteers it in the tellSecret() method.
 *
 * If this person is trustworthy this method will return true.
 *
 * @param friend The friend whose secret is being listened to.
 * @param secret The friend's secret
 * @return a boolean indicating whether or not this person betrayed the friend.
 */


        /*
            This checks if this person is trustworthy. Because the isTrustworthy
            property is private, only this person knows.
         */


            /*
                This person IS trustworthy. Note that this shows how this
                instance of Person can read its properties and the public
                properties of other instances of Person.
             */



            /*
                This person IS NOT trustworthy. Because of this, this person
                instance will invoke its private betrayFriend() method. Only
                this instance of Person can invoke it. Other instances or other
                code "outside" of this instance of Person cannot force this
                person to betray a friend.
             */



/**
 * This method betrays the provided friend by sharing the provided secret.
 * Because this method is private, only this instance of this person can
 * invoke it. The two arguments end up in the method's local scope.
 *
 * This private method invokes the say() method, which is also private.
 *
 * @param soonToBeEnemy This is the friend being betrayed
 * @param secret This is the friend's secret
 */



        /*
            This chunk of code assigns the soon-to-be-enemy a mean nickname. It
            does so by updating the person's public name property. Because this
            property is not hidden behind getters and setters, the Person has
            no control over the property.
         */



/**
 * This private message makes this person say the specified message.
 * s such, a person instance is the only one who can invoke this method.
 * Nothing "outside" this class, even other instances of Person, can invoke
 * it.
 *
 * @param message The message to say.
 */


