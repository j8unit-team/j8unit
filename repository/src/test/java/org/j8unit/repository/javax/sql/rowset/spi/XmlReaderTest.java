package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.XmlReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlReaderTest
implements org.j8unit.repository.javax.sql.rowset.spi.XmlReaderTests<XmlReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.XmlReader]

    @Override
    public XmlReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.spi.XmlReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.XmlReader]

}
