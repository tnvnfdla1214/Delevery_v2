package com.example.delevery_v2.ui.view.home

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.example.delevery_v2.R
import com.example.delevery_v2.ui.base.BindingFragment
import com.example.delevery_v2.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.google.firebase.auth.FirebaseAuth
import org.koin.android.viewmodel.ext.android.viewModel
import org.mascota.data.remote.model.response.home.ResHomePart1
import org.mascota.data.remote.model.response.home.ResHomePart2

class HomeFragment : BindingFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override fun initView() {
    }



    companion object {
        const val IS_HOME = true
        const val PART_1 = 1
        const val PART_2 = 2
    }
}
