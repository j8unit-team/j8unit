package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalComboBoxEditor class
 * javax.swing.plaf.metal.MetalComboBoxEditor}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MetalComboBoxEditorClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalComboBoxEditor class javax.swing.plaf.metal.MetalComboBoxEditor (the hereby targeted
 *      class-under-test class)
 * @see MetalComboBoxEditorClassTests MetalComboBoxEditorClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalComboBoxEditorTests<SUT extends javax.swing.plaf.metal.MetalComboBoxEditor>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalComboBoxEditor.UIResource class
     * javax.swing.plaf.metal.MetalComboBoxEditor$UIResource}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalComboBoxEditorClassTests.UIResourceClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalComboBoxEditor.UIResource class
     *      javax.swing.plaf.metal.MetalComboBoxEditor$UIResource (the hereby targeted class-under-test class)
     * @see MetalComboBoxEditorClassTests.UIResourceClassTests MetalComboBoxEditorClassTests.UIResourceClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceTests<SUT extends javax.swing.plaf.metal.MetalComboBoxEditor.UIResource>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, MetalComboBoxEditorTests<SUT> {

    }

}
