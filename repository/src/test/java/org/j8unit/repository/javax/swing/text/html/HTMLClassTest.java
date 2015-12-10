package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTMLClassTest
implements org.j8unit.repository.javax.swing.text.html.HTMLClassTests<javax.swing.text.html.HTML> {

    @RunWith(J8Unit4.class)
    public static class AttributeClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLClassTests.AttributeClassTests<javax.swing.text.html.HTML.Attribute> {

        @Override
        public Class<javax.swing.text.html.HTML.Attribute> createNewSUT() {
            return javax.swing.text.html.HTML.Attribute.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class TagClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLClassTests.TagClassTests<javax.swing.text.html.HTML.Tag> {

        @Override
        public Class<javax.swing.text.html.HTML.Tag> createNewSUT() {
            return javax.swing.text.html.HTML.Tag.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class UnknownTagClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLClassTests.UnknownTagClassTests<javax.swing.text.html.HTML.UnknownTag> {

        @Override
        public Class<javax.swing.text.html.HTML.UnknownTag> createNewSUT() {
            return javax.swing.text.html.HTML.UnknownTag.class;
        }

    }

    @Override
    public Class<javax.swing.text.html.HTML> createNewSUT() {
        return javax.swing.text.html.HTML.class;
    }

}
