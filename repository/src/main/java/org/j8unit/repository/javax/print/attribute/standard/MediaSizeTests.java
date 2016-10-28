package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSize.Engineering;
import javax.print.attribute.standard.MediaSize.ISO;
import javax.print.attribute.standard.MediaSize.JIS;
import javax.print.attribute.standard.MediaSize.NA;
import javax.print.attribute.standard.MediaSize.Other;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link MediaSize
 * public class javax.print.attribute.standard.MediaSize}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MediaSizeTests<SUT extends MediaSize>
extends org.j8unit.repository.javax.print.attribute.AttributeTests<SUT>, org.j8unit.repository.javax.print.attribute.Size2DSyntaxTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link MediaSize#getCategory() public final
     * java.lang.Class<? extends javax.print.attribute.Attribute>
     * javax.print.attribute.standard.MediaSize.getCategory()}.
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
    public default void test_getCategory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link MediaSize#getMediaSizeName() public
     * javax.print.attribute.standard.MediaSizeName javax.print.attribute.standard.MediaSize.getMediaSizeName()}.
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
    public default void test_getMediaSizeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link MediaSize#getName() public final java.lang.String
     * javax.print.attribute.standard.MediaSize.getName()}.
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
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link MediaSize#equals(Object) public boolean
     * javax.print.attribute.standard.MediaSize.equals(java.lang.Object)}.
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
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link JIS public
     * static final class javax.print.attribute.standard.MediaSize$JIS}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.JISClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface JISTests<SUT extends JIS>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$JIS]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$JIS]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Other
     * public static final class javax.print.attribute.standard.MediaSize$Other}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.OtherClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OtherTests<SUT extends Other>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Other]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Other]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Engineering
     * public static final class javax.print.attribute.standard.MediaSize$Engineering}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.EngineeringClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EngineeringTests<SUT extends Engineering>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Engineering]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Engineering]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link NA public
     * static final class javax.print.attribute.standard.MediaSize$NA}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.NAClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface NATests<SUT extends NA>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$NA]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$NA]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link ISO public
     * static final class javax.print.attribute.standard.MediaSize$ISO}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.ISOClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ISOTests<SUT extends ISO>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$ISO]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$ISO]

    }

}
