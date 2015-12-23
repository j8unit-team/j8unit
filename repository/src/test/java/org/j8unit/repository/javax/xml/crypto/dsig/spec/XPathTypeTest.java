package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class XPathTypeTest
implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests<javax.xml.crypto.dsig.spec.XPathType> {

    @Override
    public javax.xml.crypto.dsig.spec.XPathType createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.crypto.dsig.spec.XPathType] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FilterTest
    implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests.FilterTests<javax.xml.crypto.dsig.spec.XPathType.Filter> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.xml.crypto.dsig.spec.XPathType.Filter.INTERSECT, //
                                    javax.xml.crypto.dsig.spec.XPathType.Filter.SUBTRACT, //
                                    javax.xml.crypto.dsig.spec.XPathType.Filter.UNION);
        }

        @Parameter(0)
        public javax.xml.crypto.dsig.spec.XPathType.Filter sut;

        @Override
        public javax.xml.crypto.dsig.spec.XPathType.Filter createNewSUT() {
            return this.sut;
        }

    }

}
