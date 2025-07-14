package week2.day3;

public class Pj_120829 {

    public int solution(int angle) {
        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }


    public static void main (String[]args){
        Pj_120829 ss = new Pj_120829();
        ss.solution(180);
    }
}
