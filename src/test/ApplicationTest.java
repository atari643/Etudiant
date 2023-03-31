package test;

import org.junit.Test;

import main.Application;

public class ApplicationTest {
    @Test
    public void testGetClub() {

    }

    @Test
    public void testGetStudent() {

    }
    /*Test du contenu vide*/

    @Test (expected = IllegalArgumentException)
    public void testGetContentEmpty(){
        Application app = new Application("Michel", "tennis", "");
        app.getContent();
        

    }
    /*Test du contenu null inconnu */
    @Test (expected = IllegalArgumentException)
    public void testGetContentNull(){
        Application app2 = new Application("Michel", "tennis", null);
        app.getContent();
    }
    @Test
    public void testGetContent(){
        Application app2 = new Application("Michel", "tennis", "Voici ma candidature");
        assertEquals("Voici ma candidature",app.getContent());
    }
    @Test
    public void testToString() {

    }

}
