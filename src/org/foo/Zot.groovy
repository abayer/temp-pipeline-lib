package org.foo;

import org.jenkinsci.plugins.docker.workflow.Docker
import groovy.transform.Field

@Field Docker docker = new Docker(null)

def echo(msg) {
  echo "-> ${msg}"
}
