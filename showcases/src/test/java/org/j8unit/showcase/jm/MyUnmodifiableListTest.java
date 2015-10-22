package org.j8unit.showcase.jm;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import java.util.Arrays;
import java.util.List;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.java.util.UnmodifiableListTests;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MyUnmodifiableListTest
implements ObjectTests<List<Object>>, UnmodifiableListTests<List<Object>, Object> {

    @Parameters(name = "{index}: {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { new MyUnmodifiableList<>(), "empty MyUnmodifiableList" },
                                              { new MyUnmodifiableList<>(singletonList("Foobar")), "singleton MyUnmodifiableList" },
                                              { new MyUnmodifiableList<>(asList("Foo", "Bar")), "2-tuple MyUnmodifiableList" } });
    }

    @Parameter(0)
    public List<Object> instance;

    @Parameter(1)
    public String display;

    @Override
    public List<Object> createNewSUT() {
        return this.instance;
    }

}
