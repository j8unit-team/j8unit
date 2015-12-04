package org.j8unit.repository.javax.xml.ws;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.AsyncHandler interface javax.xml.ws.AsyncHandler}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.AsyncHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AsyncHandlerTests<SUT extends javax.xml.ws.AsyncHandler<T>, T>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.AsyncHandler#handleResponse(javax.xml.ws.Response) public abstract void
     * javax.xml.ws.AsyncHandler.handleResponse(javax.xml.ws.Response)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleResponse_Response()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
