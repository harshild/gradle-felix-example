package com.harshild.felix.helloservlet;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import test.watevaer.test;

public class Activator implements BundleActivator {

  public void start(BundleContext ctx) {
    System.out.println(getClass().getName() + ": start");
    System.out.println(getClass().getName() + ": call http://localhost:8080 to start the servlet");
    System.out.println(getClass().getName() + ": call http://localhost:8080/system/console to start the felix web console");
    test.print();

  }

  public void stop(BundleContext ctx) {
    System.out.println(getClass().getName() + ": stop");
  }
}
