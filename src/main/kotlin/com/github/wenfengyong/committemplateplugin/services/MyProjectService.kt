package com.github.wenfengyong.committemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.wenfengyong.committemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
