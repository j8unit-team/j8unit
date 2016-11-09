package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.MediaName;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MediaName} (by simply reusing the J8Unit
 * test interface {@link MediaNameClassTests}).
 */

@RunWith(J8Unit4.class)
public class MediaNameClassTest
implements MediaNameClassTests<MediaName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.MediaName]

    @Override
    public Class<MediaName> createNewSUT() {
        return MediaName.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.MediaName]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.MediaName]

}
