import common.EnvsToBuild

@org.jenkinsci.plugins.workflow.libs.Library('jenkins-groovy-error-reproduction-library')
EnvsToBuild envsToBuild = new EnvsToBuild(true, false)
println envsToBuild