package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.attribute.AclFileAttributeView interface
 * java.nio.file.attribute.AclFileAttributeView}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.file.attribute.AclFileAttributeViewTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.attribute.AclFileAttributeViewClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.attribute.AclFileAttributeView
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AclFileAttributeViewTests<SUT extends java.nio.file.attribute.AclFileAttributeView>
extends org.j8unit.repository.java.nio.file.attribute.FileOwnerAttributeViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#getAcl() public abstract java.util.List
     * java.nio.file.attribute.AclFileAttributeView.getAcl() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.AclFileAttributeView#getAcl()
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

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#name() public abstract java.lang.String
     * java.nio.file.attribute.AclFileAttributeView.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.AclFileAttributeView#name()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#setAcl(java.util.List) public abstract void
     * java.nio.file.attribute.AclFileAttributeView.setAcl(java.util.List) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.AclFileAttributeView#setAcl(java.util.List)
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

}
