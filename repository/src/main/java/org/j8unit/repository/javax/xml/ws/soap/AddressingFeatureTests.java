package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.soap.AddressingFeature.Responses;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumTests;
import org.j8unit.repository.javax.xml.ws.WebServiceFeatureTests;
import org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureClassTests.ResponsesClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link AddressingFeature public final class javax.xml.ws.soap.AddressingFeature}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link AddressingFeatureClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AddressingFeatureTests<SUT extends AddressingFeature>
extends WebServiceFeatureTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.ws.soap.AddressingFeature#getResponses()
     * public javax.xml.ws.soap.AddressingFeature$Responses javax.xml.ws.soap.AddressingFeature.getResponses()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResponses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.ws.soap.AddressingFeature#isRequired()
     * public boolean javax.xml.ws.soap.AddressingFeature.isRequired()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRequired()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.ws.soap.AddressingFeature#getID() public
     * java.lang.String javax.xml.ws.soap.AddressingFeature.getID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Responses
     * public static final enum javax.xml.ws.soap.AddressingFeature$Responses}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link ResponsesClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ResponsesTests<SUT extends Responses>
    extends EnumTests<SUT, Responses> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature$Responses]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature$Responses]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature$Responses]
    }

}
