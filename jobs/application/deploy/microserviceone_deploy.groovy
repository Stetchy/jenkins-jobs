pipelineJob('microserviceone.deploy') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Stetchy/qlite-api.git')
                    }
                    branch("refs/head/master")
                }
            }
            scriptPath('blah')
        }
    }
}