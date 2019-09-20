
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Lama Dong, Gangalal
 * @version 2/15/2018 Project 1 to hold a single measurement and flag it if is
 *          bad
 */
public class MeasurementTest
{
    /**
     * empty constructor test
     */
    @Test
    public void emptyConstructorTest()
    {
        Measurement a = new Measurement();
        Assert.assertEquals(Double.NaN, a.getValue(), 0.01);
        Assert.assertEquals(false, a.isValid());

    }

    /**
     * constructor test with one parameter
     */
    @Test
    public void constructorTest()
    {
        Measurement a = new Measurement(-14.9);
        Assert.assertEquals(-14.9, a.getValue(), 0.01);
    }

    /**
     * valid test
     */
    @Test
    public void validTest()
    {
        Measurement a = new Measurement(-14.9);
        Assert.assertEquals(true, a.isValid());
        Measurement b = new Measurement(-10000.0);
        Assert.assertEquals(false, b.isValid());
    }

    /**
     * to string test
     */
    @Test
    public void toStringTest()
    {
        Measurement a = new Measurement(-14.9);
        Measurement b = new Measurement(-10000.0);
        Assert.assertEquals("-14.9000", a.toString());
        Assert.assertEquals("bad", b.toString());

    }

}
