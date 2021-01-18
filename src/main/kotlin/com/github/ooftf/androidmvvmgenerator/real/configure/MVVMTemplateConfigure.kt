//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.configure

import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SearchableConfigurable
import javax.swing.JComponent

class MVVMTemplateConfigure : SearchableConfigurable {
    private val settings: MVVMTemplateSettings = MVVMTemplateSettings.instance
    private var form: MVVMForm = MVVMForm()
    override fun reset() {
        form.activityTemplate.text = settings.activityTemplate
        form.fragmentTemplate.text = settings.fragmentTemplate
        form.viewModelTemplate.text = settings.viewModelTemplate
        form.layoutActivityTemplate.text = settings.layoutActivityTemplate
        form.layoutFragmentTemplate.text = settings.layoutFragmentTemplate
    }

    override fun getDisplayName(): String {
        return "MVVM Generator ooftf"
    }

    override fun getId(): String {
        return MVVMTemplateConfigure::class.java.name
    }

    override fun createComponent(): JComponent {
        return form.mainPanel
    }

    override fun isModified(): Boolean {
        return settings.activityTemplate != form.activityTemplate.text
                || settings.fragmentTemplate != form.fragmentTemplate.text
                || settings.viewModelTemplate != form.viewModelTemplate.text
                || settings.layoutActivityTemplate != form.layoutActivityTemplate.text
                || settings.layoutFragmentTemplate != form.layoutFragmentTemplate.text
    }


    @Throws(ConfigurationException::class)
    override fun apply() {
        settings.activityTemplate = form.activityTemplate.text
        settings.fragmentTemplate = form.fragmentTemplate.text
        settings.viewModelTemplate = form.viewModelTemplate.text
        settings.layoutActivityTemplate = form.layoutActivityTemplate.text
        settings.layoutFragmentTemplate = form.layoutFragmentTemplate.text
    }
}