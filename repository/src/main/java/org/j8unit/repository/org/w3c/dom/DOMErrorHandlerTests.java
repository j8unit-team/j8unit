package org.j8unit.repository.org.w3c.dom;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.DOMErrorHandler interface org.w3c.dom.DOMErrorHandler}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.DOMErrorHandlerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DOMErrorHandlerTests<SUT extends org.w3c.dom.DOMErrorHandler>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMErrorHandler#handleError(org.w3c.dom.DOMError) public abstract boolean
     * org.w3c.dom.DOMErrorHandler.handleError(org.w3c.dom.DOMError)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleError_DOMError()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
