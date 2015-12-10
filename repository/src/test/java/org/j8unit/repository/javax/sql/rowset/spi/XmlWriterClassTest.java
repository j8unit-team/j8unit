package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlWriterClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.XmlWriterClassTests<javax.sql.rowset.spi.XmlWriter> {

    @Override
    public Class<javax.sql.rowset.spi.XmlWriter> createNewSUT() {
        return javax.sql.rowset.spi.XmlWriter.class;
    }

}
