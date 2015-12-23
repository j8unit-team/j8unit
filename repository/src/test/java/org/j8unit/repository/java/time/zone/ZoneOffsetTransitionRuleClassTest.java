package org.j8unit.repository.java.time.zone;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneOffsetTransitionRuleClassTest
implements org.j8unit.repository.java.time.zone.ZoneOffsetTransitionRuleClassTests<java.time.zone.ZoneOffsetTransitionRule> {

    @Override
    public Class<java.time.zone.ZoneOffsetTransitionRule> createNewSUT() {
        return java.time.zone.ZoneOffsetTransitionRule.class;
    }

    @RunWith(J8Unit4.class)
    public static class TimeDefinitionClassTest
    implements
    org.j8unit.repository.java.time.zone.ZoneOffsetTransitionRuleClassTests.TimeDefinitionClassTests<java.time.zone.ZoneOffsetTransitionRule.TimeDefinition> {

        @Override
        public Class<java.time.zone.ZoneOffsetTransitionRule.TimeDefinition> createNewSUT() {
            return java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.class;
        }

    }

}
