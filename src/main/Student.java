package main;

/**
 * an object of this class is a student
 */
public class Student {
    private String name;
    private Club myClub;

    /**
     * constructor of a student that has a name.
     * 
     * @param name name of the student
     */
    public Student(String name) {
        this.name = name;
        myClub = null;

    }

    /**
     * return a description of the Student object including its name
     * 
     * @return a description of the Student object that including its name
     */
    @Override
    public String toString() {
        String st = "Student : " + name;
        if (myClub == null)
            return st;
        return st + " member of " + myClub;
    }

    /**
     * return false if the student is not member of a club.
     * 
     * @return true is the student is member of a club
     */
    public boolean hasClub() {
        return (myClub != null);
    }

    /**
     * set myClub only if student is yet member of a club
     * 
     * @param club student becomes member of that club
     */
    public void setClub(Club club) {
        if (myClub == null)
            myClub = club;
    }

}
