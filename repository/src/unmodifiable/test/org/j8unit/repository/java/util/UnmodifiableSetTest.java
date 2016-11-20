package org.j8unit.repository.java.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static java.util.Collections.unmodifiableSet;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.Collections;
import java.util.Set;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UnmodifiableSetTest
implements UnmodifiableSetTests<Set<Object>, Object> {

    /**
     * @see EmptySetBugs {@link Collections#emptySet()} has wrong behaviour!
     * @see SingletonSetBugs {@link Collections#singleton(Object)} has wrong behaviour!
     */
    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> data() {
        final Set<Object> emptySet = emptySet();
        final Set<String> singletonSet = singleton("set-single");
        return testParametersOf(/* emptySet, */ /* singletonSet, */ unmodifiableSet(emptySet), unmodifiableSet(singletonSet),
                                unmodifiableSet(asList("first", "second").stream().collect(toSet())));
    }

    @Parameter(0)
    public Set<Object> sut;

    @Override
    public Set<Object> createNewSUT() {
        return this.sut;
    }

}
