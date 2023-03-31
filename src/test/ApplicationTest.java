package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.*;

public class ApplicationTest {
    @Test
    public void testGetClub() {

    }

    @Test
    public void testGetStudent() {

    }
    /**
     * Test si le score est bien retourner
     */
    @Test
    public void testGetScore(){
        Application app = new Application(new Student("Samuel"), new Club("tenis"), "", 1);
        assertEquals(1,app.getScore());
        Application app2 = new Application(new Student("Samuel"), new Club("tenis"), "", 0);
        assertEquals(0,app2.getScore());
    }
    /**
     * Une note est soit supérieur à 0 soit égal à 0 
     */
    @Test
    public void testGetScoreNegatif(){
        Application app = new Application(new Student("Samuel"), new Club("tenis"), "", -1);
        assertEquals(0,app.getScore());
        Application app2 = new Application(new Student("Samuel"), new Club("tenis"), "", -100);
        assertEquals(0,app2.getScore());
    }
    /*Test du contenu vide*/
    @Test 
    public void testGetContentEmpty(){
        Application app = new Application(new Student("Samuel"), new Club("tenis"), "", 1);
        assertEquals("Le contenu est vide ou inexistant",app.getContent());

    }
    /*Test du contenu null inconnu */
    @Test 
    public void testGetContentNull(){
        Application app2 = new Application(null, null, null, 1);
        assertEquals("Le contenu est vide ou inexistant",app2.getContent());
    }
    @Test
    public void testGetContent(){
        Application app2 = new Application(null, null, "Voici ma candidature", 1);
        assertEquals("Voici ma candidature",app2.getContent());
    }
    @Test
    public void testToString() {

    }

}
