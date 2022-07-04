package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun=false,
				features="src/test/resources",
				glue="com.step",
				monochrome=true,
				plugin= {"pretty"},
				snippets=SnippetType.CAMELCASE)
public class RunnerClass {
	
}
