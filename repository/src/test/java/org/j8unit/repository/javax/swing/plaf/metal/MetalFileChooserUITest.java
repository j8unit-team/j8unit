package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalFileChooserUI;
import javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MetalFileChooserUI} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUITests}).
 */
@RunWith(J8Unit4.class)
public class MetalFileChooserUITest
implements MetalFileChooserUITests<MetalFileChooserUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalFileChooserUI]

    @Override
    public MetalFileChooserUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalFileChooserUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalFileChooserUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalFileChooserUI]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FilterComboBoxRenderer} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUITests.FilterComboBoxRendererTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FilterComboBoxRendererTest
    implements FilterComboBoxRendererTests<FilterComboBoxRenderer> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer]

        @Override
        public FilterComboBoxRenderer createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalFileChooserUI$FilterComboBoxRenderer]

    }

}
