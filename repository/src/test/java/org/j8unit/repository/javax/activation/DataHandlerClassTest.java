package org.j8unit.repository.javax.activation;

import javax.activation.DataHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.activation.DataHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DataHandlerClassTest
implements DataHandlerClassTests<DataHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.DataHandler]

    @Override
    public Class<DataHandler> createNewSUT() {
        return DataHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.DataHandler#DataHandler(Object, String) public
     * javax.activation.DataHandler(java.lang.Object,java.lang.String)}.
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
    public void create_DataHandler_Object_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DataHandler sut = null; // = new DataHandler(Object, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.DataHandler#DataHandler(java.net.URL) public javax.activation.DataHandler(java.net.URL)}.
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
    public void create_DataHandler_URL()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DataHandler sut = null; // = new DataHandler(java.net.URL);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.DataHandler#DataHandler(javax.activation.DataSource) public
     * javax.activation.DataHandler(javax.activation.DataSource)}.
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
    public void create_DataHandler_DataSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DataHandler sut = null; // = new DataHandler(javax.activation.DataSource);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.activation.DataHandler#setDataContentHandlerFactory(javax.activation.DataContentHandlerFactory)
     * public static synchronized void
     * javax.activation.DataHandler.setDataContentHandlerFactory(javax.activation.DataContentHandlerFactory)}.
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
    public void test_setDataContentHandlerFactory_DataContentHandlerFactory()
    throws Exception {
        // write some test for {@link
        // javax.activation.DataHandler#setDataContentHandlerFactory(javax.activation.DataContentHandlerFactory)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.DataHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.DataHandler]

}
