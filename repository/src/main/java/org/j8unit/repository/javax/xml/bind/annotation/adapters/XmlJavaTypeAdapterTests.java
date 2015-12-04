package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter interface
 * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlJavaTypeAdapterTests<SUT extends javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter$DEFAULT class
     * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter$DEFAULT}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterClassTests.DEFAULTClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DEFAULTTests<SUT extends javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter#type() public abstract
     * java.lang.Class javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.type()}.
     * </p>
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
     * Test method for {@link javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter#value() public abstract
     * java.lang.Class javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
