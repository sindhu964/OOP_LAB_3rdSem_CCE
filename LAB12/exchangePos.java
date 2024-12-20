class exchangePosition{
    public static void main(String[] args) {
        Integer obj1[] = {1,2,3,4,5,6,7,8,9};
        Character obj2[] = {'a','e','i','o','u'};
        exchange(obj1,1,3);
        exchange(obj2,'a','o');
    }
    public static <T> void exchange(T[] array,T num1,T num2){
        int index1=-1,index2=-1;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(num1)&&index1<0){
                index1=i;
            }
            if(array[i].equals(num2)&&index2<0){
                index2=i;
            }
            if(index1>-1&&index2>-1){
                break;
            }
        }
        if(index1>-1&&index2>-1){
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        System.out.println("After exchanging");
        for(T x:array)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}