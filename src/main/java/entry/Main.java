/* вывести числа от 0 до 1000 кратные 3 не кратные 5 и сумма цифр которых меньше 10 */

package entry;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 != 0 && digitSum(i) < 10) {
                System.out.println(i);
            }
        }
    }

        private static int digitSum(int number) {
        int sum = 0;
        for (; number > 0; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }
//    static int digitSum(int number) {
//        int sum = 0;
//        String line = String.valueOf(number);
//        char[] charArray = line.toCharArray();
//        for (char c : charArray) {
//            sum += Character.getNumericValue(c);
//        }
//        return sum;
//    }

//    static int digitSum(int number) {
//        return (number == 0)
//                ? 0
//                : (number % 10) + digitSum(number / 10);
//    }
}


