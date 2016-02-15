package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.handler.PortInfo interface javax.xml.ws.handler.PortInfo}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link PortInfoClassTests}.
 * </p>
 *
 * @see javax.xml.ws.handler.PortInfo interface javax.xml.ws.handler.PortInfo (the hereby targeted class-under-test
 *      class)
 * @see PortInfoClassTests PortInfoClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PortInfoTests<SUT extends javax.xml.ws.handler.PortInfo>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getPortName() public abstract javax.xml.namespace.QName
     * javax.xml.ws.handler.PortInfo.getPortName()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getPortName() public abstract javax.xml.namespace.QName
     * javax.xml.ws.handler.PortInfo.getPortName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.handler.PortInfo#getPortName() public abstract javax.xml.namespace.QName
     *      javax.xml.ws.handler.PortInfo.getPortName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPortName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getBindingID() public abstract java.lang.String
     * javax.xml.ws.handler.PortInfo.getBindingID()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getBindingID() public abstract java.lang.String
     * javax.xml.ws.handler.PortInfo.getBindingID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.handler.PortInfo#getBindingID() public abstract java.lang.String
     *      javax.xml.ws.handler.PortInfo.getBindingID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBindingID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getServiceName() public abstract javax.xml.namespace.QName
     * javax.xml.ws.handler.PortInfo.getServiceName()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.handler.PortInfo#getServiceName() public abstract javax.xml.namespace.QName
     * javax.xml.ws.handler.PortInfo.getServiceName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.handler.PortInfo#getServiceName() public abstract javax.xml.namespace.QName
     *      javax.xml.ws.handler.PortInfo.getServiceName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getServiceName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
