package com.effortguy.perftest.archunit;

import com.effortguy.perftest.archunit.annotation.EntityManager;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.transaction.annotation.Transactional;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.effortguy.perftest.archunit.annotation")
public class Annotation {
    @ArchTest
    ArchRule archRule = classes().that().areAssignableTo(EntityManager.class)
            .should().onlyHaveDependentClassesThat().areAnnotatedWith(Transactional.class);
}
