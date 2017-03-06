import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class UserTest {

    @Test
    public void userAsAPieceOfCandy(){

        User dieter = new User("Dieter",new Candy("gummyBears", 5, 1.20));
        Assertions.assertThat(dieter.getName().Equals("Dieter"));
        Assertions.assertThat(dieter.getCandy().getName().equals("gummyBears"));
    }

    @Test
    public void userAsACandyBag(){
        List<Candy> candyBag = new List<Candy>();
        Candy candy = new Candy("gummyBears", 5, 1.20);
        candyBag.add(candy);
        User dieter = new User("Dieter",candyBag);
        Assertions.assertThat(dieter.getCandyBag()).contains(candy);
    }
}
