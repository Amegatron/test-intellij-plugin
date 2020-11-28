package com.github.amegatron.testintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.amegatron.testintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
