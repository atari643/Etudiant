package test;

import org.junit.Test;

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
        for(int i = 0; i < 29; i++){
            Student student = new Student("leo");
            club.addApplicant(student, "application");
        }
        Club.addSeveralMembersToEachClub();
        Student student = new Student("leo");
        club.addApplicant(student, "application");
        assertTrue(Club.addOneMemberToEachClub());
        Student student2 = new Student("leo");
        club.addApplicant(student2, "application");
        assertTrue(Club.addOneMemberToEachClub());
        Student student3 = new Student("leo");
        club.addApplicant(student3, "application");
        assertFalse(Club.addOneMemberToEachClub());
        Student std = new Student(null);
        club.addApplicant(std, "application");
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
