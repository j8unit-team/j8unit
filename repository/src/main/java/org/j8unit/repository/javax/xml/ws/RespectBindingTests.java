package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.RespectBinding interface javax.xml.ws.RespectBinding}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.RespectBindingClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RespectBindingTests<SUT extends javax.xml.ws.RespectBinding>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.RespectBinding#enabled() public abstract boolean
     * javax.xml.ws.RespectBinding.enabled()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enabled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
