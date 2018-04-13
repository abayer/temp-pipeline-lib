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
