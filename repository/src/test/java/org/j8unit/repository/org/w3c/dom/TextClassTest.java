package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Text;

@RunWith(J8Unit4.class)
public class TextClassTest
implements org.j8unit.repository.org.w3c.dom.TextClassTests<Text> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Text]

    @Override
    public Class<Text> createNewSUT() {
        return Text.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Text]

}
