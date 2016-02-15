package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.JAXBContext class javax.xml.bind.JAXBContext}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JAXBContextClassTests}.
 * </p>
 *
 * @see javax.xml.bind.JAXBContext class javax.xml.bind.JAXBContext (the hereby targeted class-under-test class)
 * @see JAXBContextClassTests JAXBContextClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBContextTests<SUT extends javax.xml.bind.JAXBContext>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createBinder() public javax.xml.bind.Binder
     * <org.w3c.dom.Node> javax.xml.bind.JAXBContext.createBinder()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createBinder() public javax.xml.bind.Binder
     * javax.xml.bind.JAXBContext.createBinder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBContext#createBinder() public javax.xml.bind.Binder
     *      javax.xml.bind.JAXBContext.createBinder() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createBinder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createBinder(Class) public <T> javax.xml.bind.Binder
     * <T> javax.xml.bind.JAXBContext.createBinder(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createBinder(Class) public javax.xml.bind.Binder
     * javax.xml.bind.JAXBContext.createBinder(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBContext#createBinder(Class) public javax.xml.bind.Binder
     *      javax.xml.bind.JAXBContext.createBinder(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createBinder_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createUnmarshaller() public abstract
     * javax.xml.bind.Unmarshaller javax.xml.bind.JAXBContext.createUnmarshaller() throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createUnmarshaller() public abstract
     * javax.xml.bind.Unmarshaller javax.xml.bind.JAXBContext.createUnmarshaller() throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBContext#createUnmarshaller() public abstract javax.xml.bind.Unmarshaller
     *      javax.xml.bind.JAXBContext.createUnmarshaller() throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createUnmarshaller()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createJAXBIntrospector() public javax.xml.bind.JAXBIntrospector
     * javax.xml.bind.JAXBContext.createJAXBIntrospector()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createJAXBIntrospector() public javax.xml.bind.JAXBIntrospector
     * javax.xml.bind.JAXBContext.createJAXBIntrospector()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBContext#createJAXBIntrospector() public javax.xml.bind.JAXBIntrospector
     *      javax.xml.bind.JAXBContext.createJAXBIntrospector() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createJAXBIntrospector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#generateSchema(javax.xml.bind.SchemaOutputResolver) public void
     * javax.xml.bind.JAXBContext.generateSchema(javax.xml.bind.SchemaOutputResolver) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#generateSchema(javax.xml.bind.SchemaOutputResolver) public void
     * javax.xml.bind.JAXBContext.generateSchema(javax.xml.bind.SchemaOutputResolver) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBContext#generateSchema(javax.xml.bind.SchemaOutputResolver) public void
     *      javax.xml.bind.JAXBContext.generateSchema(javax.xml.bind.SchemaOutputResolver) throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSchema_SchemaOutputResolver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createValidator() public abstract javax.xml.bind.Validator
     * javax.xml.bind.JAXBContext.createValidator() throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createValidator() public abstract javax.xml.bind.Validator
     * javax.xml.bind.JAXBContext.createValidator() throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBContext#createValidator() public abstract javax.xml.bind.Validator
     *      javax.xml.bind.JAXBContext.createValidator() throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createValidator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createMarshaller() public abstract javax.xml.bind.Marshaller
     * javax.xml.bind.JAXBContext.createMarshaller() throws javax.xml.bind.JAXBException}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.JAXBContext#createMarshaller() public abstract javax.xml.bind.Marshaller
     * javax.xml.bind.JAXBContext.createMarshaller() throws javax.xml.bind.JAXBException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.JAXBContext#createMarshaller() public abstract javax.xml.bind.Marshaller
     *      javax.xml.bind.JAXBContext.createMarshaller() throws javax.xml.bind.JAXBException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMarshaller()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
