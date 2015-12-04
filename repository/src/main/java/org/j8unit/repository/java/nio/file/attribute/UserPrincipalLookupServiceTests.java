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
 * Test class for {@link java.nio.file.attribute.UserPrincipalLookupService class java.nio.file.attribute.UserPrincipalLookupService},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.attribute.UserPrincipalLookupServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UserPrincipalLookupServiceTests<SUT extends java.nio.file.attribute.UserPrincipalLookupService>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserPrincipalLookupService#lookupPrincipalByGroupName(java.lang.String) public abstract java.nio.file.attribute.GroupPrincipal java.nio.file.attribute.UserPrincipalLookupService.lookupPrincipalByGroupName(java.lang.String) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupPrincipalByGroupName_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserPrincipalLookupService#lookupPrincipalByName(java.lang.String) public abstract java.nio.file.attribute.UserPrincipal java.nio.file.attribute.UserPrincipalLookupService.lookupPrincipalByName(java.lang.String) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupPrincipalByName_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
