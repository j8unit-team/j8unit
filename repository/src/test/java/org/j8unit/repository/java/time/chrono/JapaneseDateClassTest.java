package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JapaneseDateClassTest
implements org.j8unit.repository.java.time.chrono.JapaneseDateClassTests<java.time.chrono.JapaneseDate> {

    @Override
    public Class<java.time.chrono.JapaneseDate> createNewSUT() {
        return java.time.chrono.JapaneseDate.class;
    }

}
