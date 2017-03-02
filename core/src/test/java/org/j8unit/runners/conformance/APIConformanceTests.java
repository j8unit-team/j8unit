package org.j8unit.runners.conformance;

import static java.util.Arrays.stream;
import static org.j8unit.runners.conformance.InstanciationStrategies.SKIP_ANNOTATION;
import static org.j8unit.runners.conformance.InstanciationStrategies.SKIP_INTERFACE;
import static org.j8unit.runners.conformance.SummaryTest.NONINSTANCIATABLE;
import static org.j8unit.runners.conformance.SummaryTest.UNDISCOVERABLE;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;
import java.util.List;
import java.util.function.Predicate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;

public class APIConformanceTests {

    @Captor
    ArgumentCaptor<Description> ignoredTests;

    @Captor
    ArgumentCaptor<Description> startedTests;

    @Captor
    ArgumentCaptor<Description> finishedTests;

    @Captor
    ArgumentCaptor<Failure> failedTestAssumptions;

    @Captor
    ArgumentCaptor<Failure> failedTests;

    @Before
    public void init() {
        initMocks(this);
    }

    @Test(expected = InitializationError.class)
    public void initializationErrorIfMissingAnnotation()
    throws Exception {
        new APIConformance(SuiteWithoutAPIConformanceCandidatesAnnotation.class);
    }

    @Test(expected = InitializationError.class)
    public void initializationErrorIfEmptyAnnotation()
    throws Exception {
        new APIConformance(SuiteWithEmptyListOfCandidates.class);
    }

    private static final Predicate<Description> desc(final String... fragments) {
        return desc -> stream(fragments).allMatch(f -> desc.getDisplayName().contains(f));
    }

    private static final Predicate<Failure> failDesc(final String... fragments) {
        return fail -> stream(fragments).allMatch(f -> fail.getDescription().getDisplayName().contains(f));
    }

    private static final Predicate<Failure> failMsg(final String... fragments) {
        return fail -> stream(fragments).allMatch(f -> fail.getException().getMessage().contains(f));
    }

    private static final Predicate<Failure> notFounds(final String... fragments) {
        return fail -> stream(fragments).allMatch(f -> stream(fail.getException().getSuppressed()).anyMatch(s -> s.getMessage().contains(f)));
    }

    @SafeVarargs
    private static <T> void once(final List<? extends T> list, final Predicate<T>... predicates) {
        final Predicate<T> predicate = stream(predicates).reduce(Predicate::and).get();
        assertEquals(1, list.stream().filter(predicate).count());
    }

