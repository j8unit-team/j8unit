package org.j8unit.repository.javax.xml.stream.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.stream.util.EventReaderDelegate;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@SuppressWarnings("rawtypes")
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class EventReaderDelegateTest
implements FactoryBasedJ8UnitTest, org.j8unit.repository.javax.xml.stream.util.EventReaderDelegateTests<EventReaderDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.util.EventReaderDelegate]

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of the implemented j8unit
    // test interface (caused by the "rawtypes" nature of the type-under-test).
    @Override
    public EventReaderDelegate createNewSUT() {
        final Object sut = FactoryBasedJ8UnitTest.super.createNewSUT();
        assert sut != null;
        assert sut instanceof EventReaderDelegate;
        return (EventReaderDelegate) sut;
    }

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(EventReaderDelegate::new);
    }

    @Parameter(0)
    public Callable<EventReaderDelegate> sutFactory;

    @Override
    public Callable<EventReaderDelegate> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.util.EventReaderDelegate]

}
