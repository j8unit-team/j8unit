package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.html.HTMLMenuElement interface
 * org.w3c.dom.html.HTMLMenuElement}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.html.HTMLMenuElementTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.html.HTMLMenuElementClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.html.HTMLMenuElement
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLMenuElementTests<SUT extends org.w3c.dom.html.HTMLMenuElement>
extends org.j8unit.repository.org.w3c.dom.html.HTMLElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLMenuElement#getCompact() public abstract boolean
     * org.w3c.dom.html.HTMLMenuElement.getCompact()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.html.HTMLMenuElement#getCompact()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCompact()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLMenuElement#setCompact(boolean) public abstract void
     * org.w3c.dom.html.HTMLMenuElement.setCompact(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.html.HTMLMenuElement#setCompact(boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCompact_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
