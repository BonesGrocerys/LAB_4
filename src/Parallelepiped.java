
public class Parallelepiped {
    private final int a;
    private final int b;
    private final int c;
    private final int V;

    public Parallelepiped(int a1, int b1, int c1) {
        a = a1;
        b = b1;
        c = c1;
        V = a * b * c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getV() {
        return V;
    }

    @Override
    public String toString() {
        return "(" + a + ",  " + b + ",  " + c + ") - <" + V + ">";
    }
}


