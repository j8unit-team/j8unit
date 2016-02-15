package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.logging.ErrorManager class java.util.logging.ErrorManager}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ErrorManagerClassTests}.
 * </p>
 *
 * @see java.util.logging.ErrorManager class java.util.logging.ErrorManager (the hereby targeted class-under-test class)
 * @see ErrorManagerClassTests ErrorManagerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ErrorManagerTests<SUT extends java.util.logging.ErrorManager>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.ErrorManager#error(String, Exception, int) public synchronized void
     * java.util.logging.ErrorManager.error(java.lang.String,java.lang.Exception,int)}.
     *
     * <p>
     * Test method for {@link java.util.logging.ErrorManager#error(String, Exception, int) public synchronized void
     * java.util.logging.ErrorManager.error(java.lang.String,java.lang.Exception,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.logging.ErrorManager#error(String, Exception, int) public synchronized void
     *      java.util.logging.ErrorManager.error(java.lang.String,java.lang.Exception,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_error_String_Exception_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
