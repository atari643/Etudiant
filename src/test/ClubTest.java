package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import main.Club;
import main.Student;

public class ClubTest {
    @Test
    public void testAddApplicant() {

    }

    @Test
    public void testAddMember() {

    }

    @Test
    public void testAddOneMemberToEachClub() {
        Club club = new Club("Java");

        // ajut de 29 dans ce club
        for(int i = 0; i < 29; i++){
            Student student = new Student("leo");
            club.addApplicant(student, "application", 1);
        }
        Club.addSeveralMembersToEachClub();

        //ajout d'un 30eme eleve et verification qu'on puisse l'ajouter
        Student student = new Student("leo");
        club.addApplicant(student, "application", 1);
        assertTrue(Club.addOneMemberToEachClub());

        //essai d'ajouter un 31eme eleve ce qui n'est plus possible
        Student student2 = new Student("leo");
        club.addApplicant(student2, "application", 1);
        assertFalse(Club.addOneMemberToEachClub());

        //essai d'ajouter un eleve null ce qui n'est pas possible
        Student std = new Student(null);
        club.addApplicant(std, "application", 1);
        assertFalse(Club.addOneMemberToEachClub());
    }

    @Test
    public void testAddSeveralMembersToEachClub() {

    }

    @Test
    public void testGetGoodApplicant() {

    }

    @Test
    public void testToString() {

    }

    @Test
    public void testAddMeilleurApplicant(){
        Club club = new Club("Java");
        Set<Student> listStudent  = new HashSet<>();
        Student st1 = new Student("Loic");
        listStudent.add(st1);
        Student st2 = new Student("Anna");
        listStudent.add(st2);
        Student st3 = new Student("Ange");
        listStudent.add(st3);
        Student st4 = new Student("Antonin");
        listStudent.add(st4);

        club.addApplicant(st1, "application 1", 10);
        club.addApplicant(st2, "application 2", 9);
        club.addMeilleurApplicant();
    }
}
