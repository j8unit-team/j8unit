package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.PosixFileAttributeView interface
 * java.nio.file.attribute.PosixFileAttributeView}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link PosixFileAttributeViewClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.PosixFileAttributeView interface java.nio.file.attribute.PosixFileAttributeView (the
 *      hereby targeted class-under-test class)
 * @see PosixFileAttributeViewClassTests PosixFileAttributeViewClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PosixFileAttributeViewTests<SUT extends java.nio.file.attribute.PosixFileAttributeView>
extends BasicFileAttributeViewTests<SUT>, FileOwnerAttributeViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributeView#readAttributes() public abstract
     * java.nio.file.attribute.PosixFileAttributes java.nio.file.attribute.PosixFileAttributeView.readAttributes()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributeView#readAttributes() public abstract
     * java.nio.file.attribute.PosixFileAttributes java.nio.file.attribute.PosixFileAttributeView.readAttributes()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.PosixFileAttributeView#readAttributes() public abstract
     *      java.nio.file.attribute.PosixFileAttributes java.nio.file.attribute.PosixFileAttributeView.readAttributes()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_readAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.attribute.PosixFileAttributeView#setGroup(java.nio.file.attribute.GroupPrincipal) public
     * abstract void java.nio.file.attribute.PosixFileAttributeView.setGroup(java.nio.file.attribute.GroupPrincipal)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.attribute.PosixFileAttributeView#setGroup(java.nio.file.attribute.GroupPrincipal) public
     * abstract void java.nio.file.attribute.PosixFileAttributeView.setGroup(java.nio.file.attribute.GroupPrincipal)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.PosixFileAttributeView#setGroup(java.nio.file.attribute.GroupPrincipal) public
     *      abstract void
     *      java.nio.file.attribute.PosixFileAttributeView.setGroup(java.nio.file.attribute.GroupPrincipal) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setGroup_GroupPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributeView#setPermissions(java.util.Set) public
     * abstract void java.nio.file.attribute.PosixFileAttributeView.setPermissions(java.util.Set
     * <java.nio.file.attribute.PosixFilePermission>) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributeView#setPermissions(java.util.Set) public
     * abstract void java.nio.file.attribute.PosixFileAttributeView.setPermissions(java.util.Set) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.PosixFileAttributeView#setPermissions(java.util.Set) public abstract void
     *      java.nio.file.attribute.PosixFileAttributeView.setPermissions(java.util.Set) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPermissions_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributeView#name() public abstract java.lang.String
     * java.nio.file.attribute.PosixFileAttributeView.name()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.PosixFileAttributeView#name() public abstract java.lang.String
     * java.nio.file.attribute.PosixFileAttributeView.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.PosixFileAttributeView#name() public abstract java.lang.String
     *      java.nio.file.attribute.PosixFileAttributeView.name() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
