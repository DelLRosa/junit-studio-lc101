package test;

import main.BalancedBrackets;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsAroundWordsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsInWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void nestedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }
    @Test
    public void crazyBracketPasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]fd[dfghgfgh[ghj]dfghj[fg]]]"));
    }


    //false tests below
    @Test
    public void reverseBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void reverseBracketAroundWordReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
    @Test
    public void openBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void closeBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void doubleOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void nestedBracketsFalseTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }


}
