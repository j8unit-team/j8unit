package org.j8unit.repository.javax.xml.validation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.validation.Schema class javax.xml.validation.Schema}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SchemaClassTests}.
 * </p>
 *
 * @see javax.xml.validation.Schema class javax.xml.validation.Schema (the hereby targeted class-under-test class)
 * @see SchemaClassTests SchemaClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SchemaTests<SUT extends javax.xml.validation.Schema>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.validation.Schema#newValidatorHandler() public abstract
     * javax.xml.validation.ValidatorHandler javax.xml.validation.Schema.newValidatorHandler()}.
     *
     * <p>
     * Test method for {@link javax.xml.validation.Schema#newValidatorHandler() public abstract
     * javax.xml.validation.ValidatorHandler javax.xml.validation.Schema.newValidatorHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.validation.Schema#newValidatorHandler() public abstract javax.xml.validation.ValidatorHandler
     *      javax.xml.validation.Schema.newValidatorHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newValidatorHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.validation.Schema#newValidator() public abstract javax.xml.validation.Validator
     * javax.xml.validation.Schema.newValidator()}.
     *
     * <p>
     * Test method for {@link javax.xml.validation.Schema#newValidator() public abstract javax.xml.validation.Validator
     * javax.xml.validation.Schema.newValidator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.validation.Schema#newValidator() public abstract javax.xml.validation.Validator
     *      javax.xml.validation.Schema.newValidator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newValidator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
