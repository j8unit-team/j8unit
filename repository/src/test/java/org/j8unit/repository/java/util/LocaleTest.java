package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class LocaleTest
implements org.j8unit.repository.java.util.LocaleTests<java.util.Locale> {

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.util.LocaleTests.BuilderTests<java.util.Locale.Builder> {

        @Override
        public java.util.Locale.Builder createNewSUT() {
            return new java.util.Locale.Builder();
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CategoryTest
    implements org.j8unit.repository.java.util.LocaleTests.CategoryTests<java.util.Locale.Category> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.util.Locale.Category.class);
        }

        @Parameter(0)
        public java.util.Locale.Category sut;

        @Override
        public java.util.Locale.Category createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FilteringModeTest
    implements org.j8unit.repository.java.util.LocaleTests.FilteringModeTests<java.util.Locale.FilteringMode> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.util.Locale.FilteringMode.class);
        }

        @Parameter(0)
        public java.util.Locale.FilteringMode sut;

        @Override
        public java.util.Locale.FilteringMode createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LanguageRangeTest
    implements org.j8unit.repository.java.util.LocaleTests.LanguageRangeTests<java.util.Locale.LanguageRange> {

        @Override
        public java.util.Locale.LanguageRange createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.util.Locale.LanguageRange] available.");
        }

    }

    @Override
    public java.util.Locale createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.util.Locale] available.");
    }

}
