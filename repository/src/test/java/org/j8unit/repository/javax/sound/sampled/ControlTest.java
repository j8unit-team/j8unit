package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Control;
import javax.sound.sampled.Control.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Control} (by simply reusing the
 * J8Unit test interface {@link ControlTests}).
 */

@RunWith(J8Unit4.class)
public class ControlTest
implements ControlTests<Control> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Control]

    @Override
    public Control createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.Control], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.Control]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.Control]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.ControlTests.TypeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.ControlTests.TypeTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Control$Type]

        @Override
        public Type createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.Control.Type], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.Control$Type]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.Control$Type]

    }

}
