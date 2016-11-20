package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FloatControl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.FloatControlTests}).
 */

@RunWith(J8Unit4.class)
public class FloatControlTest
implements FloatControlTests<FloatControl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.FloatControl]

    @Override
    public FloatControl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.FloatControl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.FloatControl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.FloatControl]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.FloatControlTests.TypeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.FloatControlTests.TypeTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.FloatControl$Type]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Type.VOLUME, //
                                    Type.MASTER_GAIN, //
                                    Type.REVERB_SEND, //
                                    Type.REVERB_RETURN, //
                                    Type.BALANCE, //
                                    Type.AUX_RETURN, //
                                    Type.PAN, //
                                    Type.SAMPLE_RATE, //
                                    Type.AUX_SEND);
        }

        @Parameter(0)
        public Type sut;

        @Override
        public Type createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.FloatControl$Type]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.FloatControl$Type]

    }

}
