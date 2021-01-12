package com.github.ooftf.androidmvvmgenerator.real.action

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBLabel
import com.intellij.uiDesigner.core.AbstractLayout
import com.intellij.util.ui.GridBag
import com.intellij.util.ui.JBUI
import com.intellij.util.ui.UIUtil
import java.awt.Dimension
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.Insets
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JTextField

class MyCustomDialog(val project: Project) : DialogWrapper(true) {
    private val moduleName: JTextField = JTextField()
    private val prefix: JTextField = JTextField()
    val centerPanel: JPanel = JPanel(GridBagLayout())
    override fun createCenterPanel(): JComponent? {
        val gridbag = GridBag()
                .setDefaultWeightX(1.0)
                .setDefaultFill(GridBagConstraints.HORIZONTAL)
                .setDefaultInsets(Insets(0, 0, AbstractLayout.DEFAULT_VGAP, AbstractLayout.DEFAULT_HGAP))
        centerPanel.preferredSize = Dimension(400, 50)
        centerPanel.add(getLabel("模块名称（必   填）: "), gridbag.nextLine().next().weightx(0.2))
        centerPanel.add(moduleName, gridbag.next().weightx(0.8))
        centerPanel.add(getLabel("前缀名称（非必填）: "), gridbag.nextLine().next().weightx(0.2))
        centerPanel.add(prefix, gridbag.next().weightx(0.8))
        return centerPanel
    }

    init {
        init()
        title = "请输入相关名称"
    }

    private fun getLabel(text: String): JComponent {
        val label = JBLabel(text)
        label.componentStyle = UIUtil.ComponentStyle.SMALL
        label.fontColor = UIUtil.FontColor.BRIGHTER
        label.border = JBUI.Borders.empty(0, 5, 2, 0)
        return label
    }

    override fun doOKAction() {
        //createAndShowNotification(project, moduleName.text, prefix.text)
        super.doOKAction()
    }

    fun getValue(): Pair<String, String> {
        return Pair(moduleName.text, prefix.text)
    }

    companion object {
        @JvmStatic
        fun createAndShowErrorNotification(project: Project, firstName: String) {
            val notification = NotificationGroup("MVVM_ERROR", NotificationDisplayType.BALLOON, true)
            notification.createNotification(
                    "MVVM!",
                    firstName,
                    NotificationType.ERROR,
                    null
            ).notify(project)
        }

        @JvmStatic
        fun createAndShowNotification(project: Project, firstName: String) {
            val notification = NotificationGroup("MVVM_INFO", NotificationDisplayType.BALLOON, true)
            notification.createNotification(
                    "MVVM!",
                    firstName,
                    NotificationType.INFORMATION,
                    null
            ).notify(project)
        }
    }
}
