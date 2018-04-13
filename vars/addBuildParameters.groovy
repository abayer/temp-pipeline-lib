def call(BuildConfig buildConfig, buildParameters) {
    buildConfig.paramList.addAll(buildParameters)
    echo "params: configlist: ${buildConfig.configList}"
    echo "params: paramslist: ${buildConfig.paramList}"
}