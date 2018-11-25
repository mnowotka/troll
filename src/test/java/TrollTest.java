import junit.framework.TestCase;

public class TrollTest extends TestCase {

    public void testProxy(){
        // simple troll
        Troll troll = new SimpleTroll();
        troll.attack(); // The troll tries to grab you!
        troll.fleeBattle(); // The troll shrieks in horror and runs away!

        // change the behavior of the simple troll by adding a decorator
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack(); // The troll tries to grab you! The troll swings at you with a club!
        clubbedTroll.fleeBattle(); // The troll shrieks in horror and runs away!
    }
}

