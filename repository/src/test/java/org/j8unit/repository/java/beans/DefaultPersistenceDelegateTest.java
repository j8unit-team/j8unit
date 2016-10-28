package org.j8unit.repository.java.beans;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.beans.DefaultPersistenceDelegate;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultPersistenceDelegateTest
implements FactoryBasedJ8UnitTest<DefaultPersistenceDelegate>, org.j8unit.repository.java.beans.DefaultPersistenceDelegateTests<DefaultPersistenceDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.DefaultPersistenceDelegate]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultPersistenceDelegate::new);
    }

    @Parameter(0)
    public Callable<DefaultPersistenceDelegate> sutFactory;

    @Override
    public Callable<DefaultPersistenceDelegate> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.DefaultPersistenceDelegate]

}
