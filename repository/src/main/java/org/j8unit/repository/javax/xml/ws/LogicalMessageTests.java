package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.LogicalMessage interface javax.xml.ws.LogicalMessage}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LogicalMessageClassTests}.
 * </p>
 *
 * @see javax.xml.ws.LogicalMessage interface javax.xml.ws.LogicalMessage (the hereby targeted class-under-test class)
 * @see LogicalMessageClassTests LogicalMessageClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LogicalMessageTests<SUT extends javax.xml.ws.LogicalMessage>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#setPayload(javax.xml.transform.Source) public abstract void
     * javax.xml.ws.LogicalMessage.setPayload(javax.xml.transform.Source)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#setPayload(javax.xml.transform.Source) public abstract void
     * javax.xml.ws.LogicalMessage.setPayload(javax.xml.transform.Source)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.LogicalMessage#setPayload(javax.xml.transform.Source) public abstract void
     *      javax.xml.ws.LogicalMessage.setPayload(javax.xml.transform.Source) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPayload_Source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#setPayload(Object, javax.xml.bind.JAXBContext) public abstract
     * void javax.xml.ws.LogicalMessage.setPayload(java.lang.Object,javax.xml.bind.JAXBContext)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#setPayload(Object, javax.xml.bind.JAXBContext) public abstract
     * void javax.xml.ws.LogicalMessage.setPayload(java.lang.Object,javax.xml.bind.JAXBContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.LogicalMessage#setPayload(Object, javax.xml.bind.JAXBContext) public abstract void
     *      javax.xml.ws.LogicalMessage.setPayload(java.lang.Object,javax.xml.bind.JAXBContext) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPayload_Object_JAXBContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#getPayload(javax.xml.bind.JAXBContext) public abstract
     * java.lang.Object javax.xml.ws.LogicalMessage.getPayload(javax.xml.bind.JAXBContext)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#getPayload(javax.xml.bind.JAXBContext) public abstract
     * java.lang.Object javax.xml.ws.LogicalMessage.getPayload(javax.xml.bind.JAXBContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.LogicalMessage#getPayload(javax.xml.bind.JAXBContext) public abstract java.lang.Object
     *      javax.xml.ws.LogicalMessage.getPayload(javax.xml.bind.JAXBContext) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPayload_JAXBContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#getPayload() public abstract javax.xml.transform.Source
     * javax.xml.ws.LogicalMessage.getPayload()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.LogicalMessage#getPayload() public abstract javax.xml.transform.Source
     * javax.xml.ws.LogicalMessage.getPayload()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.LogicalMessage#getPayload() public abstract javax.xml.transform.Source
     *      javax.xml.ws.LogicalMessage.getPayload() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPayload()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
