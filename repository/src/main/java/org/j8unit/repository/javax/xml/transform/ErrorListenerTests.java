package org.j8unit.repository.javax.xml.transform;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.transform.ErrorListener interface
 * javax.xml.transform.ErrorListener}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.transform.ErrorListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.transform.ErrorListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.transform.ErrorListener
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.transform.ErrorListener#error(javax.xml.transform.TransformerException)
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
     * Test method for {@link javax.xml.transform.ErrorListener#fatalError(javax.xml.transform.TransformerException)
     * public abstract void javax.xml.transform.ErrorListener.fatalError(javax.xml.transform.TransformerException)
     * throws javax.xml.transform.TransformerException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.transform.ErrorListener#fatalError(javax.xml.transform.TransformerException)
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

    /**
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
     * @j8unit.aim javax.xml.transform.ErrorListener#warning(javax.xml.transform.TransformerException)
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

}
