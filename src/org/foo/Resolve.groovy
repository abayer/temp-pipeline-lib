package org.foo

@GrabResolver(name='jenkins-internal',root="https://repo.jenkins-ci.org/releases/")
@Grab(group="org.jenkinsci.plugins", module="pipeline-model-api", version="1.1.1")
public class Resolve implements Serializable {
  public String aThing() {
    return "right there, a thing"
  }
}
