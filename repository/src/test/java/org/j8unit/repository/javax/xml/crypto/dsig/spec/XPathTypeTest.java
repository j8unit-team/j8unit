package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.xml.crypto.dsig.spec.XPathType;
import javax.xml.crypto.dsig.spec.XPathType.Filter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class XPathTypeTest
implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests<XPathType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.XPathType]

    @Override
    public XPathType createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.crypto.dsig.spec.XPathType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.XPathType]

    @RunWith(J8Unit4.class)
    public static class FilterTest
    implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests.FilterTests<Filter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.XPathType$Filter]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(Filter.INTERSECT, //
                                    Filter.SUBTRACT, //
                                    Filter.UNION);
        }

        @Parameter(0)
        public Filter sut;

        @Override
        public Filter createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.XPathType$Filter]

    }

}
