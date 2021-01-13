//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.configure

import com.github.ooftf.androidmvvmgenerator.real.template.MVVMTemple
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State

import com.intellij.openapi.components.Storage

import org.jdom.Element

@State(name = "MVVMTemplateSetting", storages = [Storage("ooftf_mvvm_994749769_config_release_001.xml")])
class MVVMTemplateSettings : PersistentStateComponent<Element> {
    var activityTemplate: String = MVVMTemple.ACTIVITY
    var fragmentTemplate: String = MVVMTemple.FRAGMENT
    var viewModelTemplate: String = MVVMTemple.VIEW_MODEL
    var layoutActivityTemplate: String = MVVMTemple.LAYOUT_ACTIVITY
    var layoutFragmentTemplate: String = MVVMTemple.LAYOUT_FRAGMENT
    override fun loadState(element: Element) {
        activityTemplate = element.getAttributeValue("activityTemplate")
        fragmentTemplate = element.getAttributeValue("fragmentTemplate")
        viewModelTemplate = element.getAttributeValue("viewModelTemplate")
        layoutActivityTemplate = element.getAttributeValue("layoutActivityTemplate")
        layoutFragmentTemplate = element.getAttributeValue("layoutFragmentTemplate")

    }

    companion object {
        val instance: MVVMTemplateSettings = ServiceManager.getService(MVVMTemplateSettings::class.java)
    }

    override fun getState(): Element {
        val element = Element("MvvmTemplateSettings")
        element.setAttribute("activityTemplate", activityTemplate)
        element.setAttribute("fragmentTemplate", fragmentTemplate)
        element.setAttribute("viewModelTemplate", viewModelTemplate)
        element.setAttribute("layoutActivityTemplate", layoutActivityTemplate)
        element.setAttribute("layoutFragmentTemplate", layoutFragmentTemplate)
        return element
    }

}