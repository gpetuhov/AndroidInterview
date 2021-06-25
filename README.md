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
* Design Patterns: creational, behavioral, structural - https://habr.com/ru/post/210288/
* What Design Patterns did you use in your projects?
* RecyclerView Adapter является ли реализацией паттерна Адаптер? - нет - https://stackoverflow.com/questions/41626980/are-android-adapters-an-example-of-adapter-design-pattern
* Почему композиция лучше наследования? - https://stackoverflow.com/questions/49002/prefer-composition-over-inheritance
* Clean code



## Git
* Gitflow
* Git merge vs rebase



## Java
* Classloader, getClass
* Структура памяти в JVM - http://tutorials.jenkov.com/java-concurrency/java-memory-model.html
* Garbage collection - https://www.geeksforgeeks.org/garbage-collection-java/
* В какой момент Garbage Collector может собрать объект?
* Что является root для Garbage Collection?
* Для чего нужен Object? - Объявляет ряд базовых методов, в том числе для организации многопоточности, также нужен для того, чтобы garbage collector мог собрать объекты
* Методы Object - https://www.geeksforgeeks.org/object-class-in-java/
* Object.clone() можно ли вызвать? - Нет, если не имплеменить Cloneable интерфейс - https://en.wikipedia.org/wiki/Clone_(Java_method)
* Зачем нужны методы equals и hashcode
* Если переопределил equals, то надо ли переопределять hashcode? - надо
* Контракт между equals и hashcode - https://www.baeldung.com/java-equals-hashcode-contracts
* Types of references in Java (Strong, Weak, Soft, Phantom)

https://www.geeksforgeeks.org/types-references-java/

https://www.baeldung.com/java-weak-reference

https://www.baeldung.com/java-phantom-reference

https://www.baeldung.com/java-soft-references

https://javarush.ru/quests/lectures/questcollections.level04.lecture03

https://javarush.ru/quests/lectures/questcollections.level04.lecture05

https://javarush.ru/groups/posts/2291-osobennosti-phantomreference

https://stackoverflow.com/questions/299659/whats-the-difference-between-softreference-and-weakreference-in-java/299702#299702

* Асимптотическая сложность конкатенации строк - O(n^2) - https://overcoder.net/q/186163/%D1%81%D0%BB%D0%BE%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C-%D0%BA%D0%BE%D0%BD%D0%BA%D0%B0%D1%82%D0%B5%D0%BD%D0%B0%D1%86%D0%B8%D0%B8-%D1%81%D1%82%D1%80%D0%BE%D0%BA-%D0%B2-c-%D0%B8-java
* StringBuilder - чем он лучше простой конкатенации строк - https://stackoverflow.com/questions/1532461/stringbuilder-vs-string-concatenation-in-tostring-in-java === https://www.baeldung.com/java-strings-concatenation
* Квалификатор final
* Для чего полезна иммутабельность? - https://www.baeldung.com/java-immutable-object
* Java Reflection
* Отличие interface от abstract class - в интерфейсе все методы public, не может быть private
* Дерево коллекций

http://www.quizful.net/post/Java-Collections

https://habr.com/ru/post/162017/

* ArrayList vs LinkedList
* ArrayList под капотом - это динамический массив с изначальным размером 10
* SparseArray

https://developer.android.com/reference/android/util/SparseArray

https://stackoverflow.com/questions/25444226/difference-between-sparsearray-vs-arraylist#:~:text=2%20Answers&text=The%20purpose%20of%20a%20SparseArray,that%20will%20be%20quite%20wasteful.

