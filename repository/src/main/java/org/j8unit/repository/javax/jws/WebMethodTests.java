package org.j8unit.repository.javax.jws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.jws.WebMethod interface javax.jws.WebMethod}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link WebMethodClassTests}.
 * </p>
 *
 * @see javax.jws.WebMethod interface javax.jws.WebMethod (the hereby targeted class-under-test class)
 * @see WebMethodClassTests WebMethodClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebMethodTests<SUT extends javax.jws.WebMethod>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.jws.WebMethod#action() public abstract java.lang.String
     * javax.jws.WebMethod.action()}.
     *
     * <p>
     * Test method for {@link javax.jws.WebMethod#action() public abstract java.lang.String
     * javax.jws.WebMethod.action()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.jws.WebMethod#action() public abstract java.lang.String javax.jws.WebMethod.action() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_action()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.WebMethod#exclude() public abstract boolean javax.jws.WebMethod.exclude()}.
     *
     * <p>
     * Test method for {@link javax.jws.WebMethod#exclude() public abstract boolean javax.jws.WebMethod.exclude()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.jws.WebMethod#exclude() public abstract boolean javax.jws.WebMethod.exclude() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exclude()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.WebMethod#operationName() public abstract java.lang.String
     * javax.jws.WebMethod.operationName()}.
     *
     * <p>
     * Test method for {@link javax.jws.WebMethod#operationName() public abstract java.lang.String
     * javax.jws.WebMethod.operationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.jws.WebMethod#operationName() public abstract java.lang.String javax.jws.WebMethod.operationName()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_operationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
