package org.j8unit.repository.javax.xml.bind.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlType.DEFAULT;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlType} (by simply reusing the
 * J8Unit test interface {@link XmlTypeTests}).
 */

@RunWith(J8Unit4.class)
public class XmlTypeTest
implements XmlTypeTests<XmlType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlType]

    @Override
    public XmlType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlType]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DEFAULTTest
    implements FactoryBasedJ8UnitTest<DEFAULT>, org.j8unit.repository.javax.xml.bind.annotation.XmlTypeTests.DEFAULTTests<DEFAULT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlType$DEFAULT]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(DEFAULT::new);
        }

        @Parameter(0)
        public Callable<DEFAULT> sutFactory;

        @Override
        public Callable<DEFAULT> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlType$DEFAULT]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlType$DEFAULT]

    }

}
