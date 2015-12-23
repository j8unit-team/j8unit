package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.annotation.XmlSchemaType interface
 * javax.xml.bind.annotation.XmlSchemaType}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTypeTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTypeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.annotation.XmlSchemaType
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlSchemaTypeTests<SUT extends javax.xml.bind.annotation.XmlSchemaType>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.bind.annotation.XmlSchemaType.DEFAULT class
     * javax.xml.bind.annotation.XmlSchemaType$DEFAULT}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTypeTests.DEFAULTTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTypeClassTests.DEFAULTClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.bind.annotation.XmlSchemaType.DEFAULT
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DEFAULTTests<SUT extends javax.xml.bind.annotation.XmlSchemaType.DEFAULT>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlSchemaType#name() public abstract java.lang.String
     * javax.xml.bind.annotation.XmlSchemaType.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.annotation.XmlSchemaType#name()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlSchemaType#namespace() public abstract java.lang.String
     * javax.xml.bind.annotation.XmlSchemaType.namespace()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.annotation.XmlSchemaType#namespace()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_namespace()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlSchemaType#type() public abstract java.lang.Class
     * javax.xml.bind.annotation.XmlSchemaType.type()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.annotation.XmlSchemaType#type()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
