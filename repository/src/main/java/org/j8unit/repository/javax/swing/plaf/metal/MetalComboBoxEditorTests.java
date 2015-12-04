package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalComboBoxEditor class javax.swing.plaf.metal.MetalComboBoxEditor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MetalComboBoxEditorTests<SUT extends javax.swing.plaf.metal.MetalComboBoxEditor>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorTests<SUT>
{

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalComboBoxEditor$UIResource class javax.swing.plaf.metal.MetalComboBoxEditor$UIResource},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests.UIResourceClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceTests<SUT extends javax.swing.plaf.metal.MetalComboBoxEditor.UIResource>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
            org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorTests<SUT>
    {

    }

}
