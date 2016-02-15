package org.j8unit.repository.java.beans;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.Visibility interface java.beans.Visibility}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link VisibilityClassTests}.
 * </p>
 *
 * @see java.beans.Visibility interface java.beans.Visibility (the hereby targeted class-under-test class)
 * @see VisibilityClassTests VisibilityClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface VisibilityTests<SUT extends java.beans.Visibility>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.Visibility#okToUseGui() public abstract void
     * java.beans.Visibility.okToUseGui()}.
     *
     * <p>
     * Test method for {@link java.beans.Visibility#okToUseGui() public abstract void
     * java.beans.Visibility.okToUseGui()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.Visibility#okToUseGui() public abstract void java.beans.Visibility.okToUseGui() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_okToUseGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.Visibility#needsGui() public abstract boolean java.beans.Visibility.needsGui()}
     * .
     *
     * <p>
     * Test method for {@link java.beans.Visibility#needsGui() public abstract boolean java.beans.Visibility.needsGui()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.Visibility#needsGui() public abstract boolean java.beans.Visibility.needsGui() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_needsGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.Visibility#dontUseGui() public abstract void
     * java.beans.Visibility.dontUseGui()}.
     *
     * <p>
     * Test method for {@link java.beans.Visibility#dontUseGui() public abstract void
     * java.beans.Visibility.dontUseGui()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.Visibility#dontUseGui() public abstract void java.beans.Visibility.dontUseGui() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dontUseGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.Visibility#avoidingGui() public abstract boolean
     * java.beans.Visibility.avoidingGui()}.
     *
     * <p>
     * Test method for {@link java.beans.Visibility#avoidingGui() public abstract boolean
     * java.beans.Visibility.avoidingGui()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.Visibility#avoidingGui() public abstract boolean java.beans.Visibility.avoidingGui() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_avoidingGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
