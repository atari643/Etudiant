package main;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Club club1 = new Club("club_L");
        Club club2 = new Club("club_A");
        Set<Student> listStudent  = new HashSet<>();
        Student st1 = new Student("Loic");
        listStudent.add(st1);
        Student st2 = new Student("Anna");
        listStudent.add(st2);
        Student st3 = new Student("Ange");
        listStudent.add(st3);
        Student st4 = new Student("Antonin");
        listStudent.add(st4);
        club1.addApplicant(st1, "application 1");
        club2.addApplicant(st2, "application 2");
        club2.addApplicant(st3, "application 3");
        club2.addApplicant(st4, "application 4");
        for (Student student : listStudent)
            System.out.println(student);
        Club.addSeveralMembersToEachClub();
        for (Student student : listStudent)
        System.out.println(student);
    }
}
