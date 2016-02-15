package org.j8unit.repository.java.lang;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UnmodifiableIterableTest
implements UnmodifiableIterableTests<Iterable<String>, String> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return testParametersOf(emptyList(), singletonList("single-element"));
    }

    @Parameter(0)
    public Iterable<String> sut;

    @Override
    public Iterable<String> createNewSUT() {
        return this.sut;
    }

}
