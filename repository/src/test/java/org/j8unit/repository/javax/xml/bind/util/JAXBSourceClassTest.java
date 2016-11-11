package org.j8unit.repository.javax.xml.bind.util;

import javax.xml.bind.util.JAXBSource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JAXBSource} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.util.JAXBSourceClassTests}).
 */

@RunWith(J8Unit4.class)
public class JAXBSourceClassTest
implements JAXBSourceClassTests<JAXBSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.util.JAXBSource]

    @Override
    public Class<JAXBSource> createNewSUT() {
        return JAXBSource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.util.JAXBSource#JAXBSource(javax.xml.bind.JAXBContext, Object) public
     * javax.xml.bind.util.JAXBSource(javax.xml.bind.JAXBContext,java.lang.Object) throws javax.xml.bind.JAXBException}.
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
    public void create_JAXBSource_JAXBContext_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JAXBSource sut = null; // = new JAXBSource(javax.xml.bind.JAXBContext, Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.util.JAXBSource#JAXBSource(javax.xml.bind.Marshaller, Object) public
     * javax.xml.bind.util.JAXBSource(javax.xml.bind.Marshaller,java.lang.Object) throws javax.xml.bind.JAXBException}.
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
    public void create_JAXBSource_Marshaller_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JAXBSource sut = null; // = new JAXBSource(javax.xml.bind.Marshaller, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.util.JAXBSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.util.JAXBSource]

}
