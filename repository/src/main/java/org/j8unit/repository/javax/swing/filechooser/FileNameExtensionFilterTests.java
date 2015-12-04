package org.j8unit.repository.javax.swing.filechooser;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.filechooser.FileNameExtensionFilter class
 * javax.swing.filechooser.FileNameExtensionFilter}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.filechooser.FileNameExtensionFilterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FileNameExtensionFilterTests<SUT extends javax.swing.filechooser.FileNameExtensionFilter>
extends org.j8unit.repository.javax.swing.filechooser.FileFilterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.filechooser.FileNameExtensionFilter#accept(java.io.File) public boolean
     * javax.swing.filechooser.FileNameExtensionFilter.accept(java.io.File)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_accept_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.filechooser.FileNameExtensionFilter#getDescription() public java.lang.String
     * javax.swing.filechooser.FileNameExtensionFilter.getDescription()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDescription()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.filechooser.FileNameExtensionFilter#getExtensions() public java.lang.String[]
     * javax.swing.filechooser.FileNameExtensionFilter.getExtensions()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExtensions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.filechooser.FileNameExtensionFilter#toString() public java.lang.String
     * javax.swing.filechooser.FileNameExtensionFilter.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
