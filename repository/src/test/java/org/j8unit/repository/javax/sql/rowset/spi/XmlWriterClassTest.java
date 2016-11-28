package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.XmlWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlWriter} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sql.rowset.spi.XmlWriterClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlWriterClassTest
implements XmlWriterClassTests<XmlWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.XmlWriter]

    @Override
    public Class<XmlWriter> createNewSUT() {
        return XmlWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.spi.XmlWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.XmlWriter]

}
