package org.foo

@GrabResolver(name='jenkins-internal',root="https://repo.jenkins-ci.org/releases/")
@Grab(group="org.jenkins-ci.plugins", module="housekeeper", version="1.1")

public class Resolve implements Serializable {
  public String aThing() {
    return this.class.classLoader.loadClass('org.jenkinsci.plugins.Housekeeper').name
  }
}
