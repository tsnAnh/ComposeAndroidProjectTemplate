package dev.tsnanh.android.utils.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Job

abstract class BaseViewModel : ViewModel() {
    private val jobs = mutableListOf<Job>()

    infix fun deferCancel(job: Job) {
        jobs + job
    }

    infix fun deferCancel(jobs: List<Job>) {
        this.jobs + jobs
    }

    override fun onCleared() {
        super.onCleared()
        jobs.forEach(Job::cancel)
    }
}
