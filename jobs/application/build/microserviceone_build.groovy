multibranchPipelineJob('microserviceone.build.pipeline') {
    branchSources {
            github {
                remote('https://github.com/Stetchy/qlite-api.git')
            }
    }
}