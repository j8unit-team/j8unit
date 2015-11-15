package org.j8unit.repository.java.lang;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.stream.Stream;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ExampleEnumTest<E extends Enum<E>>
implements EnumTests<E> {

    private static <T extends Enum<T>> T[] valuesByEnumClass(final Class<? extends Enum<T>> clazz) {
        try {
            final Method method = clazz.getMethod("values");
            assert Modifier.isStatic(method.getModifiers());
            return (T[]) method.invoke(null);
        } catch (final RuntimeException any) {
            throw any;
        } catch (final Exception impossible) {
            throw new RuntimeException(impossible);
        }
    }

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> parameters() {
        final List<Class<? extends Enum<?>>> enums = asList(Character.UnicodeScript.class, ProcessBuilder.Redirect.Type.class, Thread.State.class);
        final Stream<Class<? extends Enum<?>>> stream = enums.stream();
        final Stream<Enum<?>> constants = stream.flatMap(ec -> stream(valuesByEnumClass(ec)));
        return constants.map(c -> new Object[] { c }).collect(toList());
    }

    @Parameter(0)
    public E enumConstant;

    @Override
    public E createNewSUT() {
        return this.enumConstant;
    }

}
