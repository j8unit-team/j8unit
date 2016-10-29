package org.j8unit.repository.java.time.zone;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.zone.ZoneOffsetTransitionRule;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class ZoneOffsetTransitionRuleTest
implements org.j8unit.repository.java.time.zone.ZoneOffsetTransitionRuleTests<ZoneOffsetTransitionRule> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneOffsetTransitionRule]

    @Override
    public ZoneOffsetTransitionRule createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.zone.ZoneOffsetTransitionRule], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneOffsetTransitionRule]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TimeDefinitionTest
    implements org.j8unit.repository.java.time.zone.ZoneOffsetTransitionRuleTests.TimeDefinitionTests<TimeDefinition> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneOffsetTransitionRule$TimeDefinition]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(TimeDefinition.class);
        }

        @Parameter(0)
        public TimeDefinition sut;

        @Override
        public TimeDefinition createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneOffsetTransitionRule$TimeDefinition]

    }

}
