package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SNIMatcher;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SNIMatcher} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.net.ssl.SNIMatcherClassTests}).
 */
@RunWith(J8Unit4.class)
public class SNIMatcherClassTest
implements SNIMatcherClassTests<SNIMatcher> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SNIMatcher]

    @Override
    public Class<SNIMatcher> createNewSUT() {
        return SNIMatcher.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SNIMatcher]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SNIMatcher]

}
