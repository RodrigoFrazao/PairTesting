import org.assertj.core.api.Assertions;
import org.junit.Test;

public class UserTest {

    @Test
    public void userAsAPieceOfCandy(){

        User dieter = new User("Dieter",new Candy("gummyBears", 5, 1.20));
        Assertions.assertThat()
    }
}
