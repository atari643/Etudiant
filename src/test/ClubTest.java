package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
}
