public class Main {
    public static void main(String[] args) {

        //Task 1
        MyList<Byte> byteList = new MyList<>();
        byteList.add((byte)-20);
        byteList.add((byte)12);
        byteList.add((byte)120);
        System.out.println(byteList);

        MyList<Integer> intList = new MyList<>();
        intList.add(-12345);
        intList.add(6782);
        intList.add(129);
        System.out.println(intList);

        MyList<Double> doubleList = new MyList<>();
        doubleList.add(128.99);
        doubleList.add(129.01);
        doubleList.add((double)129);
        System.out.println(doubleList);

    }
}