* Java Throwable Hierarchy (Errors and Exceptions) - https://airbrake.io/blog/java-exception-handling/the-java-exception-class-hierarchy
* Можно ли в HashMap положить элемент с ключом null? - можно - https://stackoverflow.com/questions/25932730/hashmap-with-null-key-and-null-value#:~:text=HashMap%20puts%20null%20key%20in,linked%20list%20data%20structure%20internally.&text=In%20Entry%20class%20the%20K,value%20passed%20in%20put%20method.
* Левоассоциативность (И, ИЛИ) - https://ru.wikipedia.org/wiki/%D0%9E%D1%87%D0%B5%D1%80%D1%91%D0%B4%D0%BD%D0%BE%D1%81%D1%82%D1%8C_%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B9
* Аннотации - что это? - https://www.baeldung.com/java-custom-annotation
* RetentionPolicy в аннотациях - https://www.java2novice.com/java-annotations/retention-policy/#:~:text=Description%3A,point%20annotation%20should%20be%20discarded.&text=Annotation%20with%20retention%20policy%20RUNTIME,pass%20the%20retention%20policy%20type.
* Модификаторы доступа в Java - public, protected, private, package private (когда нет никакого ключевого слова) - https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html



## Multithreading
* Which means of organizing multithreading do you know? (Java Thread, ExecutorService, Handler, AsyncTask, RxJava, Kotlin coroutines)
* ExecutorService

https://www.baeldung.com/java-executor-service-tutorial

* Race condition - точное определение
* Deadlock - что это и как бороться?

https://www.baeldung.com/java-deadlock-livelock

https://www.baeldung.com/java-dining-philoshophers

* Как использовать tryLock, чтобы избежать deadlock? - https://www.baeldung.com/java-deadlock-livelock

* synchronized vs volatile

https://www.baeldung.com/java-synchronized

https://stackoverflow.com/questions/3519664/difference-between-volatile-and-synchronized-in-java

* Что такое атомарные операции? - https://ru.stackoverflow.com/questions/616278/%D0%90%D1%82%D0%BE%D0%BC%D0%B0%D1%80%D0%BD%D1%8B%D0%B5-%D0%B8-%D0%BD%D0%B5%D0%B0%D1%82%D0%BE%D0%BC%D0%B0%D1%80%D0%BD%D1%8B%D0%B5-%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B8-java

* AtomicInteger
* Что выдаст Future.get(), если Callable завершится аварийно - Будет ExecutionException
* Java concurrent list - CopyOnWriteArrayList - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CopyOnWriteArrayList.html
* Java ConcurrentHashMap - https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html
* ThreadLocal - https://www.baeldung.com/java-threadlocal
* Семафоры, мониторы - https://www.baeldung.com/cs/monitor
* CountDownLatch, Barrier

https://www.baeldung.com/java-countdown-latch 

https://www.baeldung.com/java-cyclic-barrier

* Object wait(), notify(), notifyAll()
* Почему потоки создаются долго (что при этом происходит)? - https://stackoverflow.com/questions/5483047/why-is-creating-a-thread-said-to-be-expensive
* Synchronized collections - https://www.baeldung.com/java-synchronized-collections
* Concurrent collections (появились в Java 5) - https://www.developer.com/design/an-introduction-to-concurrent-collection-apis-in-java/



## Generics
* Что такое Generics - https://habr.com/ru/company/sberbank/blog/416413/
* С какой версии Java появились дженерики? - Java 5
* Стирание типов - https://javarush.ru/groups/posts/2315-stiranie-tipov
* PECS - https://stackoverflow.com/questions/2723397/what-is-pecs-producer-extends-consumer-super
* Ковариантность (extends T), контрвариантность (super T), инвариантность (просто T)



