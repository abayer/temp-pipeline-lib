def call(BuildConfig buildConfig, buildParameters) {
    buildConfig.paramsList.addAll(buildParameters)
    echo "params: configlist: ${buildConfig.configList}"
    echo "params: paramslist: ${buildConfig.paramsList}"
}