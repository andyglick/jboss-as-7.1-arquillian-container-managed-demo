package org.arquillian.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

import javax.inject.Inject;

// @Excluded in pom.xml
@RunWith(Arquillian.class)
public class MixedRunModeTest {

  private static final transient Logger log
    = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
      .addClass(MyBean.class)
      .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @Inject
  MyBean bean;

  @Test
  public void should_run_in_container() {
    log.warn("executed from the server JVM");
    Assert.assertNotNull(bean);
  }

  @Test
  @RunAsClient
  public void should_run_as_client() {
    log.warn("executed from the client JVM");
  }
}
