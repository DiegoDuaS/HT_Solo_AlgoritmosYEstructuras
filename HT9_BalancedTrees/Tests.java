/**
 * @author: Diego Duarte
 * 
 * @since:20/04/2023
 **/
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Tests {

    Read read = new Read();
    
    @Test
    public void TextoReadTest(){
        ArrayList<String> prueba = read.texto();
    }
}
