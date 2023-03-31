package main;

import java.util.*;
/*
 * Club class.
 * 
 *  each club has members (that are students) 
 * and some applications (students that want to be member of that club)
 */
public class Club {
    /* clubs :  list of existing clubs */
    private static List<Club> clubs = new ArrayList<>();

    private String name;
    private Set<Student> members;
    private Map<Student, Application> applicants;
    /**
    *  constructor of a club that has a name.
    * 
    * @param name name of the club
    */
    public Club (String name) {
        this.name = name;
        members = new HashSet<>();
        applicants = new HashMap<>();
        clubs.add(this);
    }

    public void addApplicant(Student st, String content){
        if (st == null) return;
        if (applicants.get(st) != null) return;
        Application application = new Application(st, this, content);
        applicants.put(st, application);
    }

    /**
    *  add new membres to each club of the list clubs 
    *  until no club can have a new member.
    * 
    */
    static public void addSeveralMembersToEachClub() {
        boolean success = true;
        while (success) { success = addOneMemberToEachClub(); }
    }
    /**
    * try to add a new membre to each club of the list clubs
    * 
    * @return true if a club has found a new member.
    */
    static public boolean addOneMemberToEachClub() {
        boolean success = false;
        for (Club club  : clubs){
            if(club.members.size() < 30){
                if (club.addMember()) success = true;
            }
                
        }  
        return success;
    }

    /**
    * adding a new membre : a student that is applicant and that is not member of a club.
    * 
    * @return true if the club has found a new member.
    */
    public boolean addMember(){
        Student student = getGoodApplicant();
        if (student == null) return false;
        student.setClub(this);
        members.add(student);
        return true;
    }
    

    /**
    *  return an applicant that is not member of a club
    */
    public Student getGoodApplicant(){
        Student goodStudent = null;
        for(Student student : applicants.keySet()) {
            if (!student.hasClub())  goodStudent = student;
        }    
        return goodStudent;     
    }

    /**
    * return a description of the Club object including its name
    *  
    * @return a description of the Club object that include its name
    */
    @Override
    public String toString() {
        return "Club : "+name;
    }
}
            