## Kotlin
* lateinit vs lazy
* Delegates - как там реализована потокобезопасность?
* Nothing - https://gb.ru/posts/razbiraemsya-v-tipah-kotlin-unit-nothing-any-i-null
* inline functions
* Можно ли узнать тип дженерика в inline функции? - только если сделать reified parameters - https://stackoverflow.com/questions/33146160/how-to-check-generic-type-in-kotlin
* reified type parameters (речь только про функции, классы не могут иметь reified полей) - https://kotlinlang.org/docs/inline-functions.html#reified-type-parameters
* infix functions - https://kotlinlang.org/docs/functions.html#infix-notation
* Может ли infix функция содержать дефолтные параметры - нет
* Как сделаны под капотом extension functions - это static методы - https://moshenskyi.medium.com/kotlin-under-the-hood-extension-functions-1d61fabdf631
* Data classes - https://kotlinlang.org/docs/data-classes.html#properties-declared-in-the-class-body
* Можно ли наследоваться от data classes? - нет - https://discuss.kotlinlang.org/t/data-class-inheritance/4107
* Как в Kotlin сделать, чтобы property не участвовал в вычислении hashCode в data class? - Прописать параметр в теле класса, а не в конструкторе - https://kotlinlang.org/docs/data-classes.html#properties-declared-in-the-class-body
* Какие могут быть проблемы из-за интероперабельности Kotlin и Java? - могут быть проблемы из-за null safety при вызове Java кода из Kotlin - https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-null-types
* Kotlin !! operator - какой кидает exception: Java или Kotlin? - KotlinNullPointerException
* Что такое sealed classes?
* enum vs sealed classes - enum не позволяет создавать отдельные экземпляры, в отличие от sealed классов - https://blog.kotlin-academy.com/enum-vs-sealed-class-which-one-to-choose-dc92ce7a4df5
* Разница между == и === в Kotlin? - Первый сравнивает значение, второй ссылки (reference)



## RxJava

https://github.com/gpetuhov/RxJavaTutorial

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
* Что такое Subject?
* Типы Subject и их отличие - https://medium.com/@nazarivanchuk/types-of-subjects-in-rxjava-96f3a0c068e4
* Отличие Observable и Flowable
* Что такое backpressure
* Способы работы с backpressure - https://www.baeldung.com/rxjava-backpressure
* Стратегии Flowable для работы с backpressure
* Типы Observable - https://medium.com/mindorks/rxjava-types-of-observables-404d75605e35
* Что будет если много раз выполнить оператор subscribeOn() в цепочке? - Только первый оператор даст желаемый эффект. Остальные же эффекта не дадут, кроме траты ресурсов
* Что будет если много раз выполнить оператор observeOn() в цепочке? - Каждый observeOn() включает планировщик (поток), в котором будут выполняться все последующие операторы. Сложные потоки RxJava могут выиграть от нескольких операторов observeOn()



## Kotlin coroutines
* Coroutine Scope, Coroutine Context - https://elizarov.medium.com/coroutine-context-and-scope-c8b255d59055
* CoroutineExceptionHandler - https://kotlinlang.org/docs/exception-handling.html
* Отличие пулов потоков в RxJava и Coroutines - https://medium.com/capital-one-tech/coroutines-and-rxjava-an-asynchronicity-comparison-part-6-threading-2aa5e9c52c94
* launch vs async - https://stackoverflow.com/questions/46226518/what-is-the-difference-between-launch-join-and-async-await-in-kotlin-coroutines



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
### Low level details
* JVM vs Dalvik vs ART

https://habr.com/ru/post/513928/

https://medium.com/programming-lite/android-core-jvm-dvm-art-jit-aot-855039a9a8fa

* DEX format - https://stackoverflow.com/questions/36356330/difference-between-bytecode-in-class-file-and-that-of-dex-file

* What is a compiler?

https://habr.com/ru/company/mailru/blog/451894/

https://habr.com/ru/post/99162/

* Можно ли разрабатывать под Андроид на Python, Scala или других языках? - Можно, если есть возможность компиляции языка в Java байт-код

https://tproger.ru/translations/python-development-on-android/

https://habr.com/ru/post/327782/

* Как R8 может исходный код напрямую преобразовать в DEX?

* OOM Killer (Out of memory killer)



### Basics
* Android components and what are they used for (Activity, Service, Content Provider, Broadcast Receiver)
* Project structure of an Android application (modules, manifest, source, res, assets, Gradle scripts)
* What is AndroidManifest.xml?
* Context - https://developer.android.com/reference/android/content/Context
* Difference between Application Context and Activity Context.



### Activity
* Single Activity vs Multiple Activity

https://stackoverflow.com/questions/44880822/multiple-activity-or-single-activity-and-multiple-fragments

https://oozou.com/blog/reasons-to-use-android-single-activity-architecture-with-navigation-component-36

* Activity lifecycle

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-i-single-activities-e49fd3d202ab

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-ii-multiple-activities-a411fd139f24

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-iii-fragments-afc87d4f37fd

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-iv-49946659b094

