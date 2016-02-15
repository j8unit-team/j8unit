package org.j8unit.repository.javax.xml.bind.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.util.JAXBResult class javax.xml.bind.util.JAXBResult}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JAXBResultClassTests}.
 * </p>
 *
 * @see javax.xml.bind.util.JAXBResult class javax.xml.bind.util.JAXBResult (the hereby targeted class-under-test class)
 * @see JAXBResultClassTests JAXBResultClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBResultTests<SUT extends javax.xml.bind.util.JAXBResult>
extends org.j8unit.repository.javax.xml.transform.sax.SAXResultTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.JAXBResult#getResult() public java.lang.Object
     * javax.xml.bind.util.JAXBResult.getResult() throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.util.JAXBResult#getResult() public java.lang.Object
     * javax.xml.bind.util.JAXBResult.getResult() throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.util.JAXBResult#getResult() public java.lang.Object
     *      javax.xml.bind.util.JAXBResult.getResult() throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResult()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
