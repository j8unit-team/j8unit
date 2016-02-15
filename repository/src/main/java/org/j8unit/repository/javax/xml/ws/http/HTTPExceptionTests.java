package org.j8unit.repository.javax.xml.ws.http;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.http.HTTPException class javax.xml.ws.http.HTTPException}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link HTTPExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.ws.http.HTTPException class javax.xml.ws.http.HTTPException (the hereby targeted class-under-test
 *      class)
 * @see HTTPExceptionClassTests HTTPExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTTPExceptionTests<SUT extends javax.xml.ws.http.HTTPException>
extends org.j8unit.repository.javax.xml.ws.ProtocolExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.http.HTTPException#getStatusCode() public int
     * javax.xml.ws.http.HTTPException.getStatusCode()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.http.HTTPException#getStatusCode() public int
     * javax.xml.ws.http.HTTPException.getStatusCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.http.HTTPException#getStatusCode() public int javax.xml.ws.http.HTTPException.getStatusCode()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStatusCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
