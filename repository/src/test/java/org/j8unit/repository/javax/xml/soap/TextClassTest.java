package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextClassTest
implements org.j8unit.repository.javax.xml.soap.TextClassTests<javax.xml.soap.Text> {

    @Override
    public Class<javax.xml.soap.Text> createNewSUT() {
        return javax.xml.soap.Text.class;
    }

}
