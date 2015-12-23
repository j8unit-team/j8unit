package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalComboBoxEditor class
 * javax.swing.plaf.metal.MetalComboBoxEditor}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxEditor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalComboBoxEditorTests<SUT extends javax.swing.plaf.metal.MetalComboBoxEditor>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalComboBoxEditor.UIResource class
     * javax.swing.plaf.metal.MetalComboBoxEditor$UIResource}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorTests.UIResourceTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests.UIResourceClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxEditor.UIResource
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceTests<SUT extends javax.swing.plaf.metal.MetalComboBoxEditor.UIResource>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorTests<SUT> {

    }

}
