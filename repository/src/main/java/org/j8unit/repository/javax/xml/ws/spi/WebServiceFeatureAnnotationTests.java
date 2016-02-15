package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.spi.WebServiceFeatureAnnotation interface
 * javax.xml.ws.spi.WebServiceFeatureAnnotation}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link WebServiceFeatureAnnotationClassTests}.
 * </p>
 *
 * @see javax.xml.ws.spi.WebServiceFeatureAnnotation interface javax.xml.ws.spi.WebServiceFeatureAnnotation (the hereby
 *      targeted class-under-test class)
 * @see WebServiceFeatureAnnotationClassTests WebServiceFeatureAnnotationClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebServiceFeatureAnnotationTests<SUT extends javax.xml.ws.spi.WebServiceFeatureAnnotation>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.WebServiceFeatureAnnotation#bean() public abstract java.lang.Class<?
     * extends javax.xml.ws.WebServiceFeature> javax.xml.ws.spi.WebServiceFeatureAnnotation.bean()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.WebServiceFeatureAnnotation#bean() public abstract java.lang.Class
     * javax.xml.ws.spi.WebServiceFeatureAnnotation.bean()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.WebServiceFeatureAnnotation#bean() public abstract java.lang.Class
     *      javax.xml.ws.spi.WebServiceFeatureAnnotation.bean() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.WebServiceFeatureAnnotation#id() public abstract java.lang.String
     * javax.xml.ws.spi.WebServiceFeatureAnnotation.id()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.spi.WebServiceFeatureAnnotation#id() public abstract java.lang.String
     * javax.xml.ws.spi.WebServiceFeatureAnnotation.id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.spi.WebServiceFeatureAnnotation#id() public abstract java.lang.String
     *      javax.xml.ws.spi.WebServiceFeatureAnnotation.id() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
