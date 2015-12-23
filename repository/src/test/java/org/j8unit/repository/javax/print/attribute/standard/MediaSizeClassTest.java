package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaSizeClassTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests<javax.print.attribute.standard.MediaSize> {

    @Override
    public Class<javax.print.attribute.standard.MediaSize> createNewSUT() {
        return javax.print.attribute.standard.MediaSize.class;
    }

    @RunWith(J8Unit4.class)
    public static class EngineeringClassTest
    implements
    org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.EngineeringClassTests<javax.print.attribute.standard.MediaSize.Engineering> {

        @Override
        public Class<javax.print.attribute.standard.MediaSize.Engineering> createNewSUT() {
            return javax.print.attribute.standard.MediaSize.Engineering.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ISOClassTest
    implements org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.ISOClassTests<javax.print.attribute.standard.MediaSize.ISO> {

        @Override
        public Class<javax.print.attribute.standard.MediaSize.ISO> createNewSUT() {
            return javax.print.attribute.standard.MediaSize.ISO.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class NAClassTest
    implements org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.NAClassTests<javax.print.attribute.standard.MediaSize.NA> {

        @Override
        public Class<javax.print.attribute.standard.MediaSize.NA> createNewSUT() {
            return javax.print.attribute.standard.MediaSize.NA.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OtherClassTest
    implements org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.OtherClassTests<javax.print.attribute.standard.MediaSize.Other> {

        @Override
        public Class<javax.print.attribute.standard.MediaSize.Other> createNewSUT() {
            return javax.print.attribute.standard.MediaSize.Other.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class JISClassTest
    implements org.j8unit.repository.javax.print.attribute.standard.MediaSizeClassTests.JISClassTests<javax.print.attribute.standard.MediaSize.JIS> {

        @Override
        public Class<javax.print.attribute.standard.MediaSize.JIS> createNewSUT() {
            return javax.print.attribute.standard.MediaSize.JIS.class;
        }

    }

}
