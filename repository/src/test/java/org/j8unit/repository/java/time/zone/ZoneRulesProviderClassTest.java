package org.j8unit.repository.java.time.zone;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneRulesProviderClassTest
implements org.j8unit.repository.java.time.zone.ZoneRulesProviderClassTests<java.time.zone.ZoneRulesProvider> {

    @Override
    public Class<java.time.zone.ZoneRulesProvider> createNewSUT() {
        return java.time.zone.ZoneRulesProvider.class;
    }

}
