# Android Interview Questions and Code Samples
Basic plan and some typical questions and code samples for Android interview.

## Previous experience
* Tell us about yourself and your previous experience.
* What is the project you worked on your previous job?
* What was your role in the project?
* Which part of the project you worked on?
* Is there anything you are particularly proud of?
* How collaboration inside the team was organized? Who set tasks?

## OOP and SOLID
* OOP: abstraction, encapsulation, inheritance, polymorphism
* SOLID
* Design Patterns: creational, behavioral, structural
* What Design Patterns did you use in your projects?
* Clean code

## Git
* Gitflow
* Git merge vs rebase

## Java



## Kotlin



## Multithreading
* Which means of organizing multithreading do you know? (Java Thread, ExecutorService, Handler, AsyncTask, RxJava, Kotlin coroutines)
* ExecutorService

https://www.baeldung.com/java-executor-service-tutorial

*



## RxJava
* What design pattern does RxJava implement? (Observer Pattern)
* Difference between cold and hot observables.
* Single, Maybe, Completable
* Difference between scan() and reduce()
* Difference between merge() and concat()
* Difference between zip() and combineLatest()
* Difference between flatMap() and switchMap()
* What is PublishSubject?
* How to change threads? (subscribeOn, observeOn)
* Difference between Schedulers.io() and Schedulers.computation()
* What is the purpose of buffer()?
* Difference between throttleFirst() and debounce() (aka throttleWithTimeout())




## Kotlin coroutines
* Coroutine Scope, Coroutine Context - https://elizarov.medium.com/coroutine-context-and-scope-c8b255d59055





