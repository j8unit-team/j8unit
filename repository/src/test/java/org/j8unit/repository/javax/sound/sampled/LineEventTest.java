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
public class LineEventTest
implements org.j8unit.repository.javax.sound.sampled.LineEventTests<javax.sound.sampled.LineEvent> {

    @Override
    public javax.sound.sampled.LineEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.LineEvent] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.LineEventTests.TypeTests<javax.sound.sampled.LineEvent.Type> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.sound.sampled.LineEvent.Type.STOP, //
                                    javax.sound.sampled.LineEvent.Type.CLOSE, //
                                    javax.sound.sampled.LineEvent.Type.START, //
                                    javax.sound.sampled.LineEvent.Type.OPEN);
        }

        @Parameter(0)
        public javax.sound.sampled.LineEvent.Type sut;

        @Override
        public javax.sound.sampled.LineEvent.Type createNewSUT() {
            return this.sut;
        }

    }

}
