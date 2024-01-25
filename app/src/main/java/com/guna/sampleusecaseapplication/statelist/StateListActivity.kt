package com.guna.sampleusecaseapplication.statelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.guna.sampleusecaseapplication.R
import com.guna.sampleusecaseapplication.common.ViewModelFactory
import com.guna.sampleusecaseapplication.databinding.ActivityStateListBinding
import com.guna.sampleusecaseapplication.di.AppComponent
import com.guna.sampleusecaseapplication.di.DaggerAppComponent
import javax.inject.Inject

class StateListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStateListBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var stateListViewModel: StateListViewModel

    lateinit var stateListAdapter: StateListAdapter


    private val appComponent:AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_state_list)
        setSupportActionBar(binding.toolbar)
        stateListViewModel = ViewModelProvider(this, viewModelFactory)[StateListViewModel::class.java]
        init()
        initObserver()

    }

    private fun init() {
        with(binding) {
           stateListAdapter = StateListAdapter(stateListViewModel)
            lifecycleOwner = this@StateListActivity
            stateListRecyclerview.apply {
                layoutManager = LinearLayoutManager(this@StateListActivity)
                itemAnimator = null
                adapter = stateListAdapter
            }
        }
    }

    private fun initObserver() {
        stateListViewModel.viewState.observe(this) {
            this.CanShowIndicator(it.isLoading)
            it.sections.let {
                stateListAdapter.submitList(it)
            }
        }
    }


}