package org.j8unit.repository.java.lang;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static java.util.Collections.singletonList;
import static java.util.Collections.unmodifiableCollection;
import static java.util.stream.Collectors.toSet;
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
implements UnmodifiableIterableTests<Iterable<Object>, Object> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> data() {
        return testParametersOf(emptyList(), singletonList("single"), unmodifiableCollection(emptyList()), unmodifiableCollection(singletonList("single")),
                                unmodifiableCollection(asList("first", "second")), emptySet(), singleton("set-single"), unmodifiableCollection(emptySet()),
                                unmodifiableCollection(singleton("set-single")), unmodifiableCollection(asList("first", "second").stream().collect(toSet())));
    }

    @Parameter(0)
    public Iterable<Object> sut;

    @Override
    public Iterable<Object> createNewSUT() {
        return this.sut;
    }

}
