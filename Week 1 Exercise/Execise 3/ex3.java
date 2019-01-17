package com.fete.exercise;

public class User {
    private String Name;
    private int score;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increaseScoreByOne() {
    score++;
}
}