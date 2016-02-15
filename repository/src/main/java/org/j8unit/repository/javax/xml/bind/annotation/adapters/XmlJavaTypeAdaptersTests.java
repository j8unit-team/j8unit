package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters interface
 * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link XmlJavaTypeAdaptersClassTests}.
 * </p>
 *
 * @see javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters interface
 *      javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters (the hereby targeted class-under-test class)
 * @see XmlJavaTypeAdaptersClassTests XmlJavaTypeAdaptersClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlJavaTypeAdaptersTests<SUT extends javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters#value() public abstract
     * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter[]
     * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters.value()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters#value() public abstract
     * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter[]
     * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters#value() public abstract
     *      javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter[]
     *      javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters.value() (the hereby targeted method-under-test)
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
