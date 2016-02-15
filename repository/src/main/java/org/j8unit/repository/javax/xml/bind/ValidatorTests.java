package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.Validator interface javax.xml.bind.Validator}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ValidatorClassTests}.
 * </p>
 *
 * @see javax.xml.bind.Validator interface javax.xml.bind.Validator (the hereby targeted class-under-test class)
 * @see ValidatorClassTests ValidatorClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValidatorTests<SUT extends javax.xml.bind.Validator>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Validator#validate(Object) public abstract boolean
     * javax.xml.bind.Validator.validate(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Validator#validate(Object) public abstract boolean
     * javax.xml.bind.Validator.validate(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Validator#validate(Object) public abstract boolean
     *      javax.xml.bind.Validator.validate(java.lang.Object) throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validate_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Validator#validateRoot(Object) public abstract boolean
     * javax.xml.bind.Validator.validateRoot(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Validator#validateRoot(Object) public abstract boolean
     * javax.xml.bind.Validator.validateRoot(java.lang.Object) throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Validator#validateRoot(Object) public abstract boolean
     *      javax.xml.bind.Validator.validateRoot(java.lang.Object) throws javax.xml.bind.JAXBException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validateRoot_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Validator#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Validator.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Validator#setEventHandler(javax.xml.bind.ValidationEventHandler) public
     * abstract void javax.xml.bind.Validator.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Validator#setEventHandler(javax.xml.bind.ValidationEventHandler) public abstract void
     *      javax.xml.bind.Validator.setEventHandler(javax.xml.bind.ValidationEventHandler) throws
     *      javax.xml.bind.JAXBException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEventHandler_ValidationEventHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Validator#setProperty(String, Object) public abstract void
     * javax.xml.bind.Validator.setProperty(java.lang.String,java.lang.Object) throws javax.xml.bind.PropertyException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Validator#setProperty(String, Object) public abstract void
     * javax.xml.bind.Validator.setProperty(java.lang.String,java.lang.Object) throws javax.xml.bind.PropertyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Validator#setProperty(String, Object) public abstract void
     *      javax.xml.bind.Validator.setProperty(java.lang.String,java.lang.Object) throws
     *      javax.xml.bind.PropertyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setProperty_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Validator#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Validator.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Validator#getEventHandler() public abstract
     * javax.xml.bind.ValidationEventHandler javax.xml.bind.Validator.getEventHandler() throws
     * javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Validator#getEventHandler() public abstract javax.xml.bind.ValidationEventHandler
     *      javax.xml.bind.Validator.getEventHandler() throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEventHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.Validator#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Validator.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.Validator#getProperty(String) public abstract java.lang.Object
     * javax.xml.bind.Validator.getProperty(java.lang.String) throws javax.xml.bind.PropertyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.Validator#getProperty(String) public abstract java.lang.Object
     *      javax.xml.bind.Validator.getProperty(java.lang.String) throws javax.xml.bind.PropertyException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProperty_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
