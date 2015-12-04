package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.Response interface javax.xml.ws.Response}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.ResponseClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ResponseTests<SUT extends javax.xml.ws.Response<T>, T>
extends org.j8unit.repository.java.util.concurrent.FutureTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Response#getContext() public abstract java.util.Map
     * javax.xml.ws.Response.getContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
