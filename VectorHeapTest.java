/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maris
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        instance.add("hola");
        instance.add("adios");
        String[] array = new String[2];
        array[0]="adios";
        array[1]="hola";
        int comparacion=0;
        for(int i=0;i<array.length;i++){
        System.out.println(instance.elementAt(i));            
            if((array[i])==(instance.elementAt(i))){
                comparacion++;
            }
        }
        if(comparacion<2){
        // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
        else{
            assertEquals(2, comparacion);
        }
    }


    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        instance.add("hola");
        instance.add("adios");
        instance.add("burro");
        String expResult = "adios";
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }


    
}
