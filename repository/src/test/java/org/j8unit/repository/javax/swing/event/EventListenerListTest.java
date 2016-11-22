package org.j8unit.repository.javax.swing.event;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.event.EventListenerList;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class EventListenerListTest
implements FactoryBasedJ8UnitTest<EventListenerList>, EventListenerListTests<EventListenerList> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.EventListenerList]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(EventListenerList::new);
    }

    @Parameter(0)
    public Callable<EventListenerList> sutFactory;

    @Override
    public Callable<EventListenerList> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.EventListenerList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.EventListenerList]

}
