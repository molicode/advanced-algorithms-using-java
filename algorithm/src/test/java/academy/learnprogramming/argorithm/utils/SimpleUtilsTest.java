package academy.learnprogramming.argorithm.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUtilsTest {

    SimpleUtils utils = null;

    @Before
    public void init() throws Exception {
        utils = new SimpleUtils();
    }

    @Test
    public void stringToBooleanTrueTest() {
        Assert.assertTrue(utils.stringToBoolean("y"));
        Assert.assertTrue(utils.stringToBoolean("Y"));
        Assert.assertTrue(utils.stringToBoolean("yEs"));
        Assert.assertTrue(utils.stringToBoolean("YES"));
        Assert.assertTrue(utils.stringToBoolean("true"));
        Assert.assertTrue(utils.stringToBoolean("true"));
    }

    @Test
    public void stringToBooleanFalseTest(){
        Assert.assertFalse(utils.stringToBoolean("n"));
        Assert.assertFalse(utils.stringToBoolean("N"));
        Assert.assertFalse(utils.stringToBoolean("no"));
        Assert.assertFalse(utils.stringToBoolean("NO"));
        Assert.assertFalse(utils.stringToBoolean("false"));
        Assert.assertFalse(utils.stringToBoolean("false"));
        Assert.assertFalse(utils.stringToBoolean("zebra"));
        Assert.assertFalse(utils.stringToBoolean(null));
    }

    @Test
    public void getFileTypeByCode() {
        Assert.assertEquals(SimpleUtils.FileType.PDF, utils.getFileTypeByCode(3));
        Assert.assertEquals(SimpleUtils.FileType.JPEG, utils.getFileTypeByCode(1));
        Assert.assertNull(utils.getFileTypeByCode(999));
    }

    @Test
    public void getFileTypeByName() {
        Assert.assertEquals(SimpleUtils.FileType.TEXT, utils.getFileTypeByName("txt"));
        Assert.assertNull(utils.getFileTypeByName("zebra"));
        Assert.assertNull(utils.getFileTypeByName(null));
    }
}
