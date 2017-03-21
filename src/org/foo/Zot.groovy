package org.foo;

import org.jenkinsci.plugins.docker.workflow.Docker
import groovy.transform.Field
import org.jenkinsci.plugins.workflow.cps.CpsScript

@Field Docker docker

public Zot(script) {
  this.docker = script.getProperty("docker")
}

def echo(msg) {
  echo "-> ${msg}"
}
