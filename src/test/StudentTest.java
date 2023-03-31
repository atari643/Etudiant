package test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import main.Student;

public class StudentTest {
    @Test
    public void testHasClub() {
        Student st = new Student("NoClub");
        assertFalse(st.hasClub());
    }

 
}
