package org.j8unit.repository.javax.xml.stream;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.XMLStreamException class
 * javax.xml.stream.XMLStreamException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link XMLStreamExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.stream.XMLStreamException class javax.xml.stream.XMLStreamException (the hereby targeted
 *      class-under-test class)
 * @see XMLStreamExceptionClassTests XMLStreamExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLStreamExceptionTests<SUT extends javax.xml.stream.XMLStreamException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLStreamException#getNestedException() public java.lang.Throwable
     * javax.xml.stream.XMLStreamException.getNestedException()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLStreamException#getNestedException() public java.lang.Throwable
     * javax.xml.stream.XMLStreamException.getNestedException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLStreamException#getNestedException() public java.lang.Throwable
     *      javax.xml.stream.XMLStreamException.getNestedException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNestedException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.XMLStreamException#getLocation() public javax.xml.stream.Location
     * javax.xml.stream.XMLStreamException.getLocation()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.XMLStreamException#getLocation() public javax.xml.stream.Location
     * javax.xml.stream.XMLStreamException.getLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.XMLStreamException#getLocation() public javax.xml.stream.Location
     *      javax.xml.stream.XMLStreamException.getLocation() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
