package com.eco4ndly.event_demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eco4ndly.event_demo.event.Event

/**
 * A Sayan Porya code on 04/05/20
 */
class MainViewModel : ViewModel() {
    private val _toastEvent = MutableLiveData<Event<String>>()
    val toastEvent: LiveData<Event<String>>
        get() = _toastEvent

    private val _navigateEvent = MutableLiveData<Event<Unit>>()
    val navigateEvent: LiveData<Event<Unit>>
        get() = _navigateEvent


    fun initiateToast() {
        _toastEvent.value = Event("Toast at ${System.currentTimeMillis()}")
    }

    fun initiateNavigate() {
        _navigateEvent.value = Event(Unit)
    }
}