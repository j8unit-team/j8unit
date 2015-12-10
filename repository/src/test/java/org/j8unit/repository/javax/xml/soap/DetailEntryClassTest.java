package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DetailEntryClassTest
implements org.j8unit.repository.javax.xml.soap.DetailEntryClassTests<javax.xml.soap.DetailEntry> {

    @Override
    public Class<javax.xml.soap.DetailEntry> createNewSUT() {
        return javax.xml.soap.DetailEntry.class;
    }

}
