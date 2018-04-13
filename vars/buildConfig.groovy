class buildConfig {
  def otherProps = []
  def paramList = []
  
  def addBuildConfiguration(buildConfiguration) {
    otherProps.addAll(buildConfiguration)
  }
  
  def addBuildParameters(buildParameters) {
      paramList.addAll(defaultParams())
    paramList.addAll(buildParameters)
  }
  
  def setBuildConfig() {
    def propList = []
    propList.addAll(otherProps)
    propList.add(parameters(paramList))
    properties(propList)
  }
}

private defaultParams() {
    return [
        string(defaultValue: 'stable', description: 'Tag for ansible-executor image', name: 'ANSIBLE_EXECUTOR_TAG'),
        string(defaultValue: 'stable', description: 'Tag for linchpin-executor image', name: 'LINCHPIN_EXECUTOR_TAG'),
        string(defaultValue: '172.16.0.1:5000', description: 'Docker repo url for Openshift instance', name: 'DOCKER_REPO_URL'),
        string(defaultValue: 'babelfish', description: 'Project namespace for Openshift operations', name: 'OPENSHIFT_NAMESPACE'),
        string(defaultValue: 'pipeline', description: 'Service Account for Openshift operations', name: 'OPENSHIFT_SERVICE_ACCOUNT'),
    ]
}