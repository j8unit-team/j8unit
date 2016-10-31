package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.sound.sampled.Port;
import javax.sound.sampled.Port.Info;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class PortTest
implements org.j8unit.repository.javax.sound.sampled.PortTests<Port> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Port]

    @Override
    public Port createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.Port], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.Port]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.Port]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class InfoTest
    implements org.j8unit.repository.javax.sound.sampled.PortTests.InfoTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Port$Info]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(Info.MICROPHONE, //
                                    Info.COMPACT_DISC, //
                                    Info.SPEAKER, //
                                    Info.LINE_OUT, //
                                    Info.HEADPHONE, //
                                    Info.LINE_IN);
        }

        @Parameter(0)
        public Info sut;

        @Override
        public Info createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.Port$Info]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.Port$Info]

    }

}
