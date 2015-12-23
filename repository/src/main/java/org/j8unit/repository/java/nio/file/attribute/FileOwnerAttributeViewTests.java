package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.attribute.FileOwnerAttributeView interface
 * java.nio.file.attribute.FileOwnerAttributeView}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.file.attribute.FileOwnerAttributeViewTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.attribute.FileOwnerAttributeViewClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.attribute.FileOwnerAttributeView
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileOwnerAttributeViewTests<SUT extends java.nio.file.attribute.FileOwnerAttributeView>
extends org.j8unit.repository.java.nio.file.attribute.FileAttributeViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.FileOwnerAttributeView#getOwner() public abstract
     * java.nio.file.attribute.UserPrincipal java.nio.file.attribute.FileOwnerAttributeView.getOwner() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.FileOwnerAttributeView#getOwner()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOwner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.FileOwnerAttributeView#name() public abstract java.lang.String
     * java.nio.file.attribute.FileOwnerAttributeView.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.FileOwnerAttributeView#name()
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
     * Test method for
     * {@link java.nio.file.attribute.FileOwnerAttributeView#setOwner(java.nio.file.attribute.UserPrincipal) public
     * abstract void java.nio.file.attribute.FileOwnerAttributeView.setOwner(java.nio.file.attribute.UserPrincipal)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.FileOwnerAttributeView#setOwner(java.nio.file.attribute.UserPrincipal)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOwner_UserPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