    @Test
    public void testAPIConformanceTestOfInterface()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfCloneable.class);
        assertEquals(6, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(6)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Cloneable.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Cloneable#..."));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable#..."));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable#..."));

        verify(spy, times(6)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Cloneable.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Cloneable#..."));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable#..."));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable#..."));

        verify(spy, times(3)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable.class"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.lang.CloneableClassTests"));
        once(missassumed, failDesc("subjectUnderTestMustBeNotNull", "java.lang.Cloneable#..."), failMsg(SKIP_INTERFACE));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Cloneable#..."), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.lang.CloneableTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfClassWithDefaultConstructor()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfObject.class);
        assertEquals(6, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(6)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Object.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Object#Object()"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));

        verify(spy, times(6)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Object.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Object#Object()"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));

        verify(spy, times(2)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.lang.ObjectClassTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.lang.ObjectTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfClassWithDefaultConstructor_WithReusableTests()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfObject_WithReusableTests.class);
        assertEquals(8, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(8)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Object.class"));
        once(started, desc("wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode", "java.lang.Object.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Object#Object()"));
        once(started, desc("toStringMustReturnNotNull", "java.lang.Object#Object()"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));

        verify(spy, times(8)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Object.class"));
        once(finished, desc("wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode", "java.lang.Object.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Object#Object()"));
        once(finished, desc("toStringMustReturnNotNull", "java.lang.Object#Object()"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Object#Object()"));

        verify(spy, times(0)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfEnum_WithReusableTests()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfDayOfWeek_WithReusableTests.class);
        assertEquals(41, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(41)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek.class"));
        once(started, desc("wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode", "java.time.DayOfWeek.class"));
        once(started, desc("isEnumMustReturnTrue", "java.time.DayOfWeek.class"));
        once(started, desc("enumsMustContainImplicitilyDefinedValuesMethod", "java.time.DayOfWeek.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SUNDAY"));
        once(started, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#SUNDAY"));
        once(started, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#SUNDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));

        verify(spy, times(41)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek.class"));
        once(finished, desc("wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode", "java.time.DayOfWeek.class"));
        once(finished, desc("isEnumMustReturnTrue", "java.time.DayOfWeek.class"));
        once(finished, desc("enumsMustContainImplicitilyDefinedValuesMethod", "java.time.DayOfWeek.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SUNDAY"));
        once(finished, desc("toStringMustReturnNotNull", "java.time.DayOfWeek#SUNDAY"));
        once(finished, desc("dayOfNextWeekIsSimilar", "java.time.DayOfWeek#SUNDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));

        verify(spy, times(15)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.DayOfWeekClassTests",
                       "some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorClassTests",
                       "some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterClassTests",
                       "some.reusable.j8unit.test.repository.java.lang.ComparableClassTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableClassTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterTests",
                       "some.reusable.j8unit.test.repository.java.lang.EnumTests", "some.reusable.j8unit.test.repository.java.lang.ComparableTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterTests",
                       "some.reusable.j8unit.test.repository.java.lang.EnumTests", "some.reusable.j8unit.test.repository.java.lang.ComparableTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterTests",
                       "some.reusable.j8unit.test.repository.java.lang.EnumTests", "some.reusable.j8unit.test.repository.java.lang.ComparableTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterTests",
                       "some.reusable.j8unit.test.repository.java.lang.EnumTests", "some.reusable.j8unit.test.repository.java.lang.ComparableTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterTests",
                       "some.reusable.j8unit.test.repository.java.lang.EnumTests", "some.reusable.j8unit.test.repository.java.lang.ComparableTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterTests",
                       "some.reusable.j8unit.test.repository.java.lang.EnumTests", "some.reusable.j8unit.test.repository.java.lang.ComparableTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAdjusterTests",
                       "some.reusable.j8unit.test.repository.java.lang.EnumTests", "some.reusable.j8unit.test.repository.java.lang.ComparableTests",
                       "some.reusable.j8unit.test.repository.java.io.SerializableTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.time.temporal.TemporalAccessorTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfEnum()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfDayOfWeek.class);
        assertEquals(24, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(24)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SUNDAY"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));

        verify(spy, times(24)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.time.DayOfWeek#SUNDAY"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"));

        verify(spy, times(8)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek.class"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekClassTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorClassTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterClassTests", "org.j8unit.repository.java.lang.EnumClassTests",
                       "org.j8unit.repository.java.lang.ComparableClassTests", "org.j8unit.repository.java.io.SerializableClassTests",
                       "org.j8unit.repository.java.lang.ObjectClassTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#MONDAY"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterTests", "org.j8unit.repository.java.lang.EnumTests",
                       "org.j8unit.repository.java.lang.ComparableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#TUESDAY"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterTests", "org.j8unit.repository.java.lang.EnumTests",
                       "org.j8unit.repository.java.lang.ComparableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#WEDNESDAY"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterTests", "org.j8unit.repository.java.lang.EnumTests",
                       "org.j8unit.repository.java.lang.ComparableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#THURSDAY"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterTests", "org.j8unit.repository.java.lang.EnumTests",
                       "org.j8unit.repository.java.lang.ComparableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#FRIDAY"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterTests", "org.j8unit.repository.java.lang.EnumTests",
                       "org.j8unit.repository.java.lang.ComparableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SATURDAY"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterTests", "org.j8unit.repository.java.lang.EnumTests",
                       "org.j8unit.repository.java.lang.ComparableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.time.DayOfWeek#SUNDAY"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.time.DayOfWeekTests", "org.j8unit.repository.java.time.temporal.TemporalAccessorTests",
                       "org.j8unit.repository.java.time.temporal.TemporalAdjusterTests", "org.j8unit.repository.java.lang.EnumTests",
                       "org.j8unit.repository.java.lang.ComparableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfAnnotation()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfDeprecated.class);
        assertEquals(6, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(6)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated#..."));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));

        verify(spy, times(6)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated#..."));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));

        verify(spy, times(3)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.lang.DeprecatedClassTests", "org.j8unit.repository.java.lang.annotation.AnnotationClassTests"));
        once(missassumed, failDesc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated#..."), failMsg(SKIP_ANNOTATION));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.lang.DeprecatedTests", "org.j8unit.repository.java.lang.annotation.AnnotationTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfAnnotation_WithInvalidTests()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfDeprecated_WithReusableTests.class);
        assertEquals(6, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(6)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated#..."));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));

        verify(spy, times(6)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated#..."));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."));

        verify(spy, times(5)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.lang.annotation.AnnotationClassTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated.class"), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.lang.DeprecatedClassTests"));
        once(missassumed, failDesc("subjectUnderTestMustBeNotNull", "java.lang.Deprecated#..."), failMsg(SKIP_ANNOTATION));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."), failMsg(UNDISCOVERABLE),
             notFounds("some.reusable.j8unit.test.repository.java.lang.annotation.AnnotationTests"));
        once(missassumed, failDesc("instanciateJ8UnitTestInterfaces", "ℝ", "java.lang.Deprecated#..."), failMsg(NONINSTANCIATABLE),
             notFounds("some.reusable.j8unit.test.repository.java.lang.DeprecatedTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfAbstractClassWithProtectedDefaultConstructor()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfAbstractCollection.class);
        assertEquals(6, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(6)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "java.util.AbstractCollection.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "java.util.AbstractCollection#..."));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection#..."));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection#..."));

        verify(spy, times(6)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.util.AbstractCollection.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "java.util.AbstractCollection#..."));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection#..."));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection#..."));

        verify(spy, times(3)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection.class"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.util.AbstractCollectionClassTests", "org.j8unit.repository.java.util.CollectionClassTests",
                       "org.j8unit.repository.java.lang.IterableClassTests", "org.j8unit.repository.java.lang.ObjectClassTests"));
        once(missassumed, failDesc("subjectUnderTestMustBeNotNull", "java.util.AbstractCollection#..."));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "java.util.AbstractCollection#..."), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.java.util.AbstractCollectionTests", "org.j8unit.repository.java.util.CollectionTests",
                       "org.j8unit.repository.java.lang.IterableTests", "org.j8unit.repository.java.lang.ObjectTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

    @Test
    public void testAPIConformanceTestOfAbstractClassWithPublicDefaultConstructor()
    throws Exception {
        final Runner runner = new APIConformance(SuiteOfAbstractAction.class);
        assertEquals(6, runner.testCount());

        final RunNotifier spy = spy(new RunNotifier());
        runner.run(spy);
        verify(spy, times(0)).fireTestIgnored(this.ignoredTests.capture());

        verify(spy, times(6)).fireTestStarted(this.startedTests.capture());
        final List<Description> started = this.startedTests.getAllValues();
        once(started, desc("subjectUnderTestMustBeNotNull", "javax.swing.AbstractAction.class"));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction.class"));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction.class"));
        once(started, desc("subjectUnderTestMustBeNotNull", "javax.swing.AbstractAction#..."));
        once(started, desc("instanciateJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction#..."));
        once(started, desc("exploreJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction#..."));

        verify(spy, times(6)).fireTestFinished(this.finishedTests.capture());
        final List<Description> finished = this.finishedTests.getAllValues();
        once(finished, desc("subjectUnderTestMustBeNotNull", "javax.swing.AbstractAction.class"));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction.class"));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction.class"));
        once(finished, desc("subjectUnderTestMustBeNotNull", "javax.swing.AbstractAction#..."));
        once(finished, desc("instanciateJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction#..."));
        once(finished, desc("exploreJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction#..."));

        verify(spy, times(3)).fireTestAssumptionFailed(this.failedTestAssumptions.capture());
        final List<Failure> missassumed = this.failedTestAssumptions.getAllValues();
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction.class"), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.javax.swing.AbstractActionClassTests", "org.j8unit.repository.javax.swing.ActionClassTests",
                       "org.j8unit.repository.java.awt.event.ActionListenerClassTests", "org.j8unit.repository.java.util.EventListenerClassTests",
                       "org.j8unit.repository.java.lang.CloneableClassTests", "org.j8unit.repository.java.io.SerializableClassTests",
                       "org.j8unit.repository.java.lang.ObjectClassTests"));
        once(missassumed, failDesc("subjectUnderTestMustBeNotNull", "javax.swing.AbstractAction#..."));
        once(missassumed, failDesc("exploreJ8UnitTestInterfaces", "ℝ", "javax.swing.AbstractAction#..."), failMsg(UNDISCOVERABLE),
             notFounds("org.j8unit.repository.javax.swing.AbstractActionTests", "org.j8unit.repository.javax.swing.ActionTests",
                       "org.j8unit.repository.java.awt.event.ActionListenerTests", "org.j8unit.repository.java.util.EventListenerTests",
                       "org.j8unit.repository.java.lang.CloneableTests", "org.j8unit.repository.java.io.SerializableTests",
                       "org.j8unit.repository.java.lang.ObjectTests"));

        verify(spy, times(0)).fireTestFailure(this.failedTests.capture());
    }

}
