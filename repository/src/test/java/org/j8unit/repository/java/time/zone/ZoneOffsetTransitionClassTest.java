package org.j8unit.repository.java.time.zone;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneOffsetTransitionClassTest
implements org.j8unit.repository.java.time.zone.ZoneOffsetTransitionClassTests<java.time.zone.ZoneOffsetTransition> {

    @Override
    public Class<java.time.zone.ZoneOffsetTransition> createNewSUT() {
        return java.time.zone.ZoneOffsetTransition.class;
    }

}
