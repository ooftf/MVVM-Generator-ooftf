//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.IOException
import com.intellij.openapi.vfs.VirtualFile
import com.github.ooftf.androidmvvmgenerator.real.configure.MVVMTemplateSettings
import java.lang.IllegalArgumentException

open class MVVMGeneratorAction : AnAction() {
    lateinit var project: Project


    override fun actionPerformed(e: AnActionEvent) {
        project = e.getData(PlatformDataKeys.PROJECT) as Project
        val path = getCurrentPath(e)
        val moduleName = inputModuleName() ?: return
        if (path == null) {
            MyCustomDialog.createAndShowErrorNotification(project, "路径错误")
            return
        }
        if (moduleName.first.isBlank()) {
            return
        }
        try {
            create(path, moduleName.first, moduleName.second)
        } catch (var5: IOException) {
            var5.printStackTrace()
        }
        MyCustomDialog.createAndShowNotification(project, "文件已经生成完毕")
        refreshProject(e)
    }

    @Throws(IOException::class)
    protected open fun create(pathString: String, targetName: String, prefixName: String) {
    }

    @Throws(IOException::class)
    fun createActivity(
            setting: MVVMTemplateSettings,
            pathString: String,
            packageName: String,
            targetName: String, prefixName: String
    ) {
        val fileName: String =
                com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.plusString(
                         targetName, "Activity", ".kt"
                )
        var content: String = setting.activityTemplate
        content = content.replace("\\$\\{PACKAGE_NAME}".toRegex(), packageName)
        content = content.replace("\\$\\{TARGET_NAME}".toRegex(), targetName)
        content = content.replace("\\$\\{PREFIX_NAME}".toRegex(), prefixName)
        content = content.replace("\\$\\{prefix_name}".toRegex(), prefixName.toLowerCase())
        content = content.replace(
                "\\$\\{TARGET_NAME_LINE}".toRegex(),
                com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.humpToLine(targetName)
        )
        content = com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.format(content)
        createFile(pathString, fileName, content)
    }

    @Throws(IOException::class)
    fun createFragment(
            setting: MVVMTemplateSettings,
            pathString: String,
            packageName: String,
            targetName: String, prefixName: String
    ) {
        val fileName: String =
                com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.plusString(
                        targetName, "Fragment", ".kt"
                )
        var content: String = setting.fragmentTemplate!!
        content = content.replace("\\$\\{PACKAGE_NAME}".toRegex(), packageName)
        content = content.replace("\\$\\{TARGET_NAME}".toRegex(), targetName)
        content = content.replace("\\$\\{PREFIX_NAME}".toRegex(), prefixName)
        content = content.replace("\\$\\{prefix_name}".toRegex(), prefixName.toLowerCase())
        content = content.replace(
                "\\$\\{TARGET_NAME_LINE}".toRegex(),
                com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.humpToLine(targetName)
        )
        content = com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.format(content)
        createFile(pathString, fileName, content)
    }

    @Throws(IOException::class)
    fun createViewModel(
            setting: MVVMTemplateSettings,
            pathString: String,
            packageName: String,
            targetName: String, prefixName: String
    ) {
        val fileName: String =
                com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.plusString(
                        targetName, "ViewModel", ".kt"
                )
        var content: String =
                setting.viewModelTemplate!!.replace("\\$\\{PACKAGE_NAME}".toRegex(), packageName)
        content = content.replace("\\$\\{TARGET_NAME}".toRegex(), targetName)
        content = content.replace("\\$\\{PREFIX_NAME}".toRegex(), prefixName)
        content = content.replace("\\$\\{prefix_name}".toRegex(), prefixName.toLowerCase())
        content = com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.format(content)
        createFile(pathString, fileName, content)
    }

