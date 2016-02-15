package org.j8unit.repository.javax.xml.transform;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.TransformerFactoryConfigurationError class
 * javax.xml.transform.TransformerFactoryConfigurationError}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link TransformerFactoryConfigurationErrorClassTests}.
 * </p>
 *
 * @see javax.xml.transform.TransformerFactoryConfigurationError class
 *      javax.xml.transform.TransformerFactoryConfigurationError (the hereby targeted class-under-test class)
 * @see TransformerFactoryConfigurationErrorClassTests TransformerFactoryConfigurationErrorClassTests (the complementary
 *      j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformerFactoryConfigurationErrorTests<SUT extends javax.xml.transform.TransformerFactoryConfigurationError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getMessage() public
     * java.lang.String javax.xml.transform.TransformerFactoryConfigurationError.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getMessage() public
     * java.lang.String javax.xml.transform.TransformerFactoryConfigurationError.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.TransformerFactoryConfigurationError#getMessage() public java.lang.String
     *      javax.xml.transform.TransformerFactoryConfigurationError.getMessage() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getCause() public
     * java.lang.Throwable javax.xml.transform.TransformerFactoryConfigurationError.getCause()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getCause() public
     * java.lang.Throwable javax.xml.transform.TransformerFactoryConfigurationError.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.TransformerFactoryConfigurationError#getCause() public java.lang.Throwable
     *      javax.xml.transform.TransformerFactoryConfigurationError.getCause() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getException() public
     * java.lang.Exception javax.xml.transform.TransformerFactoryConfigurationError.getException()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getException() public
     * java.lang.Exception javax.xml.transform.TransformerFactoryConfigurationError.getException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.TransformerFactoryConfigurationError#getException() public java.lang.Exception
     *      javax.xml.transform.TransformerFactoryConfigurationError.getException() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
