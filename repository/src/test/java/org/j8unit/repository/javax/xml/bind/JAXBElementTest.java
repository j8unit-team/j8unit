package org.j8unit.repository.javax.xml.bind;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBElement.GlobalScope;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class JAXBElementTest<T>
implements org.j8unit.repository.javax.xml.bind.JAXBElementTests<JAXBElement<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBElement]

    @Override
    public JAXBElement<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.bind.JAXBElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.JAXBElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.JAXBElement]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class GlobalScopeTest
    implements FactoryBasedJ8UnitTest<GlobalScope>, org.j8unit.repository.javax.xml.bind.JAXBElementTests.GlobalScopeTests<GlobalScope> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBElement$GlobalScope]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(GlobalScope::new);
        }

        @Parameter(0)
        public Callable<GlobalScope> sutFactory;

        @Override
        public Callable<GlobalScope> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.JAXBElement$GlobalScope]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.JAXBElement$GlobalScope]

    }

}
