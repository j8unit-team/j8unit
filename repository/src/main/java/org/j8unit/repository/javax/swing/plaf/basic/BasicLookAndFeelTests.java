package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicLookAndFeel class
 * javax.swing.plaf.basic.BasicLookAndFeel}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicLookAndFeelTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicLookAndFeelClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicLookAndFeel
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicLookAndFeelTests<SUT extends javax.swing.plaf.basic.BasicLookAndFeel>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.javax.swing.LookAndFeelTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicLookAndFeel#getDefaults() public javax.swing.UIDefaults
     * javax.swing.plaf.basic.BasicLookAndFeel.getDefaults()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicLookAndFeel#getDefaults()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDefaults()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicLookAndFeel#initialize() public void
     * javax.swing.plaf.basic.BasicLookAndFeel.initialize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicLookAndFeel#initialize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_initialize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicLookAndFeel#uninitialize() public void
     * javax.swing.plaf.basic.BasicLookAndFeel.uninitialize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicLookAndFeel#uninitialize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninitialize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
