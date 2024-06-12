pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/EvilSeeQu-sys/Backend")
                    }
                    branches('main')
                    scriptPath('JenkinsPipe')
                }
            }
        }
    }
}


