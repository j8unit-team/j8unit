package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Compression;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompressionClassTest
implements org.j8unit.repository.javax.print.attribute.standard.CompressionClassTests<Compression> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Compression]

    @Override
    public Class<Compression> createNewSUT() {
        return Compression.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Compression]

}
