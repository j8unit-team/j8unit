package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.file.attribute.AclFileAttributeView interface java.nio.file.attribute.AclFileAttributeView},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.attribute.AclFileAttributeViewClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AclFileAttributeViewTests<SUT extends java.nio.file.attribute.AclFileAttributeView>
extends org.j8unit.repository.java.nio.file.attribute.FileOwnerAttributeViewTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#name() public abstract java.lang.String java.nio.file.attribute.AclFileAttributeView.name()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_name() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#setAcl(java.util.List) public abstract void java.nio.file.attribute.AclFileAttributeView.setAcl(java.util.List) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAcl_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.AclFileAttributeView#getAcl() public abstract java.util.List java.nio.file.attribute.AclFileAttributeView.getAcl() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAcl() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
