package org.j8unit.repository.java.util;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.j8unit.repository.TestDataUtil.testDataOfSingletons;
import java.util.List;
import org.j8unit.repository.java.JavaBug;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
@Category(JavaBug.class)
public class UnmodifiableListTest
implements UnmodifiableListTests<List<String>, String> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return testDataOfSingletons(emptyList(), singletonList("single-element"));
    }

    @Parameter(0)
    public List<String> sut;

    @Override
    public List<String> createNewSUT() {
        return this.sut;
    }

}
