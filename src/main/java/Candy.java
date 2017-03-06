/**
 * Created by dieterp on 6/03/2017.
 */
public class Candy {

    private String name;
    private double price;
    private double Weight;

    public Candy(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        Weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return Weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candy candy = (Candy) o;

        if (Double.compare(candy.price, price) != 0) return false;
        if (Double.compare(candy.Weight, Weight) != 0) return false;
        return name != null ? name.equals(candy.name) : candy.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(Weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
