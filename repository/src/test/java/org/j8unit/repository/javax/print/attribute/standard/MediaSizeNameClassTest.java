package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.MediaSizeName;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MediaSizeName} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.MediaSizeNameClassTests}).
 */

@RunWith(J8Unit4.class)
public class MediaSizeNameClassTest
implements MediaSizeNameClassTests<MediaSizeName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.MediaSizeName]

    @Override
    public Class<MediaSizeName> createNewSUT() {
        return MediaSizeName.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.MediaSizeName]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.MediaSizeName]

}
