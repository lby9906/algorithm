package week7.day4.java;


public class Pj_82612 {

    public long solution(int price, int money, int count) {
        long result = 0;
        long sum = 0;

        for (int i=0; i<count; i++) {
            sum += price;
            result += sum;
        }
        if (money < result) {
            return result - money;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Pj_82612 ss = new Pj_82612();
        ss.solution(3, 20, 4);
    }
}
