package org.j8unit.repository.java.nio.charset;

import java.nio.charset.StandardCharsets;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StandardCharsets} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.charset.StandardCharsetsClassTests}).
 */

@RunWith(J8Unit4.class)
public class StandardCharsetsClassTest
implements StandardCharsetsClassTests<StandardCharsets> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.StandardCharsets]

    @Override
    public Class<StandardCharsets> createNewSUT() {
        return StandardCharsets.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.StandardCharsets]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.StandardCharsets]

}
