/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula09_auto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author clecioferreira
 */
public class CadastroPessoasTest {
    
    public CadastroPessoasTest() {
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
     * Test of cadastrarPessoa method, of class CadastroPessoas.
     */
    @Test
    public void testCadastrarPessoa() {
        System.out.println("cadastrarPessoa");
        Pessoa[] p = null;
        int q = 0;
        CadastroPessoas instance = new CadastroPessoas();
        instance.cadastrarPessoa(p, q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostraCadastro method, of class CadastroPessoas.
     */
    @Test
    public void testMostraCadastro() {
        System.out.println("mostraCadastro");
        Pessoa[] p = null;
        CadastroPessoas instance = new CadastroPessoas();
        instance.mostraCadastro(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CadastroPessoas.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        CadastroPessoas instance = new CadastroPessoas();
        instance.main();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
