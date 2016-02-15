package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.annotation.XmlElementRefs interface
 * javax.xml.bind.annotation.XmlElementRefs}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link XmlElementRefsClassTests}.
 * </p>
 *
 * @see javax.xml.bind.annotation.XmlElementRefs interface javax.xml.bind.annotation.XmlElementRefs (the hereby targeted
 *      class-under-test class)
 * @see XmlElementRefsClassTests XmlElementRefsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlElementRefsTests<SUT extends javax.xml.bind.annotation.XmlElementRefs>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlElementRefs#value() public abstract
     * javax.xml.bind.annotation.XmlElementRef[] javax.xml.bind.annotation.XmlElementRefs.value()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.annotation.XmlElementRefs#value() public abstract
     * javax.xml.bind.annotation.XmlElementRef[] javax.xml.bind.annotation.XmlElementRefs.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.annotation.XmlElementRefs#value() public abstract javax.xml.bind.annotation.XmlElementRef[]
     *      javax.xml.bind.annotation.XmlElementRefs.value() (the hereby targeted method-under-test)
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
