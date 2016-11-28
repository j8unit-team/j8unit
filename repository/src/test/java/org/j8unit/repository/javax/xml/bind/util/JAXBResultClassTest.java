package org.j8unit.repository.javax.xml.bind.util;

import javax.xml.bind.util.JAXBResult;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JAXBResult} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.util.JAXBResultClassTests}).
 */
@RunWith(J8Unit4.class)
public class JAXBResultClassTest
implements JAXBResultClassTests<JAXBResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.util.JAXBResult]

    @Override
    public Class<JAXBResult> createNewSUT() {
        return JAXBResult.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.util.JAXBResult#JAXBResult(javax.xml.bind.JAXBContext) public
     * javax.xml.bind.util.JAXBResult(javax.xml.bind.JAXBContext) throws javax.xml.bind.JAXBException}.
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
    public void create_JAXBResult_JAXBContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JAXBResult sut = null; // = new JAXBResult(javax.xml.bind.JAXBContext);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.util.JAXBResult#JAXBResult(javax.xml.bind.Unmarshaller) public
     * javax.xml.bind.util.JAXBResult(javax.xml.bind.Unmarshaller) throws javax.xml.bind.JAXBException}.
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
    public void create_JAXBResult_Unmarshaller()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JAXBResult sut = null; // = new JAXBResult(javax.xml.bind.Unmarshaller);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.util.JAXBResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.util.JAXBResult]

}
