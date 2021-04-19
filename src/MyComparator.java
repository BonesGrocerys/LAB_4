import java.util.Comparator;
public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Parallelepiped obj1 = (Parallelepiped) o1;
        Parallelepiped obj2 = (Parallelepiped) o2;
        if (obj1.getV() < obj2.getV()) {
            return -1;
        } else {
            if (obj1.getV() > obj2.getV()) {
                return 1;
            } else {
                if (obj1.getA() < obj2.getA()) {
                    return -1;
                } else {
                    if (obj1.getA() > obj2.getA()) {
                        return 1;
                    } else {
                        if (obj1.getB() < obj2.getB()) {
                            return -1;
                        } else {
                            if (obj1.getB() > obj2.getB()) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
