package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.JavaBug;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTMLTest
implements org.j8unit.repository.javax.swing.text.html.HTMLTests<javax.swing.text.html.HTML> {

    @RunWith(J8Unit4.class)
    public static class AttributeTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLTests.AttributeTests<javax.swing.text.html.HTML.Attribute> {

        @Override
        public javax.swing.text.html.HTML.Attribute createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.html.HTML.Attribute] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class TagTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLTests.TagTests<javax.swing.text.html.HTML.Tag> {

        @Override
        public javax.swing.text.html.HTML.Tag createNewSUT() {
            return new javax.swing.text.html.HTML.Tag();
        }

        @Category(JavaBug.class)
        @Override
        public void toStringMustReturnNotNull() {
            HTMLTests.TagTests.super.toStringMustReturnNotNull();
        }

    }

    @RunWith(J8Unit4.class)
    public static class UnknownTagTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLTests.UnknownTagTests<javax.swing.text.html.HTML.UnknownTag> {

        @Override
        public javax.swing.text.html.HTML.UnknownTag createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.html.HTML.UnknownTag] available.");
        }

    }

    @Override
    public javax.swing.text.html.HTML createNewSUT() {
        return new javax.swing.text.html.HTML();
    }

}
