# Android Interview Code Samples And Questions
Basic plan and some typical questions and code samples for Android interview.

## Previous experience
* What is the project you worked on your previous job?
* What was your role in the project?
* Which part of the project you worked on?

## Common questions
* OOP: incapsulation, inheritance, polymorphism
* SOLID
* Design Patterns
* Gitflow

## Clean architecture
* MVC
* MVP
* MVI
* MVVM

## Java, Kotlin
* What is an interface?
* Inheritance in Java and Kotlin.
* When garbage collector can remove an object from memory?
* Difference between ArrayList and LinkedList. Which one takes less time to add an item in the middle? Which one takes less time to get n-th element?
* hashcode, equals
* Hashmap. What happens, if 2 elements have the same hashcode? What will Hashmap become, if all the elements will have the same hashcode?
* What is the difference between lists on Java and Kotlin?
* What are static methods in Java? What is the analog in Kotlin?
* How to create a singlton in Java and Kotlin?
* What are the advantages of Kotlin?
* Difference between val and const val?
* Does Kotlin allow working with functions as with variables?
* Extension functions in Kotlin.
* What is boxing, unboxing (Int, Double, ...)
* Can enums contain values? (Yes: enum class Action(val value: Int) { WALK(0), RUN(1), ... }
* What is "finally" block used for in try-catch?

## Android
* Basic components
* What is Intent used for? (to start activities, services and send broadcasts)
* What is the purpose of Fragments? Limitations (2-3 fragments per activity)
* What are the means of data transfer between activities? (Intents, Shared preferences, DB, file, Eventbus, Singleton class)
* How to transfer a class between activities? (it must be Serializable)
* How to return a result from the activity?
* Data persistence (shared preferences, db, file)
* What is the purpose of Services?
* Difference between Service and IntentService.
* How to save screen state on screen rotation (saveInstanceState, Moxy)? How to save state of an EditText? (provide an id)
* How to provide data to external apps? (ContentProviders)
* Permissions since Android 6.
* What is Data Binding?
* ViewModel, LiveData
* How to make some part of the code run only in debug? (if (BuildConfig.DEBUG) {...} else {...})

## Network
* What is JSON?
* How to set up a name of the serialized property different from the property name? (Use @SerializedName("name") annotation)
* How to exclude a property from the serialization? (mark property as transient (keyword in Java or annotation in Kotlin))
* Retrofit - what to do, if an app needs to interact with 2 different hosts? (create 2 different retrofit objects)
* How to append some parameter (for example "platform=android") to all network queries? (Use interceptors)

## Dagger
* Modules and Components
* Is it possible not to use Modules and how?

## Multithreading
* Which operations are prohibited to run on the main thread?
* Whin means of organizing multithreading do you know? (Java Thread, AsyncTask, Handler, RxJava, Job Manager, Kotlin coroutines)
* What is the disadvantage of AsyncTask?
* Handler, Looper, Handler Thread
* Kotlin coroutines

## RxJava
* Observable, Single, Completable, Flowable
* How to change threads? (observeOn, subscribeOn)
* What is the purpose of buffer?
* Difference between debounce and throttleFirst
* Map, Zip, Merge, Concat etc.

## Practical tasks
* Problems and improvements in the provided code samples.
* How to implement a layout shown on the screenshot.
* Algorithm coding task
* Android coding task