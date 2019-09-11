package ecutb.peter;

import org.junit.Assert;
import org.junit.Test;

public class Valör_test {

    @Test

    public void ValörTest(){
        int expectedVale = 500;
        Assert.assertEquals(expectedVale, Valör.femhundra.getValör());
    }



}
