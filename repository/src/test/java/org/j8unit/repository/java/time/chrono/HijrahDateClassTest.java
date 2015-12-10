package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HijrahDateClassTest
implements org.j8unit.repository.java.time.chrono.HijrahDateClassTests<java.time.chrono.HijrahDate> {

    @Override
    public Class<java.time.chrono.HijrahDate> createNewSUT() {
        return java.time.chrono.HijrahDate.class;
    }

}
