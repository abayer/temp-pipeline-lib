class buildConfig { 
    def otherProps = []
    def paramList = []
    
    def addBuildConfiguration(buildConfiguration) {
        otherProps.addAll(buildConfiguration)
    }
    
    def addBuildParameters(buildParameters) {
        paramList.addAll(steps.defaultParams())
        paramList.addAll(buildParameters)
    }
    
    def setBuildConfig() {
        def propList = []
        propList.addAll(otherProps)
        propList.add(steps.parameters(paramList))
        properties(propList)
    }
}