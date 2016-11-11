package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Detail;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Detail} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.soap.DetailClassTests}).
 */

@RunWith(J8Unit4.class)
public class DetailClassTest
implements DetailClassTests<Detail> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.Detail]

    @Override
    public Class<Detail> createNewSUT() {
        return Detail.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.Detail]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.Detail]

}
