package be.kdg.scores;


import java.util.*;

public class Studenten {
    private List<Student> data = new ArrayList<>();

    public Studenten() {
        data.add(new Student("Marieke", 13));
        data.add(new Student("Marjolein", 18));
        data.add(new Student("Marijke", 15));
        data.add(new Student("Marie Laure", 14));
    }

    // Maak gebruik van een TreeSet in combinatie met een Comparator!
    public String getScores() {
        Set<Student> studentenSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getScore() - s1.getScore();
            }
        });

        studentenSet.addAll(data);
        StringBuilder builder = new StringBuilder();
        for (Student student : studentenSet) {
            builder.append(student).append('\n');
        }
        return builder.toString();
    }
}
