import common.EnvsToBuild

@org.jenkinsci.plugins.workflow.libs.Library('argh@envthing')
EnvsToBuild envsToBuild = new EnvsToBuild(true, false)
println envsToBuild