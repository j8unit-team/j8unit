package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.util.Locale;
import java.util.Locale.Builder;
import java.util.Locale.Category;
import java.util.Locale.FilteringMode;
import java.util.Locale.LanguageRange;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Locale} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.LocaleTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LocaleTest
implements LocaleTests<Locale> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Locale]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Locale.UK, //
                                Locale.JAPAN, //
                                Locale.ITALIAN, //
                                Locale.GERMANY, //
                                Locale.TRADITIONAL_CHINESE, //
                                Locale.CANADA_FRENCH, //
                                Locale.US, //
                                Locale.KOREAN, //
                                Locale.GERMAN, //
                                Locale.SIMPLIFIED_CHINESE, //
                                Locale.JAPANESE, //
                                Locale.CHINA, //
                                Locale.ENGLISH, //
                                Locale.ROOT, //
                                Locale.TAIWAN, //
                                Locale.CANADA, //
                                Locale.PRC, //
                                Locale.FRANCE, //
                                Locale.KOREA, //
                                Locale.FRENCH, //
                                Locale.CHINESE, //
                                Locale.ITALY);
    }

    @Parameter(0)
    public Locale sut;

    @Override
    public Locale createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Locale]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Locale]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link LanguageRange} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.java.util.LocaleTests.LanguageRangeTests}).
     */
    @RunWith(J8Unit4.class)
    public static class LanguageRangeTest
    implements LanguageRangeTests<LanguageRange> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Locale$LanguageRange]

        @Override
        public LanguageRange createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Locale.LanguageRange], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Locale$LanguageRange]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Locale$LanguageRange]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Category} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.LocaleTests.CategoryTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CategoryTest
    implements CategoryTests<Category> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Locale$Category]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Category.class);
        }

        @Parameter(0)
        public Category sut;

        @Override
        public Category createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Locale$Category]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Locale$Category]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FilteringMode} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.java.util.LocaleTests.FilteringModeTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FilteringModeTest
    implements FilteringModeTests<FilteringMode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Locale$FilteringMode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOfEnumClass(FilteringMode.class);
        }

        @Parameter(0)
        public FilteringMode sut;

        @Override
        public FilteringMode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Locale$FilteringMode]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Locale$FilteringMode]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BuilderTest
    implements FactoryBasedJ8UnitTest<Builder>, org.j8unit.repository.java.util.LocaleTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Locale$Builder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(Builder::new);
        }

        @Parameter(0)
        public Callable<Builder> sutFactory;

        @Override
        public Callable<Builder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Locale$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Locale$Builder]

    }

}
