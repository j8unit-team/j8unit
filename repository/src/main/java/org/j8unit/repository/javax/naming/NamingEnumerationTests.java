package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.NamingEnumeration interface javax.naming.NamingEnumeration}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link NamingEnumerationClassTests}.
 * </p>
 *
 * @see javax.naming.NamingEnumeration interface javax.naming.NamingEnumeration (the hereby targeted class-under-test
 *      class)
 * @see NamingEnumerationClassTests NamingEnumerationClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingEnumerationTests<SUT extends javax.naming.NamingEnumeration<T>, T>
extends org.j8unit.repository.java.util.EnumerationTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link javax.naming.NamingEnumeration#hasMore() public abstract boolean
     * javax.naming.NamingEnumeration.hasMore() throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.NamingEnumeration#hasMore() public abstract boolean
     * javax.naming.NamingEnumeration.hasMore() throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.NamingEnumeration#hasMore() public abstract boolean javax.naming.NamingEnumeration.hasMore()
     *      throws javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasMore()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.NamingEnumeration#close() public abstract void
     * javax.naming.NamingEnumeration.close() throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.NamingEnumeration#close() public abstract void
     * javax.naming.NamingEnumeration.close() throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.NamingEnumeration#close() public abstract void javax.naming.NamingEnumeration.close() throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.NamingEnumeration#next() public abstract T
     * javax.naming.NamingEnumeration.next() throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.NamingEnumeration#next() public abstract java.lang.Object
     * javax.naming.NamingEnumeration.next() throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.NamingEnumeration#next() public abstract java.lang.Object javax.naming.NamingEnumeration.next()
     *      throws javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_next()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
