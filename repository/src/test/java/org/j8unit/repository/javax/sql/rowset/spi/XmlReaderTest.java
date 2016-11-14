package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.XmlReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlReader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.spi.XmlReaderTests}).
 */

@RunWith(J8Unit4.class)
public class XmlReaderTest
implements XmlReaderTests<XmlReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.XmlReader]

    @Override
    public XmlReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.spi.XmlReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.spi.XmlReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.spi.XmlReader]

}
