package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.AclFileAttributeView interface
 * java.nio.file.attribute.AclFileAttributeView}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AclFileAttributeViewClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.AclFileAttributeView interface java.nio.file.attribute.AclFileAttributeView (the hereby
 *      targeted class-under-test class)
 * @see AclFileAttributeViewClassTests AclFileAttributeViewClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AclFileAttributeViewTests<SUT extends java.nio.file.attribute.AclFileAttributeView>
extends FileOwnerAttributeViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#name() public abstract java.lang.String
     * java.nio.file.attribute.AclFileAttributeView.name()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#name() public abstract java.lang.String
     * java.nio.file.attribute.AclFileAttributeView.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.AclFileAttributeView#name() public abstract java.lang.String
     *      java.nio.file.attribute.AclFileAttributeView.name() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#setAcl(java.util.List) public abstract void
     * java.nio.file.attribute.AclFileAttributeView.setAcl(java.util.List<java.nio.file.attribute.AclEntry>) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#setAcl(java.util.List) public abstract void
     * java.nio.file.attribute.AclFileAttributeView.setAcl(java.util.List) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.AclFileAttributeView#setAcl(java.util.List) public abstract void
     *      java.nio.file.attribute.AclFileAttributeView.setAcl(java.util.List) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAcl_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#getAcl() public abstract java.util.List
     * <java.nio.file.attribute.AclEntry> java.nio.file.attribute.AclFileAttributeView.getAcl() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#getAcl() public abstract java.util.List
     * java.nio.file.attribute.AclFileAttributeView.getAcl() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.AclFileAttributeView#getAcl() public abstract java.util.List
     *      java.nio.file.attribute.AclFileAttributeView.getAcl() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAcl()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
