package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Text;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Text} (by simply reusing the J8Unit test
 * interface {@link TextClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextClassTest
implements TextClassTests<Text> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Text]

    @Override
    public Class<Text> createNewSUT() {
        return Text.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.Text]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Text]

}
