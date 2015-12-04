package org.j8unit.repository.javax.xml.stream;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.stream.FactoryConfigurationError class javax.xml.stream.FactoryConfigurationError},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.FactoryConfigurationErrorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FactoryConfigurationErrorTests<SUT extends javax.xml.stream.FactoryConfigurationError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.stream.FactoryConfigurationError#getCause() public java.lang.Throwable javax.xml.stream.FactoryConfigurationError.getCause()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCause() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.FactoryConfigurationError#getMessage() public java.lang.String javax.xml.stream.FactoryConfigurationError.getMessage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMessage() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.FactoryConfigurationError#getException() public java.lang.Exception javax.xml.stream.FactoryConfigurationError.getException()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
