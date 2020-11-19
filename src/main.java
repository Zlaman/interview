import org.testng.Assert;
import org.testng.annotations.Test;

public class main {
    @Test
    public void String_Task() {
        String Source = "Selenium automates browsers. That's it! What you do  with that power is entirely up to you.";
        String result;


        Assert.assertEquals(result, "muineleS setamotua .sresworb s'tahT !ti thaW uoy od htiw taht rewop si yleritne pu ot .uoy");
    }
}
