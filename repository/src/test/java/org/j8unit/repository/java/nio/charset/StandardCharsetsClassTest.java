package org.j8unit.repository.java.nio.charset;

import java.nio.charset.StandardCharsets;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardCharsetsClassTest
implements org.j8unit.repository.java.nio.charset.StandardCharsetsClassTests<StandardCharsets> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.StandardCharsets]

    @Override
    public Class<StandardCharsets> createNewSUT() {
        return StandardCharsets.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.StandardCharsets]

}
