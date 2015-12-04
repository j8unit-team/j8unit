package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.parsers.FactoryConfigurationError class javax.xml.parsers.FactoryConfigurationError},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.parsers.FactoryConfigurationErrorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FactoryConfigurationErrorTests<SUT extends javax.xml.parsers.FactoryConfigurationError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.parsers.FactoryConfigurationError#getCause() public java.lang.Throwable
     * javax.xml.parsers.FactoryConfigurationError.getCause()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.parsers.FactoryConfigurationError#getException() public java.lang.Exception
     * javax.xml.parsers.FactoryConfigurationError.getException()}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.xml.parsers.FactoryConfigurationError#getMessage() public java.lang.String
     * javax.xml.parsers.FactoryConfigurationError.getMessage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
