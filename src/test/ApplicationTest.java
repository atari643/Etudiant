package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import main.*;

public class ApplicationTest{
    @Test
    public void testGetClub() {

    }

    @Test
    public void testGetStudent() {

    }
    /*Test du contenu vide*/

    @Test 
    public void testGetContentEmpty(){
        Application app = new Application(new Student("Samuel"), new Club("tenis"), "");
        assertEquals("Le contenu est vide ou inexistant",app.getContent());

    }
    /*Test du contenu null inconnu */
    @Test 
    public void testGetContentNull(){
        Application app2 = new Application(null, null, null);
        assertEquals("Le contenu est vide ou inexistant",app2.getContent());
    }
    @Test
    public void testGetContent(){
        Application app2 = new Application(null, null, "Voici ma candidature");
        assertEquals("Voici ma candidature",app2.getContent());
    }
    @Test
    public void testToString() {

    }

}
