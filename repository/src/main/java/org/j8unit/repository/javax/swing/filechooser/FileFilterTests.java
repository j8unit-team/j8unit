package org.j8unit.repository.javax.swing.filechooser;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.filechooser.FileFilter class
 * javax.swing.filechooser.FileFilter}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link FileFilterClassTests}.
 * </p>
 *
 * @see javax.swing.filechooser.FileFilter class javax.swing.filechooser.FileFilter (the hereby targeted
 *      class-under-test class)
 * @see FileFilterClassTests FileFilterClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileFilterTests<SUT extends javax.swing.filechooser.FileFilter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.filechooser.FileFilter#getDescription() public abstract java.lang.String
     * javax.swing.filechooser.FileFilter.getDescription()}.
     *
     * <p>
     * Test method for {@link javax.swing.filechooser.FileFilter#getDescription() public abstract java.lang.String
     * javax.swing.filechooser.FileFilter.getDescription()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.filechooser.FileFilter#getDescription() public abstract java.lang.String
     *      javax.swing.filechooser.FileFilter.getDescription() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDescription()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.filechooser.FileFilter#accept(java.io.File) public abstract boolean
     * javax.swing.filechooser.FileFilter.accept(java.io.File)}.
     *
     * <p>
     * Test method for {@link javax.swing.filechooser.FileFilter#accept(java.io.File) public abstract boolean
     * javax.swing.filechooser.FileFilter.accept(java.io.File)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.filechooser.FileFilter#accept(java.io.File) public abstract boolean
     *      javax.swing.filechooser.FileFilter.accept(java.io.File) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
