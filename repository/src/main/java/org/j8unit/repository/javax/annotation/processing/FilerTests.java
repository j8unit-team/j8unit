package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.processing.Filer interface
 * javax.annotation.processing.Filer}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link FilerClassTests}.
 * </p>
 *
 * @see javax.annotation.processing.Filer interface javax.annotation.processing.Filer (the hereby targeted
 *      class-under-test class)
 * @see FilerClassTests FilerClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilerTests<SUT extends javax.annotation.processing.Filer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createResource(javax.tools.JavaFileManager.Location, CharSequence, CharSequence, javax.lang.model.element.Element...)
     * public abstract javax.tools.FileObject
     * javax.annotation.processing.Filer.createResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence,java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createResource(javax.tools.JavaFileManager.Location, CharSequence, CharSequence, javax.lang.model.element.Element...)
     * public abstract javax.tools.FileObject
     * javax.annotation.processing.Filer.createResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence,java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Filer#createResource(javax.tools.JavaFileManager.Location, CharSequence,
     *      CharSequence, javax.lang.model.element.Element...) public abstract javax.tools.FileObject
     *      javax.annotation.processing.Filer.createResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence
     *      ,java.lang.CharSequence,javax.lang.model.element.Element[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * {@link javax.annotation.processing.Filer#getResource(javax.tools.JavaFileManager.Location, CharSequence, CharSequence)
     * public abstract javax.tools.FileObject
     * javax.annotation.processing.Filer.getResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence,java.lang.CharSequence)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#getResource(javax.tools.JavaFileManager.Location, CharSequence, CharSequence)
     * public abstract javax.tools.FileObject
     * javax.annotation.processing.Filer.getResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence,java.lang.CharSequence)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Filer#getResource(javax.tools.JavaFileManager.Location, CharSequence,
     *      CharSequence) public abstract javax.tools.FileObject
     *      javax.annotation.processing.Filer.getResource(javax.tools.JavaFileManager$Location,java.lang.CharSequence,
     *      java.lang.CharSequence) throws java.io.IOException (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createSourceFile(CharSequence, javax.lang.model.element.Element...)
     * public abstract javax.tools.JavaFileObject
     * javax.annotation.processing.Filer.createSourceFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createSourceFile(CharSequence, javax.lang.model.element.Element...)
     * public abstract javax.tools.JavaFileObject
     * javax.annotation.processing.Filer.createSourceFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Filer#createSourceFile(CharSequence, javax.lang.model.element.Element...) public
     *      abstract javax.tools.JavaFileObject
     *      javax.annotation.processing.Filer.createSourceFile(java.lang.CharSequence,javax.lang.model.element.Element[]
     *      ) throws java.io.IOException (the hereby targeted method-under-test)
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
     * {@link javax.annotation.processing.Filer#createClassFile(CharSequence, javax.lang.model.element.Element...)
     * public abstract javax.tools.JavaFileObject
     * javax.annotation.processing.Filer.createClassFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.annotation.processing.Filer#createClassFile(CharSequence, javax.lang.model.element.Element...)
     * public abstract javax.tools.JavaFileObject
     * javax.annotation.processing.Filer.createClassFile(java.lang.CharSequence,javax.lang.model.element.Element...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Filer#createClassFile(CharSequence, javax.lang.model.element.Element...) public
     *      abstract javax.tools.JavaFileObject
     *      javax.annotation.processing.Filer.createClassFile(java.lang.CharSequence,javax.lang.model.element.Element[])
     *      throws java.io.IOException (the hereby targeted method-under-test)
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

}