* How to prevent activity from being destroyed on orientation change via manifest? - Use configChanges attribute - https://developer.android.com/guide/topics/manifest/activity-element#config
* Activity.onDestroy() - гарантируется ли вызов? - нет - https://developer.android.com/reference/android/app/Activity.html#onDestroy%28%29
* Что такое Window?
* Как получить Window - Activity.getWindow() - https://stackoverflow.com/questions/7378644/how-to-call-getwindow-outside-an-activity-in-android
* Window DecorView - https://stackoverflow.com/questions/23276847/what-is-an-android-decorview
* Activity launch modes
* Для чего запускать разные активити в разных тасках?

https://developer.android.com/guide/components/activities/tasks-and-back-stack 

https://medium.com/androiddevelopers/tasks-and-the-back-stack-dbb7c3b0f6d4 

https://habr.com/ru/company/otus/blog/493802/ 

https://iammert.medium.com/android-launchmode-visualized-8843fc833dbe

* Task Affinity

https://stackoverflow.com/questions/17872989/android-task-affinity-explanation 

https://medium.com/@veeresh.charantimath8/playing-with-android-task-affinity-and-launch-modes-5c36a0421e83



### Fragments
* How to add fragment to an activity? - Fragment Manager - https://developer.android.com/guide/fragments/fragmentmanager
* getSupportFragmentManager() vs getChildFragmentManager() - https://stackoverflow.com/questions/14740445/what-is-difference-between-getsupportfragmentmanager-and-getchildfragmentmanag/14775322
* How to create UI with BottomNavigationView where root fragments have child fragments and root fragments are not destroyed?
* FragmentManager commit, commitNow, commitAllowingStateLoss - в чем разница?

https://developer.android.com/reference/android/app/FragmentTransaction#commit()

https://stackoverflow.com/questions/38566628/how-is-the-new-fragmenttransaction-commitnow-working-internally

https://medium.com/@bherbst/the-many-flavors-of-commit-186608a015b1

* Есть ли у фрагмента метод onRestoreInstanceState - нет - https://stackoverflow.com/questions/5412746/android-fragment-onrestoreinstancestate
* How to share data between fragments? - https://developer.android.com/guide/fragments/communicate
* Fragment Result API - https://developer.android.com/guide/fragments/communicate#fragment-result
* Shared ViewModel - https://blog.mindorks.com/shared-viewmodel-in-android-shared-between-fragments
* Как передавать данные во фрагмент? - через аргументы
* Почему нельзя во фрагмент передавать параметры в конструкторе? - при пересоздании вызывается дефолтный конструктор без параметров - https://stackoverflow.com/questions/9245408/best-practice-for-instantiating-a-new-android-fragment
* Fragment.onDestroy() вызывается ли при вызове FragmentManager.remove() или replace()





### Intents
* What is Intent used for? (to start activities, services and send broadcasts)
* Как передать данные через интент? - Bundle
* Что можно положить в Bundle? - Основные типы, Serializable, Parcelable
* Ограничения на размер Bundle - 500 КБ (2 МБ по другим источникам) - https://stackoverflow.com/questions/8552514/is-there-any-limit-of-bundle-in-android
* Difference between implicit and explicit intents.
* How to open url in browser?

```
val uri = Uri.parse(websiteUrl)
val intent = Intent(Intent.ACTION_VIEW, uri)
```

* Pending intent
* How to make an activity start on some intent from other apps? (Add intent filter in the manifest)
* Can I access data in another application's content provider via intent? (No, use ContentResolver instead)
* Механизм резолюшна интент-фильтра (последовательность действий, что с чем сравнивается) - https://www.androidcookbook.info/application-development/how-android-resolves-intent-filters.html



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
* CoordinatorLayout
* RelativeLayout vs ConstraintLayout - производительность ConstraintLayout лучше
* ConstraintLayout Barriers and Guidelines - https://stackoverflow.com/questions/47114672/what-is-difference-between-barrier-and-guideline-in-constraint-layout



### Data persistence
* Какие есть способы сохранить данные - shared preferences, db, file



