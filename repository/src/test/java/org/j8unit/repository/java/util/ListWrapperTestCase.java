package org.j8unit.repository.java.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.Collections.unmodifiableList;
import java.util.List;
import java.util.function.Supplier;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.java.JavaBug;
import org.j8unit.repository.java.lang.ObjectTests;
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
public class ListWrapperTestCase
implements ObjectTests<List<Object>>, UnmodifiableListTests<List<Object>, Object>, FactoryBasedJ8UnitTest<List<Object>> {

    @Parameters(name = "{index}: {1}")
    public static Iterable<Object[]> data() {
        final Supplier<List<Object>> fac1 = () -> emptyList();
        final Supplier<List<Object>> fac2 = () -> unmodifiableList(emptyList());
        final Supplier<List<Object>> fac3 = () -> singletonList(new Object());
        final Supplier<List<Object>> fac4 = () -> unmodifiableList(singletonList(new Object()));
        final Supplier<List<Object>> fac5 = () -> singletonList(null);
        final Supplier<List<Object>> fac6 = () -> unmodifiableList(singletonList(null));
        return asList(new Object[][] { { fac1, "emptyList()" }, { fac2, "unmodifiableList(emptyList())" }, { fac3, "singletonList(new Object())" },
                                       { fac4, "unmodifiableList(singletonList(new Object()))" }, { fac5, "singletonList(null)" },
                                       { fac6, "unmodifiableList(singletonList(null))" } });
    }

    @Parameter(0)
    public Supplier<List<Object>> factory;

    @Parameter(1)
    public String title;

    @Override
    public Supplier<List<Object>> getSUTFactory() {
        return this.factory;
    }

}
