package org.j8unit.repository.javax.xml.transform;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.transform.TransformerFactoryConfigurationError class javax.xml.transform.TransformerFactoryConfigurationError},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.TransformerFactoryConfigurationErrorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TransformerFactoryConfigurationErrorTests<SUT extends javax.xml.transform.TransformerFactoryConfigurationError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getMessage() public java.lang.String javax.xml.transform.TransformerFactoryConfigurationError.getMessage()}.
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
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getCause() public java.lang.Throwable javax.xml.transform.TransformerFactoryConfigurationError.getCause()}.
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
     * Test method for {@link javax.xml.transform.TransformerFactoryConfigurationError#getException() public java.lang.Exception javax.xml.transform.TransformerFactoryConfigurationError.getException()}.
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
