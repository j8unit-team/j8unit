package org.j8unit.repository.java.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.Collections.unmodifiableList;
import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.Collections;
import java.util.List;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UnmodifiableListTest
implements UnmodifiableListTests<List<Object>, Object> {

    /**
     * @see EmptyListBugs {@link Collections#emptyList()} has wrong behaviour!
     * @see SingletonListBugs {@link Collections#singletonList(Object)} has wrong behaviour!
     */
    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        final List<Object> emptyList = emptyList();
        final List<String> singletonList = singletonList("single");
        return testParametersOf(/* emptyList, */ /* singletonList, */ unmodifiableList(emptyList), unmodifiableList(singletonList),
                                unmodifiableList(asList("first", "second")));
    }

    @Parameter(0)
    public List<Object> sut;

    @Override
    public List<Object> createNewSUT() {
        return this.sut;
    }

}
