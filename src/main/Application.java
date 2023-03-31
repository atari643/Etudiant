package main;

public class Application{
    private String content;
    private Student student;
    private Club club;
    private int score;
    public Application(Student student, Club club, String content, int score){
        this.student = student; this.club = club; this.content = content; this.score = score;
    }
    public Club getClub() {return club; }
    public Student getStudent() {return student; }
    /**
     * Fonction qui renvoie le contenu d'une candidature.
     * Elle permet de connaitre la description d'un profil étudiant et évitde les candidature qui n'ont pas de description
     * @return le contenu d'un profil ou n'ont pas de description
     */
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
     * Fonction qui retourne le score du profile.
     * Score du profile donner par un indicateur externe et qui ne peut pas être inférieur a 0 
     * @return le score du profile ou 0 si exeption
     */
    public int getScore(){
        try{
            if(score < 0){
                throw new ArithmeticException();
            }else{
                return score;
            }
        }catch(ArithmeticException e){
            System.out.println("Le score est négatif");
            return 0;
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
