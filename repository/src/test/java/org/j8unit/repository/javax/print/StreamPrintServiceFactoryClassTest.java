package org.j8unit.repository.javax.print;

import static org.junit.Assert.fail;
import javax.print.StreamPrintServiceFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StreamPrintServiceFactory} (by simply
 * reusing the J8Unit test interface {@link StreamPrintServiceFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class StreamPrintServiceFactoryClassTest
implements StreamPrintServiceFactoryClassTests<StreamPrintServiceFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.StreamPrintServiceFactory]

    @Override
    public Class<StreamPrintServiceFactory> createNewSUT() {
        return StreamPrintServiceFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.StreamPrintServiceFactory#StreamPrintServiceFactory() public
     * javax.print.StreamPrintServiceFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_StreamPrintServiceFactory()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.print.StreamPrintServiceFactory#lookupStreamPrintServiceFactories(javax.print.DocFlavor, String)
     * public static javax.print.StreamPrintServiceFactory[]
     * javax.print.StreamPrintServiceFactory.lookupStreamPrintServiceFactories(javax.print.DocFlavor,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_lookupStreamPrintServiceFactories_DocFlavor_String()
    throws Exception {
        // write some test for {@link
        // javax.print.StreamPrintServiceFactory#lookupStreamPrintServiceFactories(javax.print.DocFlavor, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.StreamPrintServiceFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.StreamPrintServiceFactory]

}
