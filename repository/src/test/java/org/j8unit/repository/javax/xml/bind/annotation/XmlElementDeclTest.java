package org.j8unit.repository.javax.xml.bind.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;
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
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlElementDecl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclTests}).
 */

@RunWith(J8Unit4.class)
public class XmlElementDeclTest
implements XmlElementDeclTests<XmlElementDecl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlElementDecl]

    @Override
    public XmlElementDecl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlElementDecl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlElementDecl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlElementDecl]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class GLOBALTest
    implements FactoryBasedJ8UnitTest<GLOBAL>, GLOBALTests<GLOBAL> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlElementDecl$GLOBAL]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(GLOBAL::new);
        }

        @Parameter(0)
        public Callable<GLOBAL> sutFactory;

        @Override
        public Callable<GLOBAL> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlElementDecl$GLOBAL]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlElementDecl$GLOBAL]

    }

}
