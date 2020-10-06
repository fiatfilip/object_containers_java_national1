package ro.siit.enums;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class SeasonsTest {

    @Test
    public void checkSeason() {
        Month month = Month.OCT;
        Season season = Seasons.getSeasonFromMonth(month);

        Assert.assertEquals(Season.Autumn, season);
    }


}
