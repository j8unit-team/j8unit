package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlReaderClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.XmlReaderClassTests<javax.sql.rowset.spi.XmlReader> {

    @Override
    public Class<javax.sql.rowset.spi.XmlReader> createNewSUT() {
        return javax.sql.rowset.spi.XmlReader.class;
    }

}
