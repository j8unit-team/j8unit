package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.BooleanControl.Type;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BooleanControl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.BooleanControlTests}).
 */
@RunWith(J8Unit4.class)
public class BooleanControlTest
implements BooleanControlTests<BooleanControl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.BooleanControl]

    @Override
    public BooleanControl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.BooleanControl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.BooleanControl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.BooleanControl]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.BooleanControlTests.TypeTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.BooleanControlTests.TypeTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.BooleanControl$Type]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Type.APPLY_REVERB, //
                                    Type.MUTE);
        }

        @Parameter(0)
        public Type sut;

        @Override
        public Type createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.BooleanControl$Type]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.BooleanControl$Type]

    }

}
