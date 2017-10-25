# J8Unit :: Parent-POM

This project specifies the J8Unit’s parent-POM, utilised by the various J8Unit projects’ build processes.

Note, this POM file exists in parallel to another main POM -- the aggregation-POM. Both are described more detailed in
the following sections. 

## Table Of Contents

1. [Maven Based Project Management](#maven-based-project-management)
    1. [J8Unit’s Aggregation-POM](#j8units-aggregation-pom)
    2. [J8Unit’s Parent-POM](#j8units-parent-pom)

## Maven Based Project Management

J8Unit is build with [Maven](https://maven.apache.org/index.html).
Based on the concept of a [project object model (POM)](https://maven.apache.org/pom.html), Maven manages the project’s
[build, reporting and documentation](https://maven.apache.org/ref/3-LATEST/maven-core/lifecycles.html) by executing
[according plug-in(s)](https://maven.apache.org/plugins/index.html).

If you want to know more about Maven, just start reading some of the numerous tutorials.
For example, the Maven project’s website offers [an in-depth documentation](https://maven.apache.org/guides/index.html)
of Maven, its build life-cycle, its features, available plug-ins (both core and others), and the POM.
Further, Sonatype -- host of the [largest repository of Java artifacts](http://search.maven.org/) -- maintains two books
focused on Maven:
[an example-driven introduction to Maven](http://www.sonatype.com/books/mvnex-book/reference/public-book.html) and
[a complete reference book](http://books.sonatype.com/mvnref-book/reference/).

One of the points to emphasise is the differentiation between
[inheritance](https://maven.apache.org/pom.html#Inheritance) and
[aggregation](https://maven.apache.org/pom.html#Aggregation_or_Multi-Module).
A single POM [can be (and often is)](https://maven.apache.org/pom.html#A_final_note_on_Inheritance_v._Aggregation) both
a super-POM and an aggregation-POM.
In the current case, J8Unit *does* make a difference between inheritance and aggregation;
Thus, there is a separate [multi-module-POM](../pom.xml) and [parent-POM](pom.xml).
Even further, the parent-POM first and foremost
[manages the plug-ins](https://maven.apache.org/pom.html#Plugin_Management) whereas the
[dependency management](https://maven.apache.org/pom.html#Dependency_Management) is done within each module’s POM file
separately.

### J8Unit’s Aggregation-POM

Located within the [root folder](../), J8Unit utilises an [aggregation-POM](../pom.xml) to manage the different J8Unit
projects (a.k.a. Maven modules).
That specific POM file *shall not* be installed nor deployed.
Instead, it lists all modules [enabling dependent builds](https://maven.apache.org/guides/mini/guide-multiple-modules.html).
In result, Maven executions must specify the project(s) to be build. 
According to the [command-line interface of Maven](http://maven.apache.org/ref/3-LATEST/maven-embedder/cli.html), an
example call is:

```bash
mvn --projects parent-pom --also-make-dependents clean verify
```

*Note: To prevent an accidental installation/deployment, the aggregation-POM resists its own installation by failing intentionally.*

### J8Unit’s Parent-POM

The other main POM file of the J8Unit project is the [parent-POM](pom.xml).
This POM is explicitly made for inheritance and, mainly, it is managing all the build plug-ins.
In detail, these plug-ins are:
 + any plug-in defaultly bound by
   [Maven’s clean lifecycle](https://maven.apache.org/ref/3-LATEST/maven-core/lifecycles.html#clean_Lifecycle),
 + any plug-in defaultly bound by
   [Maven’s “pom” packaging](https://maven.apache.org/ref/3-LATEST/maven-core/default-bindings.html#Plugin_bindings_for_pom_packaging),
 + any plug-in defaultly bound by
   [Maven’s “jar” packaging](https://maven.apache.org/ref/3-LATEST/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging),
 + any plug-in defaultly bound by
   [Maven’s “site” lifecycle](https://maven.apache.org/ref/3-LATEST/maven-core/lifecycles.html#site_Lifecycle),
 + further plug-ins required for maven-central/sonatype distributions (e.g.
   [maven-source-plugin](https://maven.apache.org/plugins/maven-source-plugin/),
   [maven-javadoc-plugin](https://maven.apache.org/plugins/maven-javadoc-plugin/),
   [maven-gpg-plugin](https://maven.apache.org/plugins/maven-gpg-plugin/)),
 + further plug-ins to improve code quality.

Note, this POM implicitly inherits from the
[super-POM](https://maven.apache.org/ref/3-LATEST/maven-model-builder/super-pom.html) that comes along with your locally
installed Maven.
Currently, J8Unit does not depend on a [specific Maven version](https://maven.apache.org/docs/history.html), however it
[enforces](https://maven.apache.org/enforcer/enforcer-rules/requireMavenVersion.html) version 3.3.9 at least.
Nevertheless, the super-POM is not part of the J8Unit project nor its releases and it is up to your Maven installation
which super-POM will be used during build process.
