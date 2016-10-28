package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Media;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaClassTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaClassTests<Media> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Media]

    @Override
    public Class<Media> createNewSUT() {
        return Media.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Media]

}
