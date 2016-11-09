package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.XmlReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlReader} (by simply reusing the J8Unit
 * test interface {@link XmlReaderClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlReaderClassTest
implements XmlReaderClassTests<XmlReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.XmlReader]

    @Override
    public Class<XmlReader> createNewSUT() {
        return XmlReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.spi.XmlReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.XmlReader]

}
