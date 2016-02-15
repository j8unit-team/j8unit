package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.WebServiceFeature class javax.xml.ws.WebServiceFeature}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link WebServiceFeatureClassTests}.
 * </p>
 *
 * @see javax.xml.ws.WebServiceFeature class javax.xml.ws.WebServiceFeature (the hereby targeted class-under-test class)
 * @see WebServiceFeatureClassTests WebServiceFeatureClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebServiceFeatureTests<SUT extends javax.xml.ws.WebServiceFeature>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceFeature#getID() public abstract java.lang.String
     * javax.xml.ws.WebServiceFeature.getID()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceFeature#getID() public abstract java.lang.String
     * javax.xml.ws.WebServiceFeature.getID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceFeature#getID() public abstract java.lang.String
     *      javax.xml.ws.WebServiceFeature.getID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceFeature#isEnabled() public boolean
     * javax.xml.ws.WebServiceFeature.isEnabled()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceFeature#isEnabled() public boolean
     * javax.xml.ws.WebServiceFeature.isEnabled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceFeature#isEnabled() public boolean javax.xml.ws.WebServiceFeature.isEnabled() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEnabled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
