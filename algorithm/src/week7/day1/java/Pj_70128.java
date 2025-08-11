package week7.day1.java;

public class Pj_70128 {

    public int solution(int[] a, int[] b) {
        int result = 0;

        for (int i=0; i<a.length; i++) {
            result += a[i]*b[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Pj_70128 ss = new Pj_70128();
        ss.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
    }
}
