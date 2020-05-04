# EVENT HANDLING IN MVVM

#### This is a very small sample project to demonstrate how to handle events when you use MVVM arch pattern

Note: Though SingleLiveEvent is a great class to use to handle events, I didn't choose to use it here because of its drawbacks.
SingleLiveEvent can't have multiple observers. And this is a huge problem when you are working on a real big project.
The method shown in this sample project solves the problem.
Thanks to [This Project](https://github.com/android/plaid)

```kotlin
    mainViewModel.toastEvent.observe(this, EventObserver {
      Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
    })

    mainViewModel.navigateEvent.observe(this, EventObserver {
      Intent(this, SecondActivity::class.java).apply {
        startActivity(this)
      }
    })
```