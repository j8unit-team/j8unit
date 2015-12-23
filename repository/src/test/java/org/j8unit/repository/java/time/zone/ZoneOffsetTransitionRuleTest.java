package org.j8unit.repository.java.time.zone;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
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
implements org.j8unit.repository.java.time.zone.ZoneOffsetTransitionRuleTests<java.time.zone.ZoneOffsetTransitionRule> {

    @Override
    public java.time.zone.ZoneOffsetTransitionRule createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.zone.ZoneOffsetTransitionRule] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TimeDefinitionTest
    implements org.j8unit.repository.java.time.zone.ZoneOffsetTransitionRuleTests.TimeDefinitionTests<java.time.zone.ZoneOffsetTransitionRule.TimeDefinition> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.class);
        }

        @Parameter(0)
        public java.time.zone.ZoneOffsetTransitionRule.TimeDefinition sut;

        @Override
        public java.time.zone.ZoneOffsetTransitionRule.TimeDefinition createNewSUT() {
            return this.sut;
        }

    }

}