## Java, Kotlin
* What is an interface?
* Inheritance in Java and Kotlin.
* When garbage collector can remove an object from memory?
* Difference between ArrayList and LinkedList. Which one takes less time to add an item in the middle? Which one takes less time to get n-th element?
* hashcode, equals
* Hashmap. What happens, if 2 elements have the same hashcode? What will Hashmap become, if all the elements will have the same hashcode?
* What is the difference between lists in Java and Kotlin?
* What are static methods in Java? What is the analog in Kotlin?
* How to create a singleton in Java and Kotlin?
* What are the advantages of Kotlin?
* Difference between val and const val?
* Does Kotlin allow working with functions as with variables?
* Extension functions in Kotlin.
* What is boxing, unboxing (Int, Double, ...)
* Can enums contain values? (Yes: enum class Action(val value: Int) { WALK(0), RUN(1), ... }
* What is "finally" block used for in try-catch?
* Kotlin default and named arguments

## Android
### Basics
* Android components and what are they used for (Activity, Service, Content Provider, Broadcast Receiver)
* Project structure of an Android application (modules, manifest, source, res, assets, Gradle scripts)
* What is Context? Difference between Application Context and Activity Context.
* What is AndroidManifest.xml?

### Activity
* Single Activity vs Multiple Activity

https://stackoverflow.com/questions/44880822/multiple-activity-or-single-activity-and-multiple-fragments

https://oozou.com/blog/reasons-to-use-android-single-activity-architecture-with-navigation-component-36

* Activity lifecycle

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-i-single-activities-e49fd3d202ab

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-ii-multiple-activities-a411fd139f24

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-iii-fragments-afc87d4f37fd

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-iv-49946659b094





### Fragments
* How to add fragment to an activity? - Fragment Manager - https://developer.android.com/guide/fragments/fragmentmanager
* getSupportFragmentManager() vs getChildFragmentManager() - https://stackoverflow.com/questions/14740445/what-is-difference-between-getsupportfragmentmanager-and-getchildfragmentmanag/14775322
* How to create UI with BottomNavigationView where root fragments have child fragments and root fragments are not destroyed?
* Fragment Result API - https://developer.android.com/guide/fragments/communicate#fragment-result
* How to share data between fragments? - https://developer.android.com/guide/fragments/communicate
* Shared ViewModel - https://blog.mindorks.com/shared-viewmodel-in-android-shared-between-fragments






### Intents
* What is Intent used for? (to start activities, services and send broadcasts)
* Difference between implicit and explicit intents.
* How to open url in browser?

```
val uri = Uri.parse(websiteUrl)
val intent = Intent(Intent.ACTION_VIEW, uri)
```

* Pending intent
* How to make an activity start on some intent from other apps? (Add intent filter in the manifest)
* Can I access data in another application's content provider via intent? (No, use ContentResolver instead)

### Activity and Fragment
* Why do we need to setContentView() in onCreate(), not in onStart()? (Because onCreate() is triggered only once)
* When only onDestroy is called for an activity without onPause() and onStop()? (If finish() is called in the onCreate method of an activity, the system will call onDestroy() method directly.)
* How to save screen state on screen rotation (saveInstanceState, Moxy)? How to save state of an EditText? (provide an id)
* What are the means of data transfer between activities? (Intents, Shared preferences, DB, file, Eventbus, Singleton class)
* How to transfer a class between activities? (it must be Serializable)
* Difference between Serializable and Parcelable
* How to return a result from the activity?
* Activity launch modes
* What is the purpose of Fragments? Limitations (2-3 fragments per activity)
* How to pass data into Fragments? (Via arguments)
* What can go wrong when calling activity.startActivityForResult() inside fragment? (The result will be delivered to onActivityResult() of the activity, not the fragment)

### Layouts
* Difference between LinearLayout and ConstraintLayout

### Data persistence
* Data persistence (shared preferences, db, file)

### Services
* What is the purpose of Services?
* I am starting a network request from the Service. What problem can this cause? (Service runs on the main thread by default)
* Difference between Service and IntentService.
* How to prevent a Service from being destroyed by Android? (Use startForeground() with notification)
* When onStartCommand() gets triggered? (Every time when startService() is called, even if Service is already started)

### Multithreading in Android
* Which operations are prohibited to run on the main thread?
* What is the disadvantage of AsyncTask?
* Handler, Looper, Handler Thread

### Testing

### Other
* How to provide data to external apps? (ContentProviders)
* Permissions since Android 6.
* What is Data Binding?
* ViewModel, LiveData
* How to make some part of the code run only in debug? (if (BuildConfig.DEBUG) {...} else {...})
* Notifications since Android 8 (Notification channel required)
* Shared preferences persist after app has been uninstalled. How to prevent it? (Add android:allowBackup="false" in the application in the manifest)
* What is a broadcast receiver?
* RecyclerView: when onCreateViewHolder and onBindViewHolder are called?

## Gradle
* What to do, if external dependency is not found? (Add appropriate repository into: allprojects { repositories {...} })
* Difference between "implementation" and "compile" 
* What is multidex?
* How to build slightly different applications from one project? (Use flavors) 

## Network
* What is JSON?
* How to set up a name of the serialized property different from the property name? (Use @SerializedName("name") annotation)
* How to exclude a property from the serialization? (mark property as transient (keyword in Java or annotation in Kotlin))
* The app starts crashing on network call. What can be wrong? (Network call on the main thread, not added <uses-permission android:name="android.permission.INTERNET" /> in the manifest)
* Retrofit - what to do, if an app needs to interact with 2 different hosts? (create 2 different retrofit objects)
* How to append some parameter (for example "platform=android") to all network queries? (Use interceptors)
* How to load images? (Use Glide, Picasso or Fresco)

## Room
* What does @Entity annotation do?
* What is @PrimaryKey?
* How to select only different items from the db? (SELECT DISTINCT)
* The app starts crashing after new entity has been added. What I forgot to do? (Update database version, add migration)

## Dagger
* What is Dependency Injection?
* What is the purpose of @Inject annotation?
* Modules and Components
* Is it possible not to use Modules and how?



## Clean architecture
* What is Clean Architecture?
* MVP
* MVVM
* MVI

## Moxy
* How to organize application? (View, Presenter)
* Strategies

## Practice
* Problems and improvements in the provided code samples:

https://github.com/gpetuhov/AndroidInterview/blob/master/app/src/main/java/com/gpetuhov/androidinterviewcodesamples/Utils.kt

https://github.com/gpetuhov/AndroidInterview/blob/master/app/src/main/java/com/gpetuhov/androidinterviewcodesamples/Solid.kt

https://github.com/gpetuhov/AndroidInterview/blob/master/app/src/main/java/com/gpetuhov/androidinterviewcodesamples/MainActivity.kt

* How to implement a layout shown on the screenshot.

## Algorithms
Algorithm coding task:
* In text editor: https://code.yandex-team.ru/ or https://codeshare.io/

OR

* HackerRank (LeetCode)

## Android coding task
Task: download list of items from the server and display them on screen. How would you organize your code?

Example of Clean Architecture in Android: https://github.com/gpetuhov/AndroidFundamentals2021/tree/master/01-CleanArchitecture

## Reference
https://github.com/MindorksOpenSource/android-interview-questions