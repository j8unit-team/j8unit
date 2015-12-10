package org.j8unit.repository.java.time.zone;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneRulesClassTest
implements org.j8unit.repository.java.time.zone.ZoneRulesClassTests<java.time.zone.ZoneRules> {

    @Override
    public Class<java.time.zone.ZoneRules> createNewSUT() {
        return java.time.zone.ZoneRules.class;
    }

}
