package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.OutputKeys;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OutputKeys} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.OutputKeysClassTests}).
 */
@RunWith(J8Unit4.class)
public class OutputKeysClassTest
implements OutputKeysClassTests<OutputKeys> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.OutputKeys]

    @Override
    public Class<OutputKeys> createNewSUT() {
        return OutputKeys.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.OutputKeys]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.OutputKeys]

}
