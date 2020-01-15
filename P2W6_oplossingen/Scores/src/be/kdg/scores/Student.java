package be.kdg.scores;

public class Student {
    private String naam;
    private int score;

    public Student(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;
        return score == student.score;
    }

    @Override
    public int hashCode() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%-12s -> %2d", naam, score);
    }

}
