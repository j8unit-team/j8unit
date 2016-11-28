package org.j8unit.showcase.jm;

import static java.util.Arrays.asList;
import java.util.List;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.java.util.UnmodifiableListTests;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.showcase.ShowcaseFailure;
import org.junit.Test;
import org.junit.experimental.categories.Category;
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
        return asList(new Object[][] { { new MyUnmodifiableList<>(), "empty MyUnmodifiableList" },
                                       { new MyUnmodifiableList<>(asList("Foobar")), "singleton MyUnmodifiableList" },
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

    @Test
    @Category(ShowcaseFailure.class)
    @Override
    public void clearMustThrowUOE() {
        UnmodifiableListTests.super.clearMustThrowUOE();
    }

    @Override
    public void test_equals_Object()
    throws Exception {
        ObjectTests.super.test_equals_Object();
        UnmodifiableListTests.super.test_equals_Object();
    }

}
