package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class AudioFileFormatTest
implements org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests<javax.sound.sampled.AudioFileFormat> {

    @Override
    public javax.sound.sampled.AudioFileFormat createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.AudioFileFormat] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests.TypeTests<javax.sound.sampled.AudioFileFormat.Type> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.sound.sampled.AudioFileFormat.Type.SND, //
                                    javax.sound.sampled.AudioFileFormat.Type.AIFC, //
                                    javax.sound.sampled.AudioFileFormat.Type.AU, //
                                    javax.sound.sampled.AudioFileFormat.Type.AIFF, //
                                    javax.sound.sampled.AudioFileFormat.Type.WAVE);
        }

        @Parameter(0)
        public javax.sound.sampled.AudioFileFormat.Type sut;

        @Override
        public javax.sound.sampled.AudioFileFormat.Type createNewSUT() {
            return this.sut;
        }

    }

}
