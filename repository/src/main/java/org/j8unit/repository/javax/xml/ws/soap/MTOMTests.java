package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.soap.MTOM interface javax.xml.ws.soap.MTOM}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MTOMClassTests}.
 * </p>
 *
 * @see javax.xml.ws.soap.MTOM interface javax.xml.ws.soap.MTOM (the hereby targeted class-under-test class)
 * @see MTOMClassTests MTOMClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MTOMTests<SUT extends javax.xml.ws.soap.MTOM>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.MTOM#threshold() public abstract int javax.xml.ws.soap.MTOM.threshold()}
     * .
     *
     * <p>
     * Test method for {@link javax.xml.ws.soap.MTOM#threshold() public abstract int javax.xml.ws.soap.MTOM.threshold()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.soap.MTOM#threshold() public abstract int javax.xml.ws.soap.MTOM.threshold() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_threshold()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.MTOM#enabled() public abstract boolean javax.xml.ws.soap.MTOM.enabled()}
     * .
     *
     * <p>
     * Test method for {@link javax.xml.ws.soap.MTOM#enabled() public abstract boolean javax.xml.ws.soap.MTOM.enabled()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.soap.MTOM#enabled() public abstract boolean javax.xml.ws.soap.MTOM.enabled() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enabled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
