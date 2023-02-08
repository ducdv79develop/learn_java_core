package day2;

public class Condition {
    private int score;
    private int score2;
    public Condition() {
        int a = 10;
        int b = 7;
        setScore(a);
        setScore2(b);
        System.out.println(getScore());
        System.out.println(getScore2());
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public String getScore() {
        String scoreNew = String.valueOf(this.score);
        if (this.score < 5)
            return "Học sinh trung bình : " + scoreNew;
        else if (this.score < 8)
            return "Học sinh khá : " + scoreNew;
        else
            return "Học sinh giỏi : " + scoreNew;

    }

    public String getScore2() {
        String scoreNew = String.valueOf(this.score2);
        return switch (this.score2) {
            case 1, 2, 3, 4 -> "Học sinh trung bình : " + scoreNew;
            case 5, 6, 7 -> "Học sinh khá : " + scoreNew;
            default -> "Học sinh giỏi : " + scoreNew;
        };
    }
}
