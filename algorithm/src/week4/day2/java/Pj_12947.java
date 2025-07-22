package week4.day2.java;

public class Pj_12947 {

    public boolean solution(int x) {
        int changeInt = 0;
        int sum = 0;

        String changeStr = String.valueOf(x);
        String[] split = changeStr.split("");
        for (int i=0; i<split.length; i++) {
            changeInt = Integer.parseInt(split[i]);
            sum += changeInt;
        }
        System.out.println(sum);

        if (x % sum == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Pj_12947 ss = new Pj_12947();
        ss.solution(12);
    }
}
