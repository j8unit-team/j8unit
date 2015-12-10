package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaListClassTest
implements org.j8unit.repository.org.w3c.dom.stylesheets.MediaListClassTests<org.w3c.dom.stylesheets.MediaList> {

    @Override
    public Class<org.w3c.dom.stylesheets.MediaList> createNewSUT() {
        return org.w3c.dom.stylesheets.MediaList.class;
    }

}
