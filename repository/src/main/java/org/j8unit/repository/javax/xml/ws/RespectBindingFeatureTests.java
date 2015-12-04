package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.RespectBindingFeature class javax.xml.ws.RespectBindingFeature}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.RespectBindingFeatureClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RespectBindingFeatureTests<SUT extends javax.xml.ws.RespectBindingFeature>
extends org.j8unit.repository.javax.xml.ws.WebServiceFeatureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.RespectBindingFeature#getID() public java.lang.String
     * javax.xml.ws.RespectBindingFeature.getID()}.
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

}
