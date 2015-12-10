package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataClassTest
implements org.j8unit.repository.javax.xml.crypto.DataClassTests<javax.xml.crypto.Data> {

    @Override
    public Class<javax.xml.crypto.Data> createNewSUT() {
        return javax.xml.crypto.Data.class;
    }

}
