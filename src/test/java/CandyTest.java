import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CandyTest {


    @Before
    public void setupTest(){
        Candy candy = new Candy("gummyBears",5,1.20);
    }


    @Test
    public void candyNameTest(){
        Assertions.assertThat(candy.getName().equals("gummyBears"));
    }

    @Test
    public void candyPriceTest(){
        Assertions.assertThat(candy.getPrice().equals(5));
    }

    @Test
    public void candyWeightTest(){
        Assertions.assertThat(candy.getWeight().equals(1.20));
    }
}
