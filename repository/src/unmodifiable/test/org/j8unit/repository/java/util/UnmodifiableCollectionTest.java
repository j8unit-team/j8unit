package org.j8unit.repository.java.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static java.util.Collections.singletonList;
import static java.util.Collections.unmodifiableCollection;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.Collection;
import org.j8unit.repository.categories.JavaBug;
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
public class UnmodifiableCollectionTest
implements UnmodifiableCollectionTests<Collection<Object>, Object> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> data() {
        return testParametersOf(unmodifiableCollection(emptyList()), unmodifiableCollection(singletonList("single")),
                                unmodifiableCollection(asList("first", "second")), unmodifiableCollection(emptySet()),
                                unmodifiableCollection(singleton("set-single")), unmodifiableCollection(asList("first", "second").stream().collect(toSet())));
    }

    @Parameter(0)
    public Collection<Object> sut;

    @Override
    public Collection<Object> createNewSUT() {
        return this.sut;
    }

}
