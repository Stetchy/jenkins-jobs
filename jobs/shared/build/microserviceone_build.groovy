multibranchPipelineJob('microserviceone.build.pipeline') {
    branchSources {
        branchSource {
            github {
                remote('https://github.com/Stetchy/qlite-api.git')
            }
        }
        strate
    }
}