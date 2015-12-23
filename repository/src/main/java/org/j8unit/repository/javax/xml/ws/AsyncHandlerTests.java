package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.AsyncHandler interface javax.xml.ws.AsyncHandler},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.AsyncHandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.AsyncHandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.AsyncHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsyncHandlerTests<SUT extends javax.xml.ws.AsyncHandler<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.AsyncHandler#handleResponse(javax.xml.ws.Response) public abstract void
     * javax.xml.ws.AsyncHandler.handleResponse(javax.xml.ws.Response)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.AsyncHandler#handleResponse(javax.xml.ws.Response)
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
