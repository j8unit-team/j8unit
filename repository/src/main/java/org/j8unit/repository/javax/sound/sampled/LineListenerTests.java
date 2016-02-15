package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.LineListener interface
 * javax.sound.sampled.LineListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link LineListenerClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.LineListener interface javax.sound.sampled.LineListener (the hereby targeted
 *      class-under-test class)
 * @see LineListenerClassTests LineListenerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LineListenerTests<SUT extends javax.sound.sampled.LineListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.LineListener#update(javax.sound.sampled.LineEvent) public abstract
     * void javax.sound.sampled.LineListener.update(javax.sound.sampled.LineEvent)}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.LineListener#update(javax.sound.sampled.LineEvent) public abstract
     * void javax.sound.sampled.LineListener.update(javax.sound.sampled.LineEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.LineListener#update(javax.sound.sampled.LineEvent) public abstract void
     *      javax.sound.sampled.LineListener.update(javax.sound.sampled.LineEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_LineEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
