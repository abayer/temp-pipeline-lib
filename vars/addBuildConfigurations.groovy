def call(BuildConfig buildConfig, buildConfiguration) {
    buildConfig.configList.addAll(buildConfiguration)
    echo "config: configlist: ${buildConfig.configList}"
    echo "config: paramslist: ${buildConfig.paramList}"
}