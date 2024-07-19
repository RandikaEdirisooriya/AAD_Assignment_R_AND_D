import java.io.Serializable;

class Obj implements Serializable {
    private int one;
    private String two;

    public Obj(int one, String two) {
        this.one = one;
        this.two = two;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "one=" + one +
                ", two='" + two + '\'' +
                '}';
    }
}
