//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.configure

import com.intellij.uiDesigner.core.GridConstraints
import com.intellij.uiDesigner.core.GridLayoutManager
import java.awt.Color

import java.awt.Dimension
import java.awt.Font
import java.awt.Insets
import javax.swing.*
import javax.swing.border.Border


class MVVMForm {
    lateinit var activityTemplate: JTextArea
    lateinit var fragmentTemplate: JTextArea
    lateinit var viewModelTemplate: JTextArea
    lateinit var layoutActivityTemplate: JTextArea
    lateinit var layoutFragmentTemplate: JTextArea
    lateinit var mainPanel: JPanel

    init {
        `$$$setupUI$$$`()
    }

    private /* synthetic */
    fun `$$$setupUI$$$`() {
        val jPanel = JPanel()
        mainPanel = jPanel
        jPanel.layout = GridLayoutManager(2, 5, Insets(0, 0, 0, 0), -1, -1, false, false)

        val jPanel2 = JPanel()
        jPanel2.layout = GridLayoutManager(1, 1, Insets(0, 0, 0, 0), -1, -1, false, false)
        jPanel.add(jPanel2, GridConstraints(0, 0, 1, 4, 0, 3, 3, 3, null as Dimension?, null as Dimension?, null as Dimension?))
        val jLabel = JLabel()
        jLabel.setText("MVVM 模版信息")
        jPanel2.add(jLabel, GridConstraints(0, 0, 1, 1, 0, 0, 0, 0, null as Dimension?, null as Dimension?, null as Dimension?))

        val jPanel3 = JPanel()
        jPanel3.layout = GridLayoutManager(1, 1, Insets(0, 0, 0, 0), -1, -1, false, false)
        jPanel.add(jPanel3, GridConstraints(1, 0, 1, 1, 0, 3, 3, 3, null as Dimension?, null as Dimension?, null as Dimension?))
        jPanel3.border = BorderFactory.createTitledBorder(null as Border?, "Activity模版", 0, 0, null as Font?, null as Color?)
        val jTextArea = JTextArea()
        activityTemplate = jTextArea
        jPanel3.add(jTextArea, GridConstraints(0, 0, 1, 1, 0, 3, 6, 6, null as Dimension?, Dimension(150, 50), null as Dimension?))

        val jPanel6 = JPanel()
        jPanel6.layout = GridLayoutManager(1, 1, Insets(0, 0, 0, 0), -1, -1, false, false)
        jPanel.add(jPanel6, GridConstraints(1, 1, 1, 1, 0, 3, 3, 3, null as Dimension?, null as Dimension?, null as Dimension?))
        jPanel6.border = BorderFactory.createTitledBorder(null as Border?, "Fragment模板", 0, 0, null as Font?, null as Color?)
        val jTextArea4 = JTextArea()
        fragmentTemplate = jTextArea4
        jPanel6.add(jTextArea4, GridConstraints(0, 0, 1, 1, 0, 3, 6, 6, null as Dimension?, Dimension(150, 50), null as Dimension?))


        val jPanel4 = JPanel()
        jPanel4.layout = GridLayoutManager(1, 1, Insets(0, 0, 0, 0), -1, -1, false, false)
        jPanel.add(jPanel4, GridConstraints(1, 2, 1, 1, 0, 3, 3, 3, null as Dimension?, null as Dimension?, null as Dimension?))
        jPanel4.border = BorderFactory.createTitledBorder(null as Border?, "ViewModel模板", 0, 0, null as Font?, null as Color?)
        val jTextArea2 = JTextArea()
        viewModelTemplate = jTextArea2
        jPanel4.add(jTextArea2, GridConstraints(0, 0, 1, 1, 0, 3, 6, 6, null as Dimension?, Dimension(150, 50), null as Dimension?))


        val jPanel5 = JPanel()
        jPanel5.layout = GridLayoutManager(1, 1, Insets(0, 0, 0, 0), -1, -1, false, false)
        jPanel.add(jPanel5, GridConstraints(1, 3, 1, 1, 0, 3, 3, 3, null as Dimension?, null as Dimension?, null as Dimension?))
        jPanel5.border = BorderFactory.createTitledBorder(null as Border?, "ActivityLayout模板", 0, 0, null as Font?, null as Color?)
        val jTextArea3 = JTextArea()
        layoutActivityTemplate = jTextArea3
        jPanel5.add(jTextArea3, GridConstraints(0, 0, 1, 1, 0, 3, 6, 6, null as Dimension?, Dimension(150, 50), null as Dimension?))


        val jPanel10 = JPanel()
        jPanel10.layout = GridLayoutManager(1, 1, Insets(0, 0, 0, 0), -1, -1, false, false)
        jPanel.add(jPanel10, GridConstraints(1, 4, 1, 1, 0, 3, 3, 3, null as Dimension?, null as Dimension?, null as Dimension?))
        jPanel10.border = BorderFactory.createTitledBorder(null as Border?, "FragmentLayout模板", 0, 0, null as Font?, null as Color?)
        val jTextArea10 = JTextArea()
        layoutFragmentTemplate = jTextArea10
        jPanel10.add(jTextArea10, GridConstraints(0, 0, 1, 1, 0, 3, 6, 6, null as Dimension?, Dimension(150, 50), null as Dimension?))
    }

    /* synthetic */   fun getRootComponent(): JComponent {
        return mainPanel
    }


}