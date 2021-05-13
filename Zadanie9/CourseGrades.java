package zadanie;

import java.util.ArrayList;

public class CourseGrades implements Analyzable {
    private ArrayList<GradedActivity> grades;


    public CourseGrades() {
        grades = new ArrayList<>();
    }

    public ArrayList<GradedActivity> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<GradedActivity> grades) {
        this.grades = grades;
    }

    public void addScore(double x) {
        GradedActivity pkt = new GradedActivity();
        pkt.setScore(x);
        grades.add(pkt);
    }

    @Override
    public double getAverage() {
        double avarage = 0;
        for (GradedActivity element: grades) {
            avarage += Double.parseDouble(String.valueOf(element.getScore()));
        }
        return avarage / grades.size();
    }

    @Override
    public GradedActivity getHighest() {
        double highest = 0;
        int index = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getScore() > highest) {
                highest = grades.get(i).getScore();
                index = i;
            }
        }
        return grades.get(index);
    }

    @Override
    public GradedActivity getLowest() {
        int index = 0;
        double lowest = grades.get(index).getScore();
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i).getScore() < lowest) {
                lowest = grades.get(i).getScore();
                index = i;
            }
        }
        return grades.get(index);
    }
}
