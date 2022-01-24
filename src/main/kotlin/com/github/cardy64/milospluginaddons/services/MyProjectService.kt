package com.github.cardy64.milospluginaddons.services

import com.intellij.openapi.project.Project
import com.github.cardy64.milospluginaddons.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
