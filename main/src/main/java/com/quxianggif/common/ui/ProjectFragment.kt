package com.quxianggif.common.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.quxianggif.R

/**
 * author jingting
 * date : 2020/11/25下午3:33
 */
class ProjectFragment : BaseFragment() {

    companion object {
        fun newInstance(): ProjectFragment{
            return ProjectFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater.inflate(R.layout.fragment_project_view, container, false));
    }
}