package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.XmlReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlReaderClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.XmlReaderClassTests<XmlReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.XmlReader]

    @Override
    public Class<XmlReader> createNewSUT() {
        return XmlReader.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.XmlReader]

}
