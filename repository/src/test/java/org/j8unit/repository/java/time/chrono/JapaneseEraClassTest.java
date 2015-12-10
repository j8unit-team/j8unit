package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JapaneseEraClassTest
implements org.j8unit.repository.java.time.chrono.JapaneseEraClassTests<java.time.chrono.JapaneseEra> {

    @Override
    public Class<java.time.chrono.JapaneseEra> createNewSUT() {
        return java.time.chrono.JapaneseEra.class;
    }

}
