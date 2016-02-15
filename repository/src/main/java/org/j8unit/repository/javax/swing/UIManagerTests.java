package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.UIManager class javax.swing.UIManager}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link UIManagerClassTests}.
 * </p>
 *
 * @see javax.swing.UIManager class javax.swing.UIManager (the hereby targeted class-under-test class)
 * @see UIManagerClassTests UIManagerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UIManagerTests<SUT extends javax.swing.UIManager>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.UIManager.LookAndFeelInfo class
     * javax.swing.UIManager$LookAndFeelInfo}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link UIManagerClassTests.LookAndFeelInfoClassTests}.
     * </p>
     *
     * @see javax.swing.UIManager.LookAndFeelInfo class javax.swing.UIManager$LookAndFeelInfo (the hereby targeted
     *      class-under-test class)
     * @see UIManagerClassTests.LookAndFeelInfoClassTests UIManagerClassTests.LookAndFeelInfoClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LookAndFeelInfoTests<SUT extends javax.swing.UIManager.LookAndFeelInfo>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.UIManager.LookAndFeelInfo#getClassName() public java.lang.String
         * javax.swing.UIManager$LookAndFeelInfo.getClassName()}.
         *
         * <p>
         * Test method for {@link javax.swing.UIManager.LookAndFeelInfo#getClassName() public java.lang.String
         * javax.swing.UIManager$LookAndFeelInfo.getClassName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.UIManager.LookAndFeelInfo#getClassName() public java.lang.String
         *      javax.swing.UIManager$LookAndFeelInfo.getClassName() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getClassName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.UIManager.LookAndFeelInfo#toString() public java.lang.String
         * javax.swing.UIManager$LookAndFeelInfo.toString()}.
         *
         * <p>
         * Test method for {@link javax.swing.UIManager.LookAndFeelInfo#toString() public java.lang.String
         * javax.swing.UIManager$LookAndFeelInfo.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.UIManager.LookAndFeelInfo#toString() public java.lang.String
         *      javax.swing.UIManager$LookAndFeelInfo.toString() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.UIManager.LookAndFeelInfo#getName() public java.lang.String
         * javax.swing.UIManager$LookAndFeelInfo.getName()}.
         *
         * <p>
         * Test method for {@link javax.swing.UIManager.LookAndFeelInfo#getName() public java.lang.String
         * javax.swing.UIManager$LookAndFeelInfo.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.UIManager.LookAndFeelInfo#getName() public java.lang.String
         *      javax.swing.UIManager$LookAndFeelInfo.getName() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
