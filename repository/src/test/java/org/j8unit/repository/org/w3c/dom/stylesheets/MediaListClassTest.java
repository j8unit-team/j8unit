package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.MediaList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MediaList} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.stylesheets.MediaListClassTests}).
 */

@RunWith(J8Unit4.class)
public class MediaListClassTest
implements org.j8unit.repository.org.w3c.dom.stylesheets.MediaListClassTests<MediaList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.stylesheets.MediaList]

    @Override
    public Class<MediaList> createNewSUT() {
        return MediaList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.stylesheets.MediaList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.stylesheets.MediaList]

}
