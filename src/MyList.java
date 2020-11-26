import java.util.ArrayList;

public class MyList<T extends Number> {
    private final ArrayList<T> arrayList;

    public MyList() {
        arrayList = new ArrayList<>();
    }

    public void add(T value) {
        arrayList.add(value);
    }

    public T getLargest() {
        T max;
        max = arrayList.get(0);
        for (T value : arrayList) {
            if (max.doubleValue() < value.doubleValue())
                max = value;
        }
        return max;
    }

    public T getSmallest() {
        T min;
        min = arrayList.get(0);
        for (T value : arrayList) {
            if (min.doubleValue() > value.doubleValue())
                min = value;
        }
        return min;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arrayList=" + arrayList +
                ", Minimum value is: " + getSmallest() +
                ", Maximum value is: " + getLargest() +
                '}';
    }
}

