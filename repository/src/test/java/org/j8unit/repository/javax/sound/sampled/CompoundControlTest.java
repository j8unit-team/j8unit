package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.CompoundControl;
import javax.sound.sampled.CompoundControl.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CompoundControl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.CompoundControlTests}).
 */

@RunWith(J8Unit4.class)
public class CompoundControlTest
implements CompoundControlTests<CompoundControl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.CompoundControl]

    @Override
    public CompoundControl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.CompoundControl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.CompoundControl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.CompoundControl]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.CompoundControlTests.TypeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.CompoundControlTests.TypeTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.CompoundControl$Type]

        @Override
        public Type createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.CompoundControl.Type], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.CompoundControl$Type]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.CompoundControl$Type]

    }

}
