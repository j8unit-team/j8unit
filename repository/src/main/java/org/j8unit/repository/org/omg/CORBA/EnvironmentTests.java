package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.Environment class org.omg.CORBA.Environment}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link EnvironmentClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.Environment class org.omg.CORBA.Environment (the hereby targeted class-under-test class)
 * @see EnvironmentClassTests EnvironmentClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnvironmentTests<SUT extends org.omg.CORBA.Environment>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.Environment#clear() public abstract void org.omg.CORBA.Environment.clear()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.Environment#clear() public abstract void org.omg.CORBA.Environment.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.Environment#clear() public abstract void org.omg.CORBA.Environment.clear() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.Environment#exception() public abstract java.lang.Exception
     * org.omg.CORBA.Environment.exception()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.Environment#exception() public abstract java.lang.Exception
     * org.omg.CORBA.Environment.exception()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.Environment#exception() public abstract java.lang.Exception
     *      org.omg.CORBA.Environment.exception() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exception()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.Environment#exception(Exception) public abstract void
     * org.omg.CORBA.Environment.exception(java.lang.Exception)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.Environment#exception(Exception) public abstract void
     * org.omg.CORBA.Environment.exception(java.lang.Exception)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.Environment#exception(Exception) public abstract void
     *      org.omg.CORBA.Environment.exception(java.lang.Exception) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exception_Exception()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
