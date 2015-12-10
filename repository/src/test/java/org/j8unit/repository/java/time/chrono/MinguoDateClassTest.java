package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MinguoDateClassTest
implements org.j8unit.repository.java.time.chrono.MinguoDateClassTests<java.time.chrono.MinguoDate> {

    @Override
    public Class<java.time.chrono.MinguoDate> createNewSUT() {
        return java.time.chrono.MinguoDate.class;
    }

}
