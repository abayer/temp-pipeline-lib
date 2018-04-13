class buildConfig { 
    def otherProps = []
    def paramList = []
    
    def addBuildConfigurations(buildConfiguration) {
        otherProps.addAll(buildConfiguration)
    }
    
    def addBuildParameters(buildParameters) {
        def defaultParams = [
            [$class: 'StringParameterDefinition', defaultValue: 'stable', description: 'Tag for ansible-executor image', name: 'ANSIBLE_EXECUTOR_TAG'],
            [$class: 'StringParameterDefinition', defaultValue: 'stable', description: 'Tag for linchpin-executor image', name: 'LINCHPIN_EXECUTOR_TAG'],
            [$class: 'StringParameterDefinition', defaultValue: '172.16.0.1:5000', description: 'Docker repo url for Openshift instance', name: 'DOCKER_REPO_URL'],
            [$class: 'StringParameterDefinition', defaultValue: 'babelfish', description: 'Project namespace for Openshift operations', name: 'OPENSHIFT_NAMESPACE'],
            [$class: 'StringParameterDefinition', defaultValue: 'pipeline', description: 'Service Account for Openshift operations', name: 'OPENSHIFT_SERVICE_ACCOUNT'],
        ]
        paramList.addAll(defaultParams)
        paramList.addAll(buildParameters)
    }
    
    def getJobProperties() {
        def propList = []
        propList.addAll(otherProps)
        propList.add([$class: 'ParametersDefinitionProperty', parameterDefinitions: paramList])
        return propList
    }
}