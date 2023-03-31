package main;

public class Application {
    private String content;
    private Student student;
    private Club club;
    public Application(Student student, Club club, String content){
        this.student = student; this.club = club; this.content = content;
    }
    public Club getClub() {return club; }
    public Student getStudent() {return student; }
    public String getContent(){
        try{
            if(content==null || content==""){
                throw new IllegalArgumentException();
            }else{
                return content;
            }
        }catch(IllegalArgumentException e){
            return "Le contenu est vide ou inexistant";
        }
    }
    /**
    * return a description of the application  including its content
    *  
    * @return a description of the application that includes its content
    */
    @Override
    public String toString() {
        return "application to "+club+" by "+student+" with "+content;
    }
}
