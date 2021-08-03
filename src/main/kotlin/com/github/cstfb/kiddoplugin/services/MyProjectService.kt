package com.github.cstfb.kiddoplugin.services

import com.github.cstfb.kiddoplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
