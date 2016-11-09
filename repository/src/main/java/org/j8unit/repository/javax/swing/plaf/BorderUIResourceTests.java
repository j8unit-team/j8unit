package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.BorderUIResource.BevelBorderUIResource;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;
import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;
import javax.swing.plaf.BorderUIResource.LineBorderUIResource;
import javax.swing.plaf.BorderUIResource.MatteBorderUIResource;
import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.SerializableTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.javax.swing.border.BevelBorderTests;
import org.j8unit.repository.javax.swing.border.BorderTests;
import org.j8unit.repository.javax.swing.border.CompoundBorderTests;
import org.j8unit.repository.javax.swing.border.EmptyBorderTests;
import org.j8unit.repository.javax.swing.border.EtchedBorderTests;
import org.j8unit.repository.javax.swing.border.LineBorderTests;
import org.j8unit.repository.javax.swing.border.MatteBorderTests;
import org.j8unit.repository.javax.swing.border.TitledBorderTests;
import org.j8unit.repository.javax.swing.plaf.BorderUIResourceClassTests.BevelBorderUIResourceClassTests;
import org.j8unit.repository.javax.swing.plaf.BorderUIResourceClassTests.CompoundBorderUIResourceClassTests;
import org.j8unit.repository.javax.swing.plaf.BorderUIResourceClassTests.EmptyBorderUIResourceClassTests;
import org.j8unit.repository.javax.swing.plaf.BorderUIResourceClassTests.EtchedBorderUIResourceClassTests;
import org.j8unit.repository.javax.swing.plaf.BorderUIResourceClassTests.LineBorderUIResourceClassTests;
import org.j8unit.repository.javax.swing.plaf.BorderUIResourceClassTests.MatteBorderUIResourceClassTests;
import org.j8unit.repository.javax.swing.plaf.BorderUIResourceClassTests.TitledBorderUIResourceClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link BorderUIResource public class javax.swing.plaf.BorderUIResource}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link BorderUIResourceClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BorderUIResourceTests<SUT extends BorderUIResource>
extends BorderTests<SUT>, UIResourceTests<SUT>, SerializableTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.BorderUIResource#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     * public void javax.swing.plaf.BorderUIResource.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
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
    public default void test_paintBorder_Component_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.BorderUIResource#getBorderInsets(java.awt.Component) public java.awt.Insets
     * javax.swing.plaf.BorderUIResource.getBorderInsets(java.awt.Component)}.
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
    public default void test_getBorderInsets_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.plaf.BorderUIResource#isBorderOpaque()
     * public boolean javax.swing.plaf.BorderUIResource.isBorderOpaque()}.
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
    public default void test_isBorderOpaque()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link BevelBorderUIResource public static class javax.swing.plaf.BorderUIResource$BevelBorderUIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link BevelBorderUIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BevelBorderUIResourceTests<SUT extends BevelBorderUIResource>
    extends UIResourceTests<SUT>, BevelBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$BevelBorderUIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$BevelBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$BevelBorderUIResource]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TitledBorderUIResource public static class javax.swing.plaf.BorderUIResource$TitledBorderUIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link TitledBorderUIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TitledBorderUIResourceTests<SUT extends TitledBorderUIResource>
    extends UIResourceTests<SUT>, TitledBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$TitledBorderUIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$TitledBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$TitledBorderUIResource]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link LineBorderUIResource public static class javax.swing.plaf.BorderUIResource$LineBorderUIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link LineBorderUIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LineBorderUIResourceTests<SUT extends LineBorderUIResource>
    extends UIResourceTests<SUT>, LineBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$LineBorderUIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$LineBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$LineBorderUIResource]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link EtchedBorderUIResource public static class javax.swing.plaf.BorderUIResource$EtchedBorderUIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link EtchedBorderUIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EtchedBorderUIResourceTests<SUT extends EtchedBorderUIResource>
    extends UIResourceTests<SUT>, EtchedBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EtchedBorderUIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EtchedBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EtchedBorderUIResource]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link CompoundBorderUIResource public static class javax.swing.plaf.BorderUIResource$CompoundBorderUIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link CompoundBorderUIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CompoundBorderUIResourceTests<SUT extends CompoundBorderUIResource>
    extends UIResourceTests<SUT>, CompoundBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$CompoundBorderUIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$CompoundBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$CompoundBorderUIResource]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link MatteBorderUIResource public static class javax.swing.plaf.BorderUIResource$MatteBorderUIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link MatteBorderUIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MatteBorderUIResourceTests<SUT extends MatteBorderUIResource>
    extends UIResourceTests<SUT>, MatteBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$MatteBorderUIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$MatteBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$MatteBorderUIResource]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link EmptyBorderUIResource public static class javax.swing.plaf.BorderUIResource$EmptyBorderUIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link EmptyBorderUIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EmptyBorderUIResourceTests<SUT extends EmptyBorderUIResource>
    extends UIResourceTests<SUT>, EmptyBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EmptyBorderUIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EmptyBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EmptyBorderUIResource]
    }

}
