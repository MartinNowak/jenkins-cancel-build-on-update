def call() {
    def prevBuild = currentBuild.previousBuild
    if (prevBuild)
        prevBuild.rawBuild._this().doTerm();
}
