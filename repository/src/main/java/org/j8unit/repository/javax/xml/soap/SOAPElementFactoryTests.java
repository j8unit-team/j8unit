package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.SOAPElementFactory class javax.xml.soap.SOAPElementFactory}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link SOAPElementFactoryClassTests}.
 * </p>
 *
 * @see javax.xml.soap.SOAPElementFactory class javax.xml.soap.SOAPElementFactory (the hereby targeted class-under-test
 *      class)
 * @see SOAPElementFactoryClassTests SOAPElementFactoryClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPElementFactoryTests<SUT extends javax.xml.soap.SOAPElementFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPElementFactory#create(javax.xml.soap.Name) public
     * javax.xml.soap.SOAPElement javax.xml.soap.SOAPElementFactory.create(javax.xml.soap.Name) throws
     * javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPElementFactory#create(javax.xml.soap.Name) public
     * javax.xml.soap.SOAPElement javax.xml.soap.SOAPElementFactory.create(javax.xml.soap.Name) throws
     * javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPElementFactory#create(javax.xml.soap.Name) public javax.xml.soap.SOAPElement
     *      javax.xml.soap.SOAPElementFactory.create(javax.xml.soap.Name) throws javax.xml.soap.SOAPException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPElementFactory#create(String, String, String) public
     * javax.xml.soap.SOAPElement
     * javax.xml.soap.SOAPElementFactory.create(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPElementFactory#create(String, String, String) public
     * javax.xml.soap.SOAPElement
     * javax.xml.soap.SOAPElementFactory.create(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPElementFactory#create(String, String, String) public javax.xml.soap.SOAPElement
     *      javax.xml.soap.SOAPElementFactory.create(java.lang.String,java.lang.String,java.lang.String) throws
     *      javax.xml.soap.SOAPException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPElementFactory#create(String) public javax.xml.soap.SOAPElement
     * javax.xml.soap.SOAPElementFactory.create(java.lang.String) throws javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPElementFactory#create(String) public javax.xml.soap.SOAPElement
     * javax.xml.soap.SOAPElementFactory.create(java.lang.String) throws javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPElementFactory#create(String) public javax.xml.soap.SOAPElement
     *      javax.xml.soap.SOAPElementFactory.create(java.lang.String) throws javax.xml.soap.SOAPException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
