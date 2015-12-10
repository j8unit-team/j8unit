package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PageAttributesClassTest
implements org.j8unit.repository.java.awt.PageAttributesClassTests<java.awt.PageAttributes> {

    @RunWith(J8Unit4.class)
    public static class ColorTypeClassTest
    implements org.j8unit.repository.java.awt.PageAttributesClassTests.ColorTypeClassTests<java.awt.PageAttributes.ColorType> {

        @Override
        public Class<java.awt.PageAttributes.ColorType> createNewSUT() {
            return java.awt.PageAttributes.ColorType.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class MediaTypeClassTest
    implements org.j8unit.repository.java.awt.PageAttributesClassTests.MediaTypeClassTests<java.awt.PageAttributes.MediaType> {

        @Override
        public Class<java.awt.PageAttributes.MediaType> createNewSUT() {
            return java.awt.PageAttributes.MediaType.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OrientationRequestedTypeClassTest
    implements org.j8unit.repository.java.awt.PageAttributesClassTests.OrientationRequestedTypeClassTests<java.awt.PageAttributes.OrientationRequestedType> {

        @Override
        public Class<java.awt.PageAttributes.OrientationRequestedType> createNewSUT() {
            return java.awt.PageAttributes.OrientationRequestedType.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class OriginTypeClassTest
    implements org.j8unit.repository.java.awt.PageAttributesClassTests.OriginTypeClassTests<java.awt.PageAttributes.OriginType> {

        @Override
        public Class<java.awt.PageAttributes.OriginType> createNewSUT() {
            return java.awt.PageAttributes.OriginType.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class PrintQualityTypeClassTest
    implements org.j8unit.repository.java.awt.PageAttributesClassTests.PrintQualityTypeClassTests<java.awt.PageAttributes.PrintQualityType> {

        @Override
        public Class<java.awt.PageAttributes.PrintQualityType> createNewSUT() {
            return java.awt.PageAttributes.PrintQualityType.class;
        }

    }

    @Override
    public Class<java.awt.PageAttributes> createNewSUT() {
        return java.awt.PageAttributes.class;
    }

}
