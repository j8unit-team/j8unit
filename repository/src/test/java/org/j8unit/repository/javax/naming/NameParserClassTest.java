package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameParserClassTest
implements org.j8unit.repository.javax.naming.NameParserClassTests<javax.naming.NameParser> {

    @Override
    public Class<javax.naming.NameParser> createNewSUT() {
        return javax.naming.NameParser.class;
    }

}
