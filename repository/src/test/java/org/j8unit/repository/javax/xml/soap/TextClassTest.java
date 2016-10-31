package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Text;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextClassTest
implements org.j8unit.repository.javax.xml.soap.TextClassTests<Text> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.Text]

    @Override
    public Class<Text> createNewSUT() {
        return Text.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.Text]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.Text]

}
