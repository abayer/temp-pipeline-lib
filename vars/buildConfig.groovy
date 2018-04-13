def otherProps = []
def paramList = []

def addBuildConfiguration(buildConfiguration) {
    this.otherProps.addAll(buildConfiguration)
}

def addBuildParameters(buildParameters) {
    this.paramList.addAll(defaultParams())
    this.paramList.addAll(buildParameters)
}

def setBuildConfig() {
    def propList = []
    propList.addAll(this.otherProps)
    propList.add(parameters(this.paramList))
    properties(propList)
}
