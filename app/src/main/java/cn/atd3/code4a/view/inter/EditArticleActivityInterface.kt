package cn.atd3.code4a.view.inter

import android.content.Context

/**
 * Created by harry on 2018/1/17.
 */
interface EditArticleActivityInterface {

    fun dismissArticleInfoDialog()

    fun showToast(infotype: Int, info: String)

    fun getXmlString(resourceId: Int): String

    fun progressOfUpload(info:String)


}