package org.arquillian.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.lang.invoke.MethodHandles;

/**
 * @author glick
 */
@SuppressWarnings("CdiInjectionPointsInspection")
@RunWith(Arquillian.class)
public class GreeterTest {

  private static final transient Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
      .addClasses(Greeter.class, PhraseBuilder.class)
        .addPackages(true, "org.slf4j")
        .addPackages(true, "ch.qos.logback")
      .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @Inject
  Greeter greeter;

  @Test
  public void should_create_greeting() {
    String greeting = greeter.createGreeting("Earthling");
    Assert.assertEquals("Hello, Earthling!", greeting);
    greeter.greet(System.out, greeting);
    greeter.greet(log,greeting);
  }
}
