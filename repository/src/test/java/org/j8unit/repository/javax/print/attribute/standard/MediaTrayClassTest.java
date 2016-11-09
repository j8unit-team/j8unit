package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.MediaTray;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MediaTray} (by simply reusing the J8Unit
 * test interface {@link MediaTrayClassTests}).
 */

@RunWith(J8Unit4.class)
public class MediaTrayClassTest
implements MediaTrayClassTests<MediaTray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.MediaTray]

    @Override
    public Class<MediaTray> createNewSUT() {
        return MediaTray.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.MediaTray]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.MediaTray]

}
