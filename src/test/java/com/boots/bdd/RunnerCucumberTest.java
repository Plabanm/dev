package com.boots.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource",plugin = "json:target/boots.json",tags = "@rk")
public class RunnerCucumberTest {

}