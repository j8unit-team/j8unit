package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.CaretEvent class javax.swing.event.CaretEvent}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.CaretEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CaretEventTests<SUT extends javax.swing.event.CaretEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.CaretEvent#getDot() public abstract int
     * javax.swing.event.CaretEvent.getDot()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDot()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.CaretEvent#getMark() public abstract int
     * javax.swing.event.CaretEvent.getMark()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMark()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
