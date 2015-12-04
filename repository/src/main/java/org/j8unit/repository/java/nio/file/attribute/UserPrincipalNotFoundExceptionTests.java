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
 * Test class for {@link java.nio.file.attribute.UserPrincipalNotFoundException class java.nio.file.attribute.UserPrincipalNotFoundException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.attribute.UserPrincipalNotFoundExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UserPrincipalNotFoundExceptionTests<SUT extends java.nio.file.attribute.UserPrincipalNotFoundException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserPrincipalNotFoundException#getName() public java.lang.String java.nio.file.attribute.UserPrincipalNotFoundException.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
