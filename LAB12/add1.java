class printArray<T>{
    private T[] array;
    printArray(T[] array){
        this.array = array;
    }
    void print()
    {
        for(T x:array){
            System.out.println(x);
        }
    }
}

class printArrayMain {
     public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray<Integer> intArr = new printArray<>(intArray);

        System.out.println("Printing Integer Array:");
        intArr.print();

        // String array
        String[] strArray = {"Apple", "Banana", "Orange", "Grapes"};
        printArray<String> strPrinter = new printArray<>(strArray);

        System.out.println("\nPrinting String Array:");
        strPrinter.print();

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArray<Double> doublePrinter = new printArray<>(doubleArray);

        System.out.println("\nPrinting Double Array:");
        doublePrinter.print();
    }
}