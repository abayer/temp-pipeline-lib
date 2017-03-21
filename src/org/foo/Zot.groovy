package org.foo;

import org.jenkinsci.plugins.docker.workflow.Docker

@Field Docker docker = new Docker(null)

def echo(msg) {
  echo "-> ${msg}"
}
