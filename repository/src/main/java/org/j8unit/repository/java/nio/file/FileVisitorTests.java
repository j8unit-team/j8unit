package org.j8unit.repository.java.nio.file;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.FileVisitor interface java.nio.file.FileVisitor}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.FileVisitorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FileVisitorTests<SUT extends java.nio.file.FileVisitor<T>, T>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.FileVisitor#postVisitDirectory(java.lang.Object,java.io.IOException) public
     * abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.postVisitDirectory(java.lang.Object,java.io.IOException) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_postVisitDirectory_Object_IOException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.FileVisitor#visitFile(java.lang.Object,java.nio.file.attribute.BasicFileAttributes) public
     * abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.visitFile(java.lang.Object,java.nio.file.attribute.BasicFileAttributes) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitFile_Object_BasicFileAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.FileVisitor#visitFileFailed(java.lang.Object,java.io.IOException) public
     * abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.visitFileFailed(java.lang.Object,java.io.IOException) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitFileFailed_Object_IOException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.FileVisitor#preVisitDirectory(java.lang.Object,java.nio.file.attribute.BasicFileAttributes)
     * public abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.preVisitDirectory(java.lang.Object,java.nio.file.attribute.BasicFileAttributes) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_preVisitDirectory_Object_BasicFileAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
