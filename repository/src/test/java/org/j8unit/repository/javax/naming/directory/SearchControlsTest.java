package org.j8unit.repository.javax.naming.directory;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.directory.SearchControls;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SearchControlsTest
implements FactoryBasedJ8UnitTest<SearchControls>, SearchControlsTests<SearchControls> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.SearchControls]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SearchControls::new);
    }

    @Parameter(0)
    public Callable<SearchControls> sutFactory;

    @Override
    public Callable<SearchControls> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.directory.SearchControls]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.directory.SearchControls]

}
