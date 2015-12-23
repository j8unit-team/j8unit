package org.j8unit.repository.java.security;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.AlgorithmConstraints interface
 * java.security.AlgorithmConstraints}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.AlgorithmConstraintsTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.AlgorithmConstraintsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.AlgorithmConstraints
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AlgorithmConstraintsTests<SUT extends java.security.AlgorithmConstraints>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.AlgorithmConstraints#permits(java.util.Set, java.security.Key) public
     * abstract boolean java.security.AlgorithmConstraints.permits(java.util.Set,java.security.Key)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.AlgorithmConstraints#permits(java.util.Set, java.security.Key)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permits_Set_Key()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AlgorithmConstraints#permits(java.util.Set, java.lang.String, java.security.AlgorithmParameters)
     * public abstract boolean
     * java.security.AlgorithmConstraints.permits(java.util.Set,java.lang.String,java.security.AlgorithmParameters)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.AlgorithmConstraints#permits(java.util.Set, java.lang.String,
     *             java.security.AlgorithmParameters)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permits_Set_String_AlgorithmParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AlgorithmConstraints#permits(java.util.Set, java.lang.String, java.security.Key, java.security.AlgorithmParameters)
     * public abstract boolean
     * java.security.AlgorithmConstraints.permits(java.util.Set,java.lang.String,java.security.Key,java.security.AlgorithmParameters)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.AlgorithmConstraints#permits(java.util.Set, java.lang.String, java.security.Key,
     *             java.security.AlgorithmParameters)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permits_Set_String_Key_AlgorithmParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
