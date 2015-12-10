package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocFlavorClassTest
implements org.j8unit.repository.javax.print.DocFlavorClassTests<javax.print.DocFlavor> {

    @RunWith(J8Unit4.class)
    public static class BYTE_ARRAYClassTest
    implements org.j8unit.repository.javax.print.DocFlavorClassTests.BYTE_ARRAYClassTests<javax.print.DocFlavor.BYTE_ARRAY> {

        @Override
        public Class<javax.print.DocFlavor.BYTE_ARRAY> createNewSUT() {
            return javax.print.DocFlavor.BYTE_ARRAY.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class CHAR_ARRAYClassTest
    implements org.j8unit.repository.javax.print.DocFlavorClassTests.CHAR_ARRAYClassTests<javax.print.DocFlavor.CHAR_ARRAY> {

        @Override
        public Class<javax.print.DocFlavor.CHAR_ARRAY> createNewSUT() {
            return javax.print.DocFlavor.CHAR_ARRAY.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class INPUT_STREAMClassTest
    implements org.j8unit.repository.javax.print.DocFlavorClassTests.INPUT_STREAMClassTests<javax.print.DocFlavor.INPUT_STREAM> {

        @Override
        public Class<javax.print.DocFlavor.INPUT_STREAM> createNewSUT() {
            return javax.print.DocFlavor.INPUT_STREAM.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class READERClassTest
    implements org.j8unit.repository.javax.print.DocFlavorClassTests.READERClassTests<javax.print.DocFlavor.READER> {

        @Override
        public Class<javax.print.DocFlavor.READER> createNewSUT() {
            return javax.print.DocFlavor.READER.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class SERVICE_FORMATTEDClassTest
    implements org.j8unit.repository.javax.print.DocFlavorClassTests.SERVICE_FORMATTEDClassTests<javax.print.DocFlavor.SERVICE_FORMATTED> {

        @Override
        public Class<javax.print.DocFlavor.SERVICE_FORMATTED> createNewSUT() {
            return javax.print.DocFlavor.SERVICE_FORMATTED.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class STRINGClassTest
    implements org.j8unit.repository.javax.print.DocFlavorClassTests.STRINGClassTests<javax.print.DocFlavor.STRING> {

        @Override
        public Class<javax.print.DocFlavor.STRING> createNewSUT() {
            return javax.print.DocFlavor.STRING.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class URLClassTest
    implements org.j8unit.repository.javax.print.DocFlavorClassTests.URLClassTests<javax.print.DocFlavor.URL> {

        @Override
        public Class<javax.print.DocFlavor.URL> createNewSUT() {
            return javax.print.DocFlavor.URL.class;
        }

    }

    @Override
    public Class<javax.print.DocFlavor> createNewSUT() {
        return javax.print.DocFlavor.class;
    }

}
