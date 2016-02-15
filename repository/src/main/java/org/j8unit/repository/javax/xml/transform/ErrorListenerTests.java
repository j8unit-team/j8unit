package org.j8unit.repository.javax.xml.transform;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.ErrorListener interface
 * javax.xml.transform.ErrorListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ErrorListenerClassTests}.
 * </p>
 *
 * @see javax.xml.transform.ErrorListener interface javax.xml.transform.ErrorListener (the hereby targeted
 *      class-under-test class)
 * @see ErrorListenerClassTests ErrorListenerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ErrorListenerTests<SUT extends javax.xml.transform.ErrorListener>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#error(javax.xml.transform.TransformerException) public
     * abstract void javax.xml.transform.ErrorListener.error(javax.xml.transform.TransformerException) throws
     * javax.xml.transform.TransformerException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#error(javax.xml.transform.TransformerException) public
     * abstract void javax.xml.transform.ErrorListener.error(javax.xml.transform.TransformerException) throws
     * javax.xml.transform.TransformerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.ErrorListener#error(javax.xml.transform.TransformerException) public abstract void
     *      javax.xml.transform.ErrorListener.error(javax.xml.transform.TransformerException) throws
     *      javax.xml.transform.TransformerException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_error_TransformerException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#warning(javax.xml.transform.TransformerException) public
     * abstract void javax.xml.transform.ErrorListener.warning(javax.xml.transform.TransformerException) throws
     * javax.xml.transform.TransformerException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#warning(javax.xml.transform.TransformerException) public
     * abstract void javax.xml.transform.ErrorListener.warning(javax.xml.transform.TransformerException) throws
     * javax.xml.transform.TransformerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.ErrorListener#warning(javax.xml.transform.TransformerException) public abstract void
     *      javax.xml.transform.ErrorListener.warning(javax.xml.transform.TransformerException) throws
     *      javax.xml.transform.TransformerException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_warning_TransformerException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#fatalError(javax.xml.transform.TransformerException)
     * public abstract void javax.xml.transform.ErrorListener.fatalError(javax.xml.transform.TransformerException)
     * throws javax.xml.transform.TransformerException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.ErrorListener#fatalError(javax.xml.transform.TransformerException)
     * public abstract void javax.xml.transform.ErrorListener.fatalError(javax.xml.transform.TransformerException)
     * throws javax.xml.transform.TransformerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.ErrorListener#fatalError(javax.xml.transform.TransformerException) public abstract void
     *      javax.xml.transform.ErrorListener.fatalError(javax.xml.transform.TransformerException) throws
     *      javax.xml.transform.TransformerException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fatalError_TransformerException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
