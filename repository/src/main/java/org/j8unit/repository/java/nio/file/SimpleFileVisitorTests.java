package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.SimpleFileVisitor class java.nio.file.SimpleFileVisitor}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.SimpleFileVisitorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SimpleFileVisitorTests<SUT extends java.nio.file.SimpleFileVisitor<T>, T>
extends org.j8unit.repository.java.nio.file.FileVisitorTests<SUT, T>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.SimpleFileVisitor#preVisitDirectory(java.lang.Object,java.nio.file.attribute.BasicFileAttributes)
     * public java.nio.file.FileVisitResult
     * java.nio.file.SimpleFileVisitor.preVisitDirectory(java.lang.Object,java.nio.file.attribute.BasicFileAttributes)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_preVisitDirectory_Object_BasicFileAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.SimpleFileVisitor#visitFileFailed(java.lang.Object,java.io.IOException)
     * public java.nio.file.FileVisitResult
     * java.nio.file.SimpleFileVisitor.visitFileFailed(java.lang.Object,java.io.IOException) throws java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitFileFailed_Object_IOException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.SimpleFileVisitor#visitFile(java.lang.Object,java.nio.file.attribute.BasicFileAttributes)
     * public java.nio.file.FileVisitResult
     * java.nio.file.SimpleFileVisitor.visitFile(java.lang.Object,java.nio.file.attribute.BasicFileAttributes) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitFile_Object_BasicFileAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.SimpleFileVisitor#postVisitDirectory(java.lang.Object,java.io.IOException)
     * public java.nio.file.FileVisitResult
     * java.nio.file.SimpleFileVisitor.postVisitDirectory(java.lang.Object,java.io.IOException) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_postVisitDirectory_Object_IOException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
