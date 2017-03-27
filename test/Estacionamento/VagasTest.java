/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a120112
 */
public class VagasTest {
    
    public VagasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     *
     */
    @Test
    public void pagamento() {
       Vagas v = new Vagas();
       Estacionamento e = new Estacionamento();
       v.placa = "gol1234";
       v.entrada=10;
       v.saida=16;
       v.estacionarCarro();
       System.out.println(e.vetor);
       v.pagamento(0);
       
    }
    
}
