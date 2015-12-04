package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.attribute.PosixFileAttributes interface
 * java.nio.file.attribute.PosixFileAttributes}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.attribute.PosixFileAttributesClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PosixFileAttributesTests<SUT extends java.nio.file.attribute.PosixFileAttributes>
extends org.j8unit.repository.java.nio.file.attribute.BasicFileAttributesTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributes#owner() public abstract
     * java.nio.file.attribute.UserPrincipal java.nio.file.attribute.PosixFileAttributes.owner()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_owner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributes#permissions() public abstract java.util.Set
     * java.nio.file.attribute.PosixFileAttributes.permissions()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permissions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributes#group() public abstract
     * java.nio.file.attribute.GroupPrincipal java.nio.file.attribute.PosixFileAttributes.group()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_group()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
