public class max_subarray_sum {

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                flag = true;
            }
        }

        if (flag == false) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > ms) {
                    ms = numbers[i];
                }
            }
            System.out.println("Max Sum = " + ms);
            return;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                cs += numbers[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
        }

        System.out.println("Max Sum = " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -6, -1, -3 };
        kadanes(numbers);
    }
}
