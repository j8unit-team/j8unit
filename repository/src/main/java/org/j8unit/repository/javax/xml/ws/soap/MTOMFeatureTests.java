package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.soap.MTOMFeature class javax.xml.ws.soap.MTOMFeature}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MTOMFeatureTests<SUT extends javax.xml.ws.soap.MTOMFeature>
extends org.j8unit.repository.javax.xml.ws.WebServiceFeatureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.MTOMFeature#getID() public java.lang.String
     * javax.xml.ws.soap.MTOMFeature.getID()}.
     * </p>
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
     * </p>
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
