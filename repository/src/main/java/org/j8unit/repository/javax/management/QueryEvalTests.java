package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.QueryEval class javax.management.QueryEval}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link QueryEvalClassTests}.
 * </p>
 *
 * @see javax.management.QueryEval class javax.management.QueryEval (the hereby targeted class-under-test class)
 * @see QueryEvalClassTests QueryEvalClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface QueryEvalTests<SUT extends javax.management.QueryEval>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.QueryEval#setMBeanServer(javax.management.MBeanServer) public void
     * javax.management.QueryEval.setMBeanServer(javax.management.MBeanServer)}.
     *
     * <p>
     * Test method for {@link javax.management.QueryEval#setMBeanServer(javax.management.MBeanServer) public void
     * javax.management.QueryEval.setMBeanServer(javax.management.MBeanServer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.QueryEval#setMBeanServer(javax.management.MBeanServer) public void
     *      javax.management.QueryEval.setMBeanServer(javax.management.MBeanServer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMBeanServer_MBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
