package org.j8unit.repository.javax.tools;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.tools.DocumentationTool;
import javax.tools.DocumentationTool.DocumentationTask;
import javax.tools.DocumentationTool.Location;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class DocumentationToolTest
implements org.j8unit.repository.javax.tools.DocumentationToolTests<DocumentationTool> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DocumentationTool]

    @Override
    public DocumentationTool createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.DocumentationTool], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DocumentationTool]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class LocationTest
    implements org.j8unit.repository.javax.tools.DocumentationToolTests.LocationTests<Location> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DocumentationTool$Location]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Location.class);
        }

        @Parameter(0)
        public Location sut;

        @Override
        public Location createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DocumentationTool$Location]

    }

    @RunWith(J8Unit4.class)
    public static class DocumentationTaskTest
    implements org.j8unit.repository.javax.tools.DocumentationToolTests.DocumentationTaskTests<DocumentationTask> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DocumentationTool$DocumentationTask]

        @Override
        public DocumentationTask createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.DocumentationTool.DocumentationTask], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DocumentationTool$DocumentationTask]

    }

}
