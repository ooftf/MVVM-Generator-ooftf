//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.action

import com.github.ooftf.androidmvvmgenerator.real.configure.MVVMTemplateSettings
import java.io.IOException

class MVVMFragmentAction : MVVMGeneratorAction() {
    @Throws(IOException::class)
    protected override fun create(pathString: String?, targetName: String?) {
        val packageName: String = this.getPackageName(pathString!!)
        val setting: MVVMTemplateSettings = MVVMTemplateSettings.instance
        this.createFragment(setting, pathString!!, packageName, targetName!!)
        this.createViewModel(setting, pathString!!, packageName, targetName!!)
        this.createFragemtnLayout(
            setting,
            this.getLayoutPath(pathString),
            packageName,
                targetName
        )
    }
}