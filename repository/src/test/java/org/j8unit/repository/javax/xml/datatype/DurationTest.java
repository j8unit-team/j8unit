package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.Duration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DurationTest
implements org.j8unit.repository.javax.xml.datatype.DurationTests<Duration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.Duration]

    @Override
    public Duration createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.datatype.Duration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.Duration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.Duration]

}
