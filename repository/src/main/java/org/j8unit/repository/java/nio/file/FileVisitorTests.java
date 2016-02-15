package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.FileVisitor interface java.nio.file.FileVisitor}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FileVisitorClassTests}.
 * </p>
 *
 * @see java.nio.file.FileVisitor interface java.nio.file.FileVisitor (the hereby targeted class-under-test class)
 * @see FileVisitorClassTests FileVisitorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileVisitorTests<SUT extends java.nio.file.FileVisitor<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.FileVisitor#postVisitDirectory(Object, java.io.IOException) public abstract
     * java.nio.file.FileVisitResult java.nio.file.FileVisitor.postVisitDirectory(T,java.io.IOException) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileVisitor#postVisitDirectory(Object, java.io.IOException) public abstract
     * java.nio.file.FileVisitResult java.nio.file.FileVisitor.postVisitDirectory(java.lang.Object,java.io.IOException)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileVisitor#postVisitDirectory(Object, java.io.IOException) public abstract
     *      java.nio.file.FileVisitResult
     *      java.nio.file.FileVisitor.postVisitDirectory(java.lang.Object,java.io.IOException) throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.file.FileVisitor#visitFile(Object, java.nio.file.attribute.BasicFileAttributes)
     * public abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.visitFile(T,java.nio.file.attribute.BasicFileAttributes) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileVisitor#visitFile(Object, java.nio.file.attribute.BasicFileAttributes)
     * public abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.visitFile(java.lang.Object,java.nio.file.attribute.BasicFileAttributes) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileVisitor#visitFile(Object, java.nio.file.attribute.BasicFileAttributes) public abstract
     *      java.nio.file.FileVisitResult
     *      java.nio.file.FileVisitor.visitFile(java.lang.Object,java.nio.file.attribute.BasicFileAttributes) throws
     *      java.io.IOException (the hereby targeted method-under-test)
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
     * Test method for {@link java.nio.file.FileVisitor#visitFileFailed(Object, java.io.IOException) public abstract
     * java.nio.file.FileVisitResult java.nio.file.FileVisitor.visitFileFailed(T,java.io.IOException) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.FileVisitor#visitFileFailed(Object, java.io.IOException) public abstract
     * java.nio.file.FileVisitResult java.nio.file.FileVisitor.visitFileFailed(java.lang.Object,java.io.IOException)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileVisitor#visitFileFailed(Object, java.io.IOException) public abstract
     *      java.nio.file.FileVisitResult
     *      java.nio.file.FileVisitor.visitFileFailed(java.lang.Object,java.io.IOException) throws java.io.IOException
     *      (the hereby targeted method-under-test)
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
     * {@link java.nio.file.FileVisitor#preVisitDirectory(Object, java.nio.file.attribute.BasicFileAttributes) public
     * abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.preVisitDirectory(T,java.nio.file.attribute.BasicFileAttributes) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.FileVisitor#preVisitDirectory(Object, java.nio.file.attribute.BasicFileAttributes) public
     * abstract java.nio.file.FileVisitResult
     * java.nio.file.FileVisitor.preVisitDirectory(java.lang.Object,java.nio.file.attribute.BasicFileAttributes) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.FileVisitor#preVisitDirectory(Object, java.nio.file.attribute.BasicFileAttributes) public
     *      abstract java.nio.file.FileVisitResult
     *      java.nio.file.FileVisitor.preVisitDirectory(java.lang.Object,java.nio.file.attribute.BasicFileAttributes)
     *      throws java.io.IOException (the hereby targeted method-under-test)
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
