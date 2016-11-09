package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.XmlWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlWriter} (by simply reusing the
 * J8Unit test interface {@link XmlWriterTests}).
 */

@RunWith(J8Unit4.class)
public class XmlWriterTest
implements XmlWriterTests<XmlWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.XmlWriter]

    @Override
    public XmlWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.spi.XmlWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.spi.XmlWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.spi.XmlWriter]

}
