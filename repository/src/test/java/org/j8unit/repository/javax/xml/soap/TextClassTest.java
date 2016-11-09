package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Text;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Text} (by simply reusing the J8Unit test
 * interface {@link TextClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextClassTest
implements TextClassTests<Text> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.Text]

    @Override
    public Class<Text> createNewSUT() {
        return Text.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.Text]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.Text]

}
