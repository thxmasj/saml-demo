import org.junit.Test;

/**
 * Created by thomas on 19/10/14.
 */
public class ActAsTest {

    @Test
    public void generateActAsString() {
        UsernameTokenCallbackHandler h = new UsernameTokenCallbackHandler();
        String token = h.getUsernameTokenString("alice", "ecila");
        System.out.println(token);
    }
}
