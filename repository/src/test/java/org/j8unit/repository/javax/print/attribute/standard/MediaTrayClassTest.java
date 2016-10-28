package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.MediaTray;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaTrayClassTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaTrayClassTests<MediaTray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.MediaTray]

    @Override
    public Class<MediaTray> createNewSUT() {
        return MediaTray.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.MediaTray]

}
