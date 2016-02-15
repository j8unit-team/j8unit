package org.j8unit.repository.javax.jws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.jws.HandlerChain interface javax.jws.HandlerChain}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link HandlerChainClassTests}.
 * </p>
 *
 * @see javax.jws.HandlerChain interface javax.jws.HandlerChain (the hereby targeted class-under-test class)
 * @see HandlerChainClassTests HandlerChainClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HandlerChainTests<SUT extends javax.jws.HandlerChain>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.jws.HandlerChain#name() public abstract java.lang.String
     * javax.jws.HandlerChain.name()}.
     *
     * <p>
     * Test method for {@link javax.jws.HandlerChain#name() public abstract java.lang.String
     * javax.jws.HandlerChain.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.jws.HandlerChain#name() public abstract java.lang.String javax.jws.HandlerChain.name() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.jws.HandlerChain#file() public abstract java.lang.String
     * javax.jws.HandlerChain.file()}.
     *
     * <p>
     * Test method for {@link javax.jws.HandlerChain#file() public abstract java.lang.String
     * javax.jws.HandlerChain.file()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.jws.HandlerChain#file() public abstract java.lang.String javax.jws.HandlerChain.file() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_file()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
