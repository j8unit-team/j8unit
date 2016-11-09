package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.DetailEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DetailEntry} (by simply reusing the
 * J8Unit test interface {@link DetailEntryClassTests}).
 */

@RunWith(J8Unit4.class)
public class DetailEntryClassTest
implements DetailEntryClassTests<DetailEntry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.DetailEntry]

    @Override
    public Class<DetailEntry> createNewSUT() {
        return DetailEntry.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.DetailEntry]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.DetailEntry]

}
