package org.j8unit.repository.javax.xml.bind.helpers;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.helpers.DefaultValidationEventHandler;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultValidationEventHandlerTest
implements FactoryBasedJ8UnitTest<DefaultValidationEventHandler>,
org.j8unit.repository.javax.xml.bind.helpers.DefaultValidationEventHandlerTests<DefaultValidationEventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultValidationEventHandler::new);
    }

    @Parameter(0)
    public Callable<DefaultValidationEventHandler> sutFactory;

    @Override
    public Callable<DefaultValidationEventHandler> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.helpers.DefaultValidationEventHandler]

}
