/**
 * @author: Diego Duarte
 * 
 * @since:21/02/2023
 **/

import static org.junit.Assert.assertEquals;

public class Tests {
    Read read = new Read();
    
    @org.junit.Test
    public void ConvertorTest(){
        String test = Calculator.infixToPostfix("(3+2)*2");
        assertEquals("3 2 + 2 * ", test);
    }
    
    @org.junit.Test
    public void ReadTest(){
        String test = read.leer();
        assertEquals("(4+1)*2", test);
    }

    




}

