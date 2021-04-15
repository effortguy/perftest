package com.effortguy.perftest.archunit;

import com.effortguy.perftest.archunit.inheritance.Connection;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.effortguy.perftest.archunit.inheritance")
public class Inheritance {
    @ArchTest
    ArchRule archRule = classes().that().implement(Connection.class)
            .should().haveSimpleNameEndingWith("Connection");
}
