package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalComboBoxEditor;
import javax.swing.plaf.metal.MetalComboBoxEditor.UIResource;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link MetalComboBoxEditor public class javax.swing.plaf.metal.MetalComboBoxEditor}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalComboBoxEditorTests<SUT extends MetalComboBoxEditor>
extends BasicComboBoxEditorTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxEditor]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxEditor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxEditor]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link UIResource
     * public static class javax.swing.plaf.metal.MetalComboBoxEditor$UIResource}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests.UIResourceClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceTests<SUT extends UIResource>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxEditor$UIResource]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxEditor$UIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxEditor$UIResource]

    }

}
