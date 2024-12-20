class compareThree {
    public static <T extends Comparable<T>> T findLargest(T a, T b, T c) {
        T largest = a;

        if (b.compareTo(largest) > 0) {
            largest = b;
        }

        if (c.compareTo(largest) > 0) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {

        // Integer
        Integer largestInt = findLargest(10, 15, 7);
        System.out.println("Largest Integer: " + largestInt);

        // Double
        Double largestDouble = findLargest(3.9, 8.2, 5.7);
        System.out.println("Largest Double: " + largestDouble);

        // String
        String largestString = findLargest("anu", "vedu", "vivo");
        System.out.println("Largest String: " + largestString);
    }
}