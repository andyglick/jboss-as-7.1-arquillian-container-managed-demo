package org.arquillian.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

import javax.inject.Inject;

// @Excluded in pom.xml
@RunWith(Arquillian.class)
public class BasicInContainerTest {
  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
      .addClass(MyBean.class)
      .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @Inject
  MyBean bean;

  @Test
  public void should_inject_bean_instance() {
    Assert.assertNotNull(bean);
  }
}
