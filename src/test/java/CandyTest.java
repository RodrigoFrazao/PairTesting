import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CandyTest {

    @Test
    public void candyConstructorTest(){

        Candy candy = new Candy("gummyBears",5,1.20);
        Assertions.assertThat(candy.getName().equals("gummyBears"));
        Assertions.assertThat(candy.getPrice().equals(5));
        Assertions.assertThat(candy.getWeight().equals(1.20));
    }
}
