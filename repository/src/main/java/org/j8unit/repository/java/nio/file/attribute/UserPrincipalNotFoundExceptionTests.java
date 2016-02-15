package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.UserPrincipalNotFoundException class
 * java.nio.file.attribute.UserPrincipalNotFoundException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UserPrincipalNotFoundExceptionClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.UserPrincipalNotFoundException class
 *      java.nio.file.attribute.UserPrincipalNotFoundException (the hereby targeted class-under-test class)
 * @see UserPrincipalNotFoundExceptionClassTests UserPrincipalNotFoundExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UserPrincipalNotFoundExceptionTests<SUT extends java.nio.file.attribute.UserPrincipalNotFoundException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserPrincipalNotFoundException#getName() public java.lang.String
     * java.nio.file.attribute.UserPrincipalNotFoundException.getName()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.UserPrincipalNotFoundException#getName() public java.lang.String
     * java.nio.file.attribute.UserPrincipalNotFoundException.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.UserPrincipalNotFoundException#getName() public java.lang.String
     *      java.nio.file.attribute.UserPrincipalNotFoundException.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
