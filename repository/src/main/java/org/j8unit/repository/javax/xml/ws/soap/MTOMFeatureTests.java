package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.soap.MTOMFeature class javax.xml.ws.soap.MTOMFeature},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.soap.MTOMFeature
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MTOMFeatureTests<SUT extends javax.xml.ws.soap.MTOMFeature>
extends org.j8unit.repository.javax.xml.ws.WebServiceFeatureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.MTOMFeature#getID() public java.lang.String
     * javax.xml.ws.soap.MTOMFeature.getID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.soap.MTOMFeature#getID()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.MTOMFeature#getThreshold() public int
     * javax.xml.ws.soap.MTOMFeature.getThreshold()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.soap.MTOMFeature#getThreshold()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getThreshold()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
