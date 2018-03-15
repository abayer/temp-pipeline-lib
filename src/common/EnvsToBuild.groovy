package common

class EnvsToBuild extends ArrayList<Env> {
    EnvsToBuild(boolean buildDev, boolean buildQa) {
        if (buildDev) {
            this.add(Env.DEV)
        }
        if (buildQa) {
            this.add(Env.QA)
        }
    }
}
