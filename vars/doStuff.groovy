def call(body) {
    def config = ["hey": "there", "m": [:]]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def outerP = [:]
    config.m.each { k, v ->
        outerP[k] = { 
            stage(k) {
                echo "in outer ${k}";  
                def innerP = [:]
                v.each { i ->
                    innerP[i] = { node { echo "starting inner ${i} for ${k}"; sh "sleep 15"; echo "ending inner ${i} for ${k}" } }
                }
                parallel innerP
            }
        }
    }

    parallel outerP
}
