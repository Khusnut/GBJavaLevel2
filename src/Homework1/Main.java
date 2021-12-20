package Homework1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course();
        Team team = new Team("New team");
        c.doIt(team);
        team.showResults();
        team.membersName();
    }
}
