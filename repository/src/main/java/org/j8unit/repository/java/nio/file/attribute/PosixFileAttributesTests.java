package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.PosixFileAttributes interface
 * java.nio.file.attribute.PosixFileAttributes}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PosixFileAttributesClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.PosixFileAttributes interface java.nio.file.attribute.PosixFileAttributes (the hereby
 *      targeted class-under-test class)
 * @see PosixFileAttributesClassTests PosixFileAttributesClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PosixFileAttributesTests<SUT extends java.nio.file.attribute.PosixFileAttributes>
extends BasicFileAttributesTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributes#owner() public abstract
     * java.nio.file.attribute.UserPrincipal java.nio.file.attribute.PosixFileAttributes.owner()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributes#owner() public abstract
     * java.nio.file.attribute.UserPrincipal java.nio.file.attribute.PosixFileAttributes.owner()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.PosixFileAttributes#owner() public abstract java.nio.file.attribute.UserPrincipal
     *      java.nio.file.attribute.PosixFileAttributes.owner() (the hereby targeted method-under-test)
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
     * <java.nio.file.attribute.PosixFilePermission> java.nio.file.attribute.PosixFileAttributes.permissions()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributes#permissions() public abstract java.util.Set
     * java.nio.file.attribute.PosixFileAttributes.permissions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.PosixFileAttributes#permissions() public abstract java.util.Set
     *      java.nio.file.attribute.PosixFileAttributes.permissions() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributes#group() public abstract
     * java.nio.file.attribute.GroupPrincipal java.nio.file.attribute.PosixFileAttributes.group()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.PosixFileAttributes#group() public abstract java.nio.file.attribute.GroupPrincipal
     *      java.nio.file.attribute.PosixFileAttributes.group() (the hereby targeted method-under-test)
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
