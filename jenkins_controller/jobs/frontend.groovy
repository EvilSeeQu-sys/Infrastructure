pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/EvilSeeQu-sys/Frontend")
                    }
                    branches('main')
                    scriptPath('JenkinsPipe')
                }
            }
        }
    }
}
