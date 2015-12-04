package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.annotation.processing.Filer interface javax.annotation.processing.Filer}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.annotation.processing.FilerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilerTests<SUT extends javax.annotation.processing.Filer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createClassFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * public abstract javax.tools.JavaFileObject
     * javax.annotation.processing.Filer.createClassFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createClassFile_CharSequence_ElementArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createResource(javax.tools.JavaFileManager.Location,java.lang.CharSequence,java.lang.CharSequence,javax.lang.model.element.Element...)
     * public abstract javax.tools.FileObject
     * javax.annotation.processing.Filer.createResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence,java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createResource_Location_CharSequence_CharSequence_ElementArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createSourceFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * public abstract javax.tools.JavaFileObject
     * javax.annotation.processing.Filer.createSourceFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSourceFile_CharSequence_ElementArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#getResource(javax.tools.JavaFileManager.Location,java.lang.CharSequence,java.lang.CharSequence)
     * public abstract javax.tools.FileObject
     * javax.annotation.processing.Filer.getResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence,java.lang.CharSequence)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResource_Location_CharSequence_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
