package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocaleClassTest
implements org.j8unit.repository.java.util.LocaleClassTests<java.util.Locale> {

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.LocaleClassTests.BuilderClassTests<java.util.Locale.Builder> {

        @Override
        public Class<java.util.Locale.Builder> createNewSUT() {
            return java.util.Locale.Builder.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class CategoryClassTest
    implements org.j8unit.repository.java.util.LocaleClassTests.CategoryClassTests<java.util.Locale.Category> {

        @Override
        public Class<java.util.Locale.Category> createNewSUT() {
            return java.util.Locale.Category.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class FilteringModeClassTest
    implements org.j8unit.repository.java.util.LocaleClassTests.FilteringModeClassTests<java.util.Locale.FilteringMode> {

        @Override
        public Class<java.util.Locale.FilteringMode> createNewSUT() {
            return java.util.Locale.FilteringMode.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LanguageRangeClassTest
    implements org.j8unit.repository.java.util.LocaleClassTests.LanguageRangeClassTests<java.util.Locale.LanguageRange> {

        @Override
        public Class<java.util.Locale.LanguageRange> createNewSUT() {
            return java.util.Locale.LanguageRange.class;
        }

    }

    @Override
    public Class<java.util.Locale> createNewSUT() {
        return java.util.Locale.class;
    }

}
