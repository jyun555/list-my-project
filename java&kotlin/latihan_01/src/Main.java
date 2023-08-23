public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,9,10};
        int rslt = 0;
        System.out.println(array.length);
        do {
            rslt += 1;
            System.out.println(array[rslt-1]);

        } while (array.length <= 9);
    }
}