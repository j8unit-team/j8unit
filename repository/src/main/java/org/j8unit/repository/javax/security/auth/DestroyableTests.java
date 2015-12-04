package org.j8unit.repository.javax.security.auth;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.security.auth.Destroyable interface javax.security.auth.Destroyable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.DestroyableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DestroyableTests<SUT extends javax.security.auth.Destroyable>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.security.auth.Destroyable#isDestroyed() public default boolean javax.security.auth.Destroyable.isDestroyed()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDestroyed() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Destroyable#destroy() public default void javax.security.auth.Destroyable.destroy() throws javax.security.auth.DestroyFailedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_destroy() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
