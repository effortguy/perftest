package com.effortguy.perftest.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "com.effortguy")
public class PackageDependency {

    @ArchTest
    ArchRule archRule1 = noClasses().that().resideInAPackage("..source..")
            .should().dependOnClassesThat().resideInAPackage("..foo..");

    @ArchTest
    ArchRule archRule2 = classes().that().resideInAPackage("..target..")
            .should().onlyHaveDependentClassesThat().resideInAPackage("..source..");
}
