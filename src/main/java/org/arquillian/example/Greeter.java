package org.arquillian.example;

import org.slf4j.Logger;

import java.io.PrintStream;

import javax.inject.Inject;

/**
 * A component for creating personal greetings.
 *
 * @author glick
 */
public class Greeter {

  private PhraseBuilder phraseBuilder;

  @Inject
  public Greeter(PhraseBuilder phraseBuilder) {
    this.phraseBuilder = phraseBuilder;
  }

  public void greet(PrintStream to, String name) {
    to.println(createGreeting(name));
  }

  public void greet(Logger log, String name) {
    log.warn(name);
  }

  public String createGreeting(String name) {
    return phraseBuilder.buildPhrase("hello", name);
  }
}
