package org.j8unit.repository.javax.sound.midi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.sound.midi.ShortMessage;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ShortMessageTest
implements FactoryBasedJ8UnitTest<ShortMessage>, org.j8unit.repository.javax.sound.midi.ShortMessageTests<ShortMessage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.ShortMessage]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ShortMessage::new);
    }

    @Parameter(0)
    public Callable<ShortMessage> sutFactory;

    @Override
    public Callable<ShortMessage> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.ShortMessage]

}