    @Throws(IOException::class)
    fun createActivityLayout(
            setting: MVVMTemplateSettings,
            pathString: String,
            packageName: String,
            targetName: String, prefixName: String
    ) {
        val pre = if (prefixName.isBlank()) {
            ""
        } else {
            prefixName.toLowerCase() + "_"
        }
        val fileName: String =
                com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.plusString(
                        pre, "activity", com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.humpToLine(
                        targetName
                ), ".xml"
                )
        var content: String =
                setting.layoutActivityTemplate.replace("\\$\\{PACKAGE_NAME}".toRegex(), packageName)
        content = content.replace("\\$\\{TARGET_NAME}".toRegex(), targetName)
        content = content.replace("\\$\\{PREFIX_NAME}".toRegex(), prefixName)
        content = content.replace("\\$\\{prefix_name}".toRegex(), prefixName.toLowerCase())
        content = com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.format(content)
        createFile(pathString, fileName, content)
    }

    @Throws(IOException::class)
    fun createFragemtnLayout(
            setting: MVVMTemplateSettings,
            pathString: String,
            packageName: String,
            targetName: String, prefixName: String
    ) {
        val pre = if (prefixName.isBlank()) {
            ""
        } else {
            prefixName.toLowerCase() + "_"
        }
        val fileName: String =
                com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.plusString(
                        pre, "fragment", com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.humpToLine(
                        targetName
                ), ".xml"
                )
        var content: String =
                setting.layoutFragmentTemplate.replace("\\$\\{PACKAGE_NAME}".toRegex(), packageName)
        content = content.replace("\\$\\{TARGET_NAME}".toRegex(), targetName)
        content = content.replace("\\$\\{PREFIX_NAME}".toRegex(), prefixName)
        content = content.replace("\\$\\{prefix_name}".toRegex(), prefixName.toLowerCase())
        content = com.github.ooftf.androidmvvmgenerator.real.utils.StringUtils.format(content)
        createFile(pathString, fileName, content)
    }

    @Throws(IOException::class)
    private fun createFile(pathString: String, fileName: String, content: String) {
        var path = File(pathString)
        if (path.isFile) {
            path = path.parentFile
        }
        val file = File(path, fileName)
        if (!path.exists()) {
            path.mkdirs()
        }
        if (file.exists()) {
            MyCustomDialog.createAndShowErrorNotification(project, "文件已经存在")
        } else {
            file.createNewFile()
            val writer = BufferedWriter(FileWriter(file))
            writer.write(content)
            writer.flush()
            writer.close()
        }
    }

    private fun refreshProject(e: AnActionEvent) {
        e.project!!.baseDir.refresh(false, true)
    }

    private fun inputModuleName(): Pair<String, String>? {
        val wrapper = MyCustomDialog(project)
        return if (wrapper.showAndGet()) {
            wrapper.getValue()
        } else {
            null
        }
    }

    private fun getCurrentPath(e: AnActionEvent): String? {
        val currentFile: VirtualFile =
                PlatformDataKeys.VIRTUAL_FILE.getData(e.getDataContext()) as VirtualFile
        return if (currentFile != null) currentFile.getPath() else null
    }

    protected fun getPackageName(path: String): String {
        val strings = path.split("/".toRegex()).toTypedArray()
        val packageName = StringBuilder()
        var packageBegin = false
        for (i in strings.indices) {
            val string = strings[i]
            if (string == "com" || string == "org" || string == "cn" || string == "pw") {
                packageBegin = true
            }
            if (packageBegin) {
                packageName.append(string)
                if (i != strings.size - 1) {
                    packageName.append(".")
                }
            }
        }
        return packageName.toString()
    }

    protected fun getLayoutPath(path: String): String {
        val index = path.indexOf("/java/")
        return path.substring(0, index) + "/res/layout/"
    }

    companion object {
        fun `$$$reportNull$$$0`(i: Int) {
            throw IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", *arrayOf<Any>("e", "action/MVVMGeneratorAction", "actionPerformed")))
        }
    }
}