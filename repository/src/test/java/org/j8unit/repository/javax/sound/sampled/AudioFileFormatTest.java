package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFileFormat.Type;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AudioFileFormat} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests}).
 */
@RunWith(J8Unit4.class)
public class AudioFileFormatTest
implements AudioFileFormatTests<AudioFileFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.AudioFileFormat]

    @Override
    public AudioFileFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.AudioFileFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.AudioFileFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.AudioFileFormat]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Type} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests.TypeTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests.TypeTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.AudioFileFormat$Type]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Type.SND, //
                                    Type.AIFC, //
                                    Type.AU, //
                                    Type.AIFF, //
                                    Type.WAVE);
        }

        @Parameter(0)
        public Type sut;

        @Override
        public Type createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.AudioFileFormat$Type]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.AudioFileFormat$Type]

    }

}
