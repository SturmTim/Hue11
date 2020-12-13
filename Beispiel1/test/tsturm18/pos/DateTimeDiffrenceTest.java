/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsturm18.pos;

import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author timst
 */
public class DateTimeDiffrenceTest {

    public DateTimeDiffrenceTest() {
    }

    /**
     * Test of getDateDiffrence method, of class DateTimeDiffrence.
     */
    @Test
    public void testGetDateDiffrence() {
        DateTimeDiffrence dtf = new DateTimeDiffrence();
        LocalDateTime birthday = LocalDateTime.of(2003, 11, 21, 4, 01, 36);
        LocalDateTime today = LocalDateTime.of(2020, 12, 13, 13, 07, 30);
        long[] result = dtf.getDateDiffrence(birthday, today);

        assertEquals(17, result[0]);
        assertEquals(204, result[1]);
        assertEquals(890, result[2]);
        assertEquals(6232, result[3]);
        assertEquals(149577, result[4]);
        assertEquals(8974625, result[5]);
        assertEquals(538477554, result[6]);
    }

}
