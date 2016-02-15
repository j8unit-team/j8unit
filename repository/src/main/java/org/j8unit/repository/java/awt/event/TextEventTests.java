package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.event.TextEvent class java.awt.event.TextEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TextEventClassTests}.
 * </p>
 *
 * @see java.awt.event.TextEvent class java.awt.event.TextEvent (the hereby targeted class-under-test class)
 * @see TextEventClassTests TextEventClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextEventTests<SUT extends java.awt.event.TextEvent>
extends org.j8unit.repository.java.awt.AWTEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.TextEvent#paramString() public java.lang.String
     * java.awt.event.TextEvent.paramString()}.
     *
     * <p>
     * Test method for {@link java.awt.event.TextEvent#paramString() public java.lang.String
     * java.awt.event.TextEvent.paramString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.TextEvent#paramString() public java.lang.String java.awt.event.TextEvent.paramString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paramString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
