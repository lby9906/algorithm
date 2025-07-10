package day4.java;

public class Pj_120817 {

    public double solution(int[] numbers) {
        double result = 0;
        double sum = 0;
        for (int arr : numbers) {
            sum += arr;
        }
        result = sum / numbers.length;
        return result;
    }

    public static void main(String[] args) {
        Pj_120817 ss = new Pj_120817();
        ss.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
    }
}
