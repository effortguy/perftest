package com.effortguy.perftest.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.effortguy.perftest.archunit.classdependency")
public class ClassDependency {

    @ArchTest
    ArchRule archRule = classes().that().haveNameMatching(".*Repository")
            .should().onlyHaveDependentClassesThat().haveNameMatching(".*Service");

    @ArchTest
    ArchRule archRule2 = classes().that().haveSimpleNameEndingWith("Controller")
            .should().resideInAPackage("com.effortguy.perftest.archunit.classdependency.controller");
}