### Services
* What is the purpose of Services?
* I am starting a network request from the Service. What problem can this cause? (Service runs on the main thread by default)
* Difference between Service and IntentService.
* How to prevent a Service from being destroyed by Android? (Use startForeground() with notification)
* When onStartCommand() gets triggered? (Every time when startService() is called, even if Service is already started)
* Типы сервисов - background, foreground, bound
* Bound services
* Bound services lifecycle - https://developer.android.com/guide/components/bound-services
* Started (unbound) Service lifecycle
* Начиная с Андроид 8, какие сервисы можно запускать
* Android 12 - что поменялось в плане startForegroundService?
* Время, в течение которого надо успеть показать уведомление из foreground Service - 5 секунд - https://stackoverflow.com/questions/57272203/context-startforegroundservice-did-not-then-call-service-startforeground-s
* Doze mode
* Как стартовать сервис в бэкграунде, поможет ли вызов startService в бэкграунд потоке? - нет - https://stackoverflow.com/questions/18526131/how-to-run-service-not-on-main-thread
* Interprocess communication (IPC) - https://habr.com/ru/post/139432/
* Как запустить сервис в отдельном процессе? - https://stackoverflow.com/questions/22514373/start-a-service-in-a-separate-process-android   
* Для чего запускать сервис в отдельном процессе?

https://stackoverflow.com/questions/48765700/what-is-the-advantage-of-running-a-service-in-a-different-process 

https://habr.com/ru/post/139432/

* Можно ли запускать активити из сервисов? - Начиная с Андроид 10 только при определенных условиях - https://developer.android.com/guide/components/activities/background-starts



### Broadcast receivers
* Broadcast Receivers - http://developer.alexanderklimov.ru/android/broadcast.php
* Sticky Broadcast



### Content Providers
* Content Providers - https://developer.android.com/guide/topics/providers/content-provider-basics?hl=ru



### Views
* View Lifecycle

https://proandroiddev.com/the-life-cycle-of-a-view-in-android-6a2c4665b95e

https://proandroiddev.com/android-custom-view-level-3-81e767c8cc75

* Custom Views - https://developer.android.com/guide/topics/ui/custom-components
* Какие методы надо переопределить в кастомном вью?
* View.invalidate() и requestLayout() - https://stackoverflow.com/questions/13856180/usage-of-forcelayout-requestlayout-and-invalidate
* View.onMeasure() - что такое measureSpec, как вычисляется размер вью - https://stackoverflow.com/questions/14493732/what-are-widthmeasurespec-and-heightmeasurespec-in-android-custom-views === https://developer.android.com/reference/android/view/View.MeasureSpec
* Какие требования предъявляются к методу onDraw()
* Canvas.save() restore() -  https://stackoverflow.com/questions/29040064/save-canvas-then-restore-why-is-that
* Touch Event - https://developer.android.com/training/gestures/viewgroup === https://www.vogella.com/tutorials/AndroidTouch/article.html
* View Binding - https://developer.android.com/topic/libraries/view-binding
* Data Binding (отличие от View Binding) - https://developer.android.com/topic/libraries/data-binding
* Data Binding Adapters



### ViewModel
* Google ViewModel - это вьюмодел в паттерне MVVM? - Нет, это просто способ пережить уничтожение активити. Чтобы ViewModel стала вьюмоделом из MVVM, надо подписать вью на вьюмодел (например, с помощью LiveData)
* Что будет, если во ViewModel объявить конструктор с параметрами - будет RuntimeException при инициализации вьюмодела
* Как этого избежать - сделать ViewModel Factory
* Какие встречаются проблемы в ViewModel? - LiveData сохраняет последнее событие и отправляет его заново после пересоздания активити (например, сообщение об ошибке будет отправлено заново)



### Multithreading in Android
* Which operations are prohibited to run on the main thread?
* What is the disadvantage of AsyncTask?
* Handler, Looper, Handler Thread - https://blog.mindorks.com/android-core-looper-handler-and-handlerthread-bd54d69fe91a
* Как устроена MessageQueue?
* Как будет работать MessageQueue, если вызывать Handler.postDelayed() - Очередь упорядочивается по времени - https://stackoverflow.com/questions/27240015/does-postdelayed-cause-the-message-to-jump-to-the-front-of-the-queue



