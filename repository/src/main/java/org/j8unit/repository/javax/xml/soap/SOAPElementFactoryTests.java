package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.soap.SOAPElementFactory class
 * javax.xml.soap.SOAPElementFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.soap.SOAPElementFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.soap.SOAPElementFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.soap.SOAPElementFactory
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.soap.SOAPElementFactory#create(javax.xml.soap.Name)
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
     * Test method for {@link javax.xml.soap.SOAPElementFactory#create(java.lang.String) public
     * javax.xml.soap.SOAPElement javax.xml.soap.SOAPElementFactory.create(java.lang.String) throws
     * javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.soap.SOAPElementFactory#create(java.lang.String)
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

    /**
     * <p>
     * Test method for
     * {@link javax.xml.soap.SOAPElementFactory#create(java.lang.String, java.lang.String, java.lang.String) public
     * javax.xml.soap.SOAPElement
     * javax.xml.soap.SOAPElementFactory.create(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.soap.SOAPElementFactory#create(java.lang.String, java.lang.String, java.lang.String)
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

}
