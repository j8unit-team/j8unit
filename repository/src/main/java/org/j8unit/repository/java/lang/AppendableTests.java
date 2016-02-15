package org.j8unit.repository.java.lang;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Appendable interface java.lang.Appendable}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link AppendableClassTests}.
 * </p>
 *
 * @see Appendable interface java.lang.Appendable (the hereby targeted class-under-test class)
 * @see AppendableClassTests AppendableClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AppendableTests<SUT extends Appendable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link Appendable#append(CharSequence) public abstract java.lang.Appendable
     * java.lang.Appendable.append(java.lang.CharSequence) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link Appendable#append(CharSequence) public abstract java.lang.Appendable
     * java.lang.Appendable.append(java.lang.CharSequence) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Appendable#append(CharSequence) public abstract java.lang.Appendable
     *      java.lang.Appendable.append(java.lang.CharSequence) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_append_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Appendable#append(CharSequence, int, int) public abstract java.lang.Appendable
     * java.lang.Appendable.append(java.lang.CharSequence,int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link Appendable#append(CharSequence, int, int) public abstract java.lang.Appendable
     * java.lang.Appendable.append(java.lang.CharSequence,int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Appendable#append(CharSequence, int, int) public abstract java.lang.Appendable
     *      java.lang.Appendable.append(java.lang.CharSequence,int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_append_CharSequence_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Appendable#append(char) public abstract java.lang.Appendable
     * java.lang.Appendable.append(char) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link Appendable#append(char) public abstract java.lang.Appendable
     * java.lang.Appendable.append(char) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Appendable#append(char) public abstract java.lang.Appendable java.lang.Appendable.append(char) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_append_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
