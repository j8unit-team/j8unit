package org.j8unit.repository.java.beans;

import java.beans.PropertyEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyEditor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.PropertyEditorTests}).
 */

@RunWith(J8Unit4.class)
public class PropertyEditorTest
implements PropertyEditorTests<PropertyEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyEditor]

    @Override
    public PropertyEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.PropertyEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.PropertyEditor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.PropertyEditor]

}
