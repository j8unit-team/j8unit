package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.annotation.XmlSchemaType interface
 * javax.xml.bind.annotation.XmlSchemaType}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link XmlSchemaTypeClassTests}.
 * </p>
 *
 * @see javax.xml.bind.annotation.XmlSchemaType interface javax.xml.bind.annotation.XmlSchemaType (the hereby targeted
 *      class-under-test class)
 * @see XmlSchemaTypeClassTests XmlSchemaTypeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlSchemaTypeTests<SUT extends javax.xml.bind.annotation.XmlSchemaType>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlSchemaType#name() public abstract java.lang.String
     * javax.xml.bind.annotation.XmlSchemaType.name()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlSchemaType#name() public abstract java.lang.String
     * javax.xml.bind.annotation.XmlSchemaType.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.annotation.XmlSchemaType#name() public abstract java.lang.String
     *      javax.xml.bind.annotation.XmlSchemaType.name() (the hereby targeted method-under-test)
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
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlSchemaType#namespace() public abstract java.lang.String
     * javax.xml.bind.annotation.XmlSchemaType.namespace()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.annotation.XmlSchemaType#namespace() public abstract java.lang.String
     *      javax.xml.bind.annotation.XmlSchemaType.namespace() (the hereby targeted method-under-test)
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
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlSchemaType#type() public abstract java.lang.Class
     * javax.xml.bind.annotation.XmlSchemaType.type()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.annotation.XmlSchemaType#type() public abstract java.lang.Class
     *      javax.xml.bind.annotation.XmlSchemaType.type() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.bind.annotation.XmlSchemaType.DEFAULT class
     * javax.xml.bind.annotation.XmlSchemaType$DEFAULT}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link XmlSchemaTypeClassTests.DEFAULTClassTests}.
     * </p>
     *
     * @see javax.xml.bind.annotation.XmlSchemaType.DEFAULT class javax.xml.bind.annotation.XmlSchemaType$DEFAULT (the
     *      hereby targeted class-under-test class)
     * @see XmlSchemaTypeClassTests.DEFAULTClassTests XmlSchemaTypeClassTests.DEFAULTClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DEFAULTTests<SUT extends javax.xml.bind.annotation.XmlSchemaType.DEFAULT>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    }

}