## Notifications
* Actions in Notifications (for example reply) - https://developer.android.com/training/notify-user/build-notification


### Testing
* Когда вызываются @Before, @After
* Когда вызывается @BeforeClass
* Как в Espresso нажать на элемент списка



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
* Getting geolocation
* Deep links
* raw vs assets - что где хранить, отличия? (в raw доступ через R.raw.id, в assets через asset manager) - https://stackoverflow.com/questions/5583608/difference-between-res-and-assets-directories



## Gradle
* What to do, if external dependency is not found? (Add appropriate repository into: allprojects { repositories {...} })
* Difference between "implementation" and "compile" 
* What is multidex?
* How to build slightly different applications from one project? (Use flavors)
* Gradle implementation vs api? - При использовании api мы можем использовать внутренние зависимости библиотеки в нашем основном проекте - https://stackoverflow.com/questions/44413952/gradle-implementation-vs-api-configuration
* Gradle build type vs flavor - https://wajahatkarim.com/2018/04/difference-between-build-type-flavour-and-build-variant-in-android/
* Можем ли мы создать свой build type? - Можем - https://stackoverflow.com/questions/49286743/how-to-add-more-build-types-in-app-than-library/49288390



## Network
* HTTP methods - https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods
* HTTP vs WebSocket
* Socket vs WebSocket - https://stackoverflow.com/questions/4973622/difference-between-socket-and-websocket

https://www.geeksforgeeks.org/what-is-web-socket-and-how-it-is-different-from-the-http/#:~:text=WebSocket%3A%20WebSocket%20is%20bidirectional%2C%20a,ws%3A%2F%2F%20or%20wss%3A%2F%2F.&text=When%20the%20connection%20is%20established,channel%20until%20it%20is%20terminated.

https://stackoverflow.com/questions/14703627/websockets-protocol-vs-http

* What is JSON?
* How to set up a name of the serialized property different from the property name? (Use @SerializedName("name") annotation)
* How to exclude a property from the serialization? (mark property as transient (keyword in Java or annotation in Kotlin))
* The app starts crashing on network call. What can be wrong? (Network call on the main thread, not added <uses-permission android:name="android.permission.INTERNET" /> in the manifest)
* Retrofit - what to do, if an app needs to interact with 2 different hosts? (create 2 different retrofit objects)
* How to append some parameter (for example "platform=android") to all network queries? (Use interceptors)
* How to load images? (Use Glide, Picasso or Fresco)
* GraphQL
* Protobuf, для чего файл proto?
* Последовательность работы с Retrofit: какие классы нужно создать и что в них нужно описать?
* Multipart передача данных



## Permissions
* Обычные и опасные разрешения
* Последовательность запроса Permissions - https://developer.android.com/training/permissions/requesting



## Animation
* Виды анимации
* Анимация с помощью ConstraintSet



## Room
* Последовательность работы с Room: какие классы нужно создать и что в них нужно описать?
* What does @Entity annotation do?
* What is @PrimaryKey?
* How to select only different items from the db? (SELECT DISTINCT)
* The app starts crashing after new entity has been added. What I forgot to do? (Update database version, add migration)



## Dagger
* What is Dependency Injection?
* Преимущества Dependency Inversion (Dagger) - зависимости предоставляются извне - легко менять составные части объектов, Dagger берет на себя генерацию графа зависимостей, упрощается тестирование - в тестах вместо реальных объектов можно подсовывать замоканные
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



## Algorithm coding task
Требуется умение писать код на бумаге с первого раз без переписываний, дебажить в голове, проверять краевые условия

* In text editor: https://code.yandex-team.ru/ or https://codeshare.io/

OR

* HackerRank (LeetCode)



## Android coding task
Task: download list of items from the server and display them on screen. How would you organize your code?

Example of Clean Architecture in Android: https://github.com/gpetuhov/AndroidFundamentals2021/tree/master/01-CleanArchitecture



## Reference
https://github.com/MindorksOpenSource/android-interview-questions