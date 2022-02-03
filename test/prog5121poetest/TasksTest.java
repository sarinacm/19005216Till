/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121poetest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ctill
 */
public class TasksTest {
    Tasks testTasks = new Tasks();
    public TasksTest() {
    }

    @Test
    public void testCreateTaskID() 
    {
        String expected = "AD:1:BYN";
        String actual = testTasks.createTaskID("Add login Feature", 1, "Robyn");
        assertEquals(expected,actual);
                
        
    }

  

    @Test
    public void testReturnTotalHours() 
    {
        
    }

    @Test
    public void testPrintTaskDetails() {
    }

    @Test
    public void testPopulateDeveloperArray() 
    {
         String [] developers = new String[] {"Mike Smith", "Edward Harrington"
       , "Samantha Paulson", "Glenda Oberholzer"};
         
        String[] capturedDevelopers = new String[3];
        capturedDevelopers = testTasks.populateDeveloperArray();
        for (int i = 0; i < capturedDevelopers.length; i++) 
        {
            String expected = developers[i];
            String actual =capturedDevelopers[i];
            assertEquals(expected,actual);
        }
    }
    
}
