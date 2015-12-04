package org.j8unit.repository.java.security;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.AlgorithmConstraints interface java.security.AlgorithmConstraints},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.AlgorithmConstraintsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AlgorithmConstraintsTests<SUT extends java.security.AlgorithmConstraints>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.AlgorithmConstraints#permits(java.util.Set,java.lang.String,java.security.AlgorithmParameters) public abstract boolean java.security.AlgorithmConstraints.permits(java.util.Set,java.lang.String,java.security.AlgorithmParameters)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permits_Set_String_AlgorithmParameters() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AlgorithmConstraints#permits(java.util.Set,java.security.Key) public abstract boolean java.security.AlgorithmConstraints.permits(java.util.Set,java.security.Key)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permits_Set_Key() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AlgorithmConstraints#permits(java.util.Set,java.lang.String,java.security.Key,java.security.AlgorithmParameters) public abstract boolean java.security.AlgorithmConstraints.permits(java.util.Set,java.lang.String,java.security.Key,java.security.AlgorithmParameters)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permits_Set_String_Key_AlgorithmParameters() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
