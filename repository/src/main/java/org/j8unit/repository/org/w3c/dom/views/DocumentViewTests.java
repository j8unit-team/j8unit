package org.j8unit.repository.org.w3c.dom.views;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.views.DocumentView interface org.w3c.dom.views.DocumentView}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.views.DocumentViewClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentViewTests<SUT extends org.w3c.dom.views.DocumentView>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.views.DocumentView#getDefaultView() public abstract
     * org.w3c.dom.views.AbstractView org.w3c.dom.views.DocumentView.getDefaultView()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultView()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
