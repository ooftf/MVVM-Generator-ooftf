//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.template

object MVVMTemple {
    const val ACTIVITY_SUFFIX = "Activity"
    const val FRAGMENT_SUFFIX = "Fragment"
    const val VIEW_MODEL_SUFFIX = "ViewModel"
    const val ACTIVITY =
            "package \${PACKAGE_NAME}\n\n" +
                    "import android.os.Bundle\n" +
                    "import com.ooftf.arch.frame.mvvm.activity.BaseMvvmActivity\n\n" +
                    "/**\n" +
                    " * @date \${DATE}\n" +
                    " */\n" +
                    "class \${TARGET_NAME}Activity : BaseMvvmActivity<Activity\${TARGET_NAME}Binding, \${TARGET_NAME}ViewModel>() {\n\n" +
                    "}"
    const val FRAGMENT =
            "package \${PACKAGE_NAME}\n\n" +
                    "import com.ishow.noah.modules.base.mvvm.view.AppBindFragment\n\n" +
                    "/**\n" +
                    " * @date \${DATE}\n" +
                    " */\n" +
                    "class \${TARGET_NAME}Fragment : AppBindFragment<F\${TARGET_NAME}Binding, \${TARGET_NAME}ViewModel>() {" +
                    "\n\n" +
                    "    override fun getLayout(): Int = R.layout.f\${TARGET_NAME_LINE}\n" +
                    "}"
    const val VIEW_MODEL =
            "package \${PACKAGE_NAME}\n\n" +
                    "import android.app.Application\n" +
                    "import com.ooftf.arch.frame.mvvm.vm.BaseViewModel\n\n" +
                    "/**\n" +
                    " * @date \${DATE}\n" +
                    " */\n" +
                    "class \${TARGET_NAME}ViewModel (application: Application) : BaseViewModel(app) {\n\n" +
                    "}"

    const val LAYOUT_ACTIVITY =
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<layout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "tools:context=\"\${PACKAGE_NAME}.\${TARGET_NAME}Activity\">\n\n" +
                    "    <data>\n" +
                    "        <variable\n" +
                    "            name=\"viewModel\"\n" +
                    "            type=\"\${PACKAGE_NAME}.\${TARGET_NAME}ViewModel\" />\n" +
                    "    </data>\n\n" +
                    "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\">\n\n" +
                    "    </androidx.constraintlayout.widget.ConstraintLayout>\n" +
                    "</layout>"
    const val LAYOUT_FRAGMENT =
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<layout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "tools:context=\"\${PACKAGE_NAME}.\${TARGET_NAME}Fragment\">\n\n" +
                    "    <data>\n" +
                    "        <variable\n" +
                    "            name=\"viewModel\"\n" +
                    "            type=\"\${PACKAGE_NAME}.\${TARGET_NAME}ViewModel\" />\n" +
                    "    </data>\n\n" +
                    "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\">\n\n" +
                    "    </androidx.constraintlayout.widget.ConstraintLayout>\n" +
                    "</layout>"

}