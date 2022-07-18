# Android Interview Questions and Code Samples
Basic plan and some typical questions and code samples for Android interview.

Latest update: 2022.07.18

## Previous experience
* Tell us about yourself and your previous experience.
* What was the project you worked on your previous job?
* What was your role in the project?
* Which part of the project you worked on?
* Is there anything you are particularly proud of?
* Who was in the team?
* How collaboration inside the team was organized? Who set tasks?



## OOP and SOLID
* OOP: abstraction, encapsulation, inheritance, polymorphism - https://tproger.ru/translations/oop-principles-cheatsheet/
* Отличие переопределения и перегрузки методов (override vs overload)
* Overload - статический полиморфизм, Override - динамический полиморфизм - https://javarush.ru/groups/posts/2025-polimorfizm-i-ego-druzjhja
* Можно ли переопределить и перегрузить статические методы? - Перегрузить - да, переопределить - нет - https://stackoverflow.com/questions/2475259/can-i-override-and-overload-static-methods-in-java/5436790#:~:text=Static%20methods%20cannot%20be%20overridden,decides%20which%20method%20gets%20called.&text=Static%20methods%20can%20be%20overloaded%20(meaning%20that%20you%20can%20have,they%20have%20different%20parameter%20types).
* SOLID
* Плюсы и минусы SOLID
* Примеры нарушения SOLID в Android SDK
* GRASP

https://medium.com/@ruberoid55/grasp-principles-lead-by-examples-for-android-development-part-1-ed9e087b5fe1

https://bool.dev/blog/detail/grasp-printsipy

https://habr.com/ru/company/otus/blog/491636/

https://habr.com/ru/company/otus/blog/505618/

https://habr.com/ru/company/otus/blog/505852/

https://habr.com/ru/company/otus/blog/507600/

https://habr.com/ru/company/otus/blog/521476/

* Почему композиция лучше наследования? - https://stackoverflow.com/questions/49002/prefer-composition-over-inheritance
* Clean code
* Как в алгоритмах оценивают потребление памяти? - Тоже в терминах O(), как и вычислительную сложность - https://www.geeksforgeeks.org/analysis-algorithms-big-o-analysis/
* Проблемы множественного наследования - почему в Java от него отказались?
* Чем ООП отличается от других парадигм программирования?
* Какие еще существуют парадигмы программирования, кроме ООП?
* Агрегация и композиция, отличия

https://habr.com/ru/post/354046/

https://ru.stackoverflow.com/questions/596697/%D0%90%D0%B3%D1%80%D0%B5%D0%B3%D0%B0%D1%86%D0%B8%D1%8F-%D0%B8-%D0%BA%D0%BE%D0%BC%D0%BF%D0%BE%D0%B7%D0%B8%D1%86%D0%B8%D1%8F

* Привести примеры инкапсуляции, наследования и полиморфизма
* KISS, DRY, YAGNI
* Преимущества и недостатки ООП

https://tproger.ru/articles/pljusy-minusy-i-perspektivy-oop-v-sovremennoj-razrabotke/

https://tproger.ru/translations/oop-the-trillion-dollar-disaster/?utm_referrer=recommendation-banner



## Design Patterns
* Design Patterns: creational, behavioral, structural

https://habr.com/ru/company/vk/blog/325492/

https://habr.com/ru/post/210288/

* Which Design Patterns did you use in your projects?
* RecyclerView Adapter является ли реализацией паттерна Адаптер? - нет - https://stackoverflow.com/questions/41626980/are-android-adapters-an-example-of-adapter-design-pattern
* Подводные камни singleton - https://stackoverflow.com/questions/137975/what-are-drawbacks-or-disadvantages-of-singleton-pattern



## Git
* Gitflow
* Git merge vs rebase



## Java
* Где используется ключевое слово final? - константы, классы, методы
* Как запретить переопределение метода в потомках? - Пометить метод как final
* Модификаторы доступа в Java - public, protected, private, package private (когда нет никакого ключевого слова) - https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
* Как можно менять модификаторы доступа в потомках? - Можно расширять, но нельзя сужать - https://docs.oracle.com/javase/tutorial/java/IandI/override.html
* What is an interface? - https://www.baeldung.com/java-interfaces
* Допускается ли множественное наследование? - Наследование нет, но класс может реализовывать несколько интерфейсов
* Отличие interface от abstract class - в интерфейсе все методы public, не может быть private, абстрактный класс может хранить состояние и может иметь конструктор
* ClassLoader, getClass - https://www.baeldung.com/java-classloaders
* Когда ClassLoader грузит класс - при первом обращении к классу
* Структура памяти в JVM - http://tutorials.jenkov.com/java-concurrency/java-memory-model.html
* Garbage collection - https://www.geeksforgeeks.org/garbage-collection-java/
* В какой момент Garbage Collector может собрать объект?
* Как GC поймет, что на объект никто не ссылается

https://www.dynatrace.com/resources/ebooks/javabook/how-garbage-collection-works/ 

https://stackoverflow.com/questions/27186799/what-are-gc-roots-for-classes 

https://www.yourkit.com/docs/java/help/gc_roots.jsp

* Что является root для Garbage Collection?
* В памяти находятся два объекта и ссылаются друг на друга, больше на них никто не ссылается. Соберет ли их GC? - да, это называется island of isolation
* Для чего нужен Object? - Объявляет ряд базовых методов, в том числе для организации многопоточности, также нужен для того, чтобы garbage collector мог собрать объекты
* Методы Object - https://www.geeksforgeeks.org/object-class-in-java/
* Object.clone() можно ли вызвать? - Нет, если не имплеменить Cloneable интерфейс - https://en.wikipedia.org/wiki/Clone_(Java_method)
* Object.finalize()

https://www.tutorialspoint.com/java/lang/object_finalize.htm#:~:text=finalize()%20is%20called%20by,or%20to%20perform%20other%20cleanup. 

https://www.baeldung.com/java-finalize

* Зачем нужны методы equals и hashcode
* Если переопределил equals, то надо ли переопределять hashcode? - надо
* Контракт между equals и hashcode - https://www.baeldung.com/java-equals-hashcode-contracts
* Что может вернуть x.equals(null) - Если x == null, то NPE, иначе false
* Методы wait() (их несколько), notify(), notifyAll() - https://www.baeldung.com/java-wait-notify
* Types of references in Java (Strong, Weak, Soft, Phantom)

https://www.geeksforgeeks.org/types-references-java/

https://www.baeldung.com/java-weak-reference

https://www.baeldung.com/java-phantom-reference

https://www.baeldung.com/java-soft-references

https://javarush.ru/quests/lectures/questcollections.level04.lecture03

https://javarush.ru/quests/lectures/questcollections.level04.lecture05

https://javarush.ru/groups/posts/2291-osobennosti-phantomreference

https://stackoverflow.com/questions/299659/whats-the-difference-between-softreference-and-weakreference-in-java/299702#299702

* Зачем нужна PhantomReference

https://developer.android.com/reference/java/lang/ref/PhantomReference#:~:text=Phantom%20references%20are%20most%20often,with%20the%20Java%20finalization%20mechanism.&text=Unlike%20soft%20and%20weak%20references,collector%20as%20they%20are%20enqueued. 

https://stackoverflow.com/questions/53822132/java-phantomreference-vs-finalize

* Асимптотическая сложность конкатенации строк - O(n^2) - https://overcoder.net/q/186163/%D1%81%D0%BB%D0%BE%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C-%D0%BA%D0%BE%D0%BD%D0%BA%D0%B0%D1%82%D0%B5%D0%BD%D0%B0%D1%86%D0%B8%D0%B8-%D1%81%D1%82%D1%80%D0%BE%D0%BA-%D0%B2-c-%D0%B8-java
* StringBuilder - чем он лучше простой конкатенации строк - https://stackoverflow.com/questions/1532461/stringbuilder-vs-string-concatenation-in-tostring-in-java === https://www.baeldung.com/java-strings-concatenation
* String pool - https://www.baeldung.com/java-string-pool
* Квалификатор final
* Для чего полезна иммутабельность? - https://www.baeldung.com/java-immutable-object
* Java reflection - https://www.baeldung.com/java-reflection
* Дерево коллекций

http://www.quizful.net/post/Java-Collections

https://habr.com/ru/post/162017/

* Почему Map не Collection - у Collection есть методы доступа по индексу, которые не нужны в Map
* int i - это value или reference? - value
* What is boxing, unboxing (Integer, Double, ...)
* Можно ли примитивы класть в коллекции (int, double, ...) - нет
* ArrayList vs LinkedList. Which one takes less time to add an item in the middle? Which one takes less time to get n-th element?
* ArrayList под капотом - это динамический массив с изначальным размером 10
* SparseArray

https://developer.android.com/reference/android/util/SparseArray

https://stackoverflow.com/questions/25444226/difference-between-sparsearray-vs-arraylist#:~:text=2%20Answers&text=The%20purpose%20of%20a%20SparseArray,that%20will%20be%20quite%20wasteful.

* Binary search - https://www.baeldung.com/java-binary-search
* Какие свойства должны быть у коллекции для бинарного поиска
* Какая сложность поиска элемента в упорядоченном массиве? - Для этого применяем бинарный поиск. Его сложность - O(logn)
* Как работает HashMap?
* Что будет, если в Map положить два значения с одинаковым ключом? - Последнее значение перезапишет предыдущеe
* Что такое коллизия?
* HashMap - защита от коллизий - Запись в LinkedList в случае коллизий
* What will Hashmap become, if all the elements will have the same hashcode? - HashMap will become a LinkedList
* Можно ли в HashMap положить элемент с ключом null? - можно - https://stackoverflow.com/questions/25932730/hashmap-with-null-key-and-null-value#:~:text=HashMap%20puts%20null%20key%20in,linked%20list%20data%20structure%20internally.&text=In%20Entry%20class%20the%20K,value%20passed%20in%20put%20method.
* Есть ли в HashMap LinkedList по ключу null - Нет, там только один элемент, так как у null не может быть equals
* HashMap - что такое бакеты? - Это и есть те элементы, которые адресуются на основе хешкода (бакетами могут быть связанные списки или бинарные деревья) - https://www.baeldung.com/java-hashmap
* Всегда ли в бакетах в HashMap используется LinkedList? - Нет. При большом количестве элементов в бакете LinkedList заменяется на binary tree. Тогда время поиска элемента становится O(logn) вместо O(n) Примечение: log по основанию 2
* Как выбрать изначальный размер массива в HashMap
* Почему изначальный размер массива в HashMap выбран 16
* Левоассоциативность (И, ИЛИ) - https://ru.wikipedia.org/wiki/%D0%9E%D1%87%D0%B5%D1%80%D1%91%D0%B4%D0%BD%D0%BE%D1%81%D1%82%D1%8C_%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B9
* Аннотации - что это? - https://www.baeldung.com/java-custom-annotation
* RetentionPolicy в аннотациях - https://www.java2novice.com/java-annotations/retention-policy/#:~:text=Description%3A,point%20annotation%20should%20be%20discarded.&text=Annotation%20with%20retention%20policy%20RUNTIME,pass%20the%20retention%20policy%20type.
* Java Throwable Hierarchy (Errors and Exceptions) - https://airbrake.io/blog/java-exception-handling/the-java-exception-class-hierarchy
* Java checked exceptions - Это когда в сигнатуре метода есть throws Exception и тогда компилятор при вызове данного метода попросит обернуть в try-catch - https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/#:~:text=In%20Java%2C%20there%20are%20two,the%20exception%20using%20throws%20keyword.
* What is "finally" block used for in try-catch?
* Static classes vs inner classes - https://stackoverflow.com/questions/70324/java-inner-class-and-static-nested-class
* Плюсы и минусы анонимных классов - https://www.techartifact.com/blogs/2009/08/anonymous-classes-in-java.html
* Различные способы реализации Singleton

https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 
https://habr.com/ru/post/129494/

https://www.baeldung.com/java-singleton
* Виды сортировок - пузырьком O(n^2), слиянием O(nlogn), быстрая сортировка O(nlogn), сортировка подсчетом (применим только в некоторых случаях) O(n+k) где k - количество различных элементов



## Generics
* Что такое Generics - https://habr.com/ru/company/sberbank/blog/416413/
* С какой версии Java появились дженерики? - Java 5
* Стирание типов - https://javarush.ru/groups/posts/2315-stiranie-tipov
* PECS - https://stackoverflow.com/questions/2723397/what-is-pecs-producer-extends-consumer-super
* Ковариантность (extends T), контрвариантность (super T), инвариантность (просто T)
* Можно сделать так: instanceOf List<String> - нельзя из-за стирания типов



## Multithreading

https://github.com/gpetuhov/MultithreadingTutorial

* Which means of organizing multithreading do you know? (Java Thread, ExecutorService, Handler, AsyncTask, RxJava, Kotlin coroutines)
* ExecutorService

https://www.baeldung.com/java-executor-service-tutorial

* Race condition - точное определение
* synchronized vs volatile

https://www.baeldung.com/java-synchronized

https://stackoverflow.com/questions/3519664/difference-between-volatile-and-synchronized-in-java

* Поможет ли volatile от гонки? - нет - https://www.javatpoint.com/volatile-keyword-in-java
* Можно ли все переменные сделать volatile? - В зависимости от процессора volatile может дать увеличение времени из-за чтения не из кэша ядра, а из основной памяти - https://stackoverflow.com/questions/4633866/is-volatile-expensive
* Deadlock - что это и как бороться?

https://www.baeldung.com/java-deadlock-livelock

https://www.baeldung.com/java-dining-philoshophers

* Как использовать tryLock, чтобы избежать deadlock? - https://www.baeldung.com/java-deadlock-livelock
* Атомарные операции. CompareAndSet

https://ru.stackoverflow.com/questions/616278/%D0%90%D1%82%D0%BE%D0%BC%D0%B0%D1%80%D0%BD%D1%8B%D0%B5-%D0%B8-%D0%BD%D0%B5%D0%B0%D1%82%D0%BE%D0%BC%D0%B0%D1%80%D0%BD%D1%8B%D0%B5-%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B8-java 

https://www.baeldung.com/java-atomic-variables

* AtomicInteger
* Что выдаст Future.get(), если Callable завершится аварийно - Будет ExecutionException
* Java concurrent list - CopyOnWriteArrayList - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CopyOnWriteArrayList.html
* Java ConcurrentHashMap 
 
https://www.baeldung.com/java-concurrent-map

https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html

* ThreadLocal - https://www.baeldung.com/java-threadlocal
* Семафоры, мониторы - https://www.baeldung.com/cs/monitor
* CountDownLatch, Barrier

https://www.baeldung.com/java-countdown-latch 

https://www.baeldung.com/java-cyclic-barrier

* Object wait(), notify(), notifyAll()
* Почему потоки создаются долго (что при этом происходит)? - https://stackoverflow.com/questions/5483047/why-is-creating-a-thread-said-to-be-expensive
* Synchronized collections - https://www.baeldung.com/java-synchronized-collections
* Concurrent collections (появились в Java 5) - https://www.developer.com/design/an-introduction-to-concurrent-collection-apis-in-java/
* Почему Thread.stop() deprecated - https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/threadPrimitiveDeprecation.html#:~:text=stop%20deprecated%3F,monitors%20that%20it%20has%20locked.&text=Unlike%20other%20unchecked%20exceptions%2C%20ThreadDeath,his%20program%20may%20be%20corrupted.
* Как правильно остановить поток в Java, не вызывая метода Thread.stop(), так как он deprecated? - https://stackoverflow.com/questions/10961714/how-to-properly-stop-the-thread-in-java
* Есть ли у enum подводные камни в многопоточке? - нет - https://www.geeksforgeeks.org/advantages-and-disadvantages-of-using-enum-as-singleton-in-java/#:~:text=Creation%20of%20Enum%20instance%20is,some%20line%20of%20code%20enum.



## Kotlin
* What are the advantages of Kotlin?
* Как разрешить переопределение метода в потомках? - Пометить метод как open
* Any, Unit, Nothing - https://gb.ru/posts/razbiraemsya-v-tipah-kotlin-unit-nothing-any-i-null
* Класс Any - назначение, методы класса (equals, hashCode, toString) - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/
* Класс Nothing - это null нет? - нет, Nothing - это наследник всех классов в Kotlin, он описывает функции, которые могут ничего не вернуть (если функция кидает исключение, то она возвращает Nothing). А Nothing? уже может быть null. - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing.html
* Класс Unit - это аналог void в Java - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/
* Модификаторы доступа в Kotlin
* Как вычисляется hashCode по умолчанию?
* Если не переопределить equals(), то как будут сравниваться объекты с помощью оператора сравнения == ? - Это зависит от JVM, но в большинстве JVM объекту при создании присваивается случайное число, и в данном случае сравнение будет происходить на основе этого числа. По умолчанию сравнение происходит не на основе ссылок, так как ссылки могут измениться. 
* Kotlin default and named arguments
* How to create a singleton in Kotlin? - object
* Companion objects
* Difference between val and const val?
* Во что компилируется лямбда? - в анонимный внутренний класс Java
* Can enums contain values? (Yes: enum class Action(val value: Int) { WALK(0), RUN(1), ... }
* В чем преимущество sealed class перед enum? - Sealed class позволяет создавать экземпляры классов, поэтому можно менять состояние объектов в рантайме. Enum не позволяет менять состояние.
* lateinit vs lazy
* Delegates - как там реализована потокобезопасность?
* inline functions
* Можно ли узнать тип дженерика в inline функции? - только если сделать reified parameters - https://stackoverflow.com/questions/33146160/how-to-check-generic-type-in-kotlin
* reified type parameters (речь только про функции, классы не могут иметь reified полей) - https://kotlinlang.org/docs/inline-functions.html#reified-type-parameters
* noinline - https://kotlinlang.org/docs/inline-functions.html
* infix functions - https://kotlinlang.org/docs/functions.html#infix-notation
* Может ли infix функция содержать дефолтные параметры - нет
* Как сделаны под капотом extension functions - это static методы - https://moshenskyi.medium.com/kotlin-under-the-hood-extension-functions-1d61fabdf631
* Extension functions - существует мнение, что это антипаттерн, им легко злоупотреблять и тяжело тестировать
* Data classes - https://kotlinlang.org/docs/data-classes.html#properties-declared-in-the-class-body
* Методы data класса 
* В data class можно override только equal без hashcode? - нет - https://petamind.com/why-do-we-need-to-override-equals-and-hashcode-methods-in-java-kotlin/
* Можно ли наследоваться от data classes? - нет - https://discuss.kotlinlang.org/t/data-class-inheritance/4107
* Как в Kotlin сделать, чтобы property не участвовал в вычислении hashCode в data class? - Прописать параметр в теле класса, а не в конструкторе - https://kotlinlang.org/docs/data-classes.html#properties-declared-in-the-class-body
* Есть ли equals и hashcode у лямбды в Kotlin? - да, так как это обычный класс - https://stackoverflow.com/questions/24095875/is-there-a-way-to-compare-lambdas
* Можно ли передать лямбду в конструкторе data class? - можно - https://iamjonfry.com/posts/lambdas-in-data-classes/
* Удалось ли в Kotlin уйти от null? - Нет, так как lateinit под капотом принимает изначальное значение null
* Минусы null safety - В машинном коде на самом деле разбросаны проверки на null и вызов Kotlin NPE. Так было раньше. Начиная с 1.4 стало лучше после того, как стали кидать обычный Java NPE
* Какие могут быть проблемы из-за интероперабельности Kotlin и Java? - могут быть проблемы из-за null safety при вызове Java кода из Kotlin - https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-null-types
* Kotlin !! operator - какой кидает exception: Java или Kotlin? - KotlinNullPointerException
* Что такое sealed classes?
* enum vs sealed classes - enum не позволяет создавать отдельные экземпляры, в отличие от sealed классов - https://blog.kotlin-academy.com/enum-vs-sealed-class-which-one-to-choose-dc92ce7a4df5
* Есть ли аналоги data classes и sealed classes в Java? - Есть. В новой Java есть sealed classes и record classes (аналог data)
* Разница между == и === в Kotlin? - Первый сравнивает значение, второй ссылки (reference)
* Generics в Kotlin - что такое in, out? - https://kotlinlang.org/docs/generics.html#declaration-site-variance
* Java stream, Kotlin sequence - в чем отличие от списка - Операции выполняются lazy, только когда результат уже нужен, и выполняются сразу все операции с каждым элементом без вычисления промежуточных коллекций - https://kotlinlang.org/docs/sequences.html
* Подводный камень sequence - на каждый шаг создается лямбда, поэтому для малого количества элементов выгоднее использовать обычные коллекции - https://typealias.com/guides/when-to-use-sequences/
* Kotlin SAM - https://kotlinlang.org/docs/fun-interfaces.html#sam-conversions
* Есть ли в Kotlin checked exceptions, как в Java? - Нет. Аннотация @Throws нужна только если метод будет вызван из Java кода
* Kotlin scope functions (let, run, apply, also, with) - https://kotlinlang.org/docs/scope-functions.html
* Иерархия коллекций в Kotlin
* Немутабельные и мутабельные коллекции в Kotlin и Java - в Kotlin под капотом немутабельной коллекции лежит мутабельная, поэтому list.toMutableList() += 5 сработает, а в Java - нет (см. Collection.unModifiableList())
* Kotlin @Synchronized



## RxJava

https://github.com/gpetuhov/RxJavaTutorial

* What design pattern does RxJava implement? (Observer Pattern)
* Типы Observable - https://medium.com/mindorks/rxjava-types-of-observables-404d75605e35
* Difference between cold and hot observables.
* ConnectableObservable - это холодный observable, начинает эмитить только после вызова метода connect() - http://reactivex.io/RxJava/javadoc/rx/observables/ConnectableObservable.html
* Какой метод вызвать для начала эмита у горячего Observable - метод ConnectableObservable.connect() - https://medium.com/tompee/rxjava-ninja-hot-and-cold-observables-19b30d6cc2fa
* Как преобразовать холодный Observable в горячий - Вызвать publish() - https://medium.com/tompee/rxjava-ninja-hot-and-cold-observables-19b30d6cc2fa
* Как преобразовать горячий Observable в холодный - Вызвать defer() - https://stackoverflow.com/questions/34030793/transform-a-hot-observable-to-a-cold-observable
* Что такое RxJava defer - https://blog.mindorks.com/understanding-rxjava-defer-operator
* Что такое RxJava share - https://medium.com/mindorks/how-to-use-rxjava-share-operator-26b08973771a
* Что такое RxJava PublishProcessor - http://reactivex.io/RxJava/javadoc/io/reactivex/processors/PublishProcessor.html
* Что такое Subject?
* Типы Subject и их отличие - https://medium.com/@nazarivanchuk/types-of-subjects-in-rxjava-96f3a0c068e4
* Что такое backpressure
* Стратегии работы с backpressure - https://www.baeldung.com/rxjava-backpressure
* What is the purpose of buffer()?
* Backpressure в RxJava 1 - https://eng.uber.com/rxjava-backpressure/
* Отличие Observable и Flowable
* Стратегии Flowable для работы с backpressure
* How to change threads? (subscribeOn, observeOn) - subscribeOn works upstream, observeOn works downstream - https://proandroiddev.com/rx-java-subscribeon-and-observeon-a7d95041ce96
* Difference between Schedulers.io() and Schedulers.computation()
* Что будет если много раз выполнить оператор subscribeOn() в цепочке? - Только первый оператор даст желаемый эффект. Остальные же эффекта не дадут, кроме траты ресурсов
* Что будет если много раз выполнить оператор observeOn() в цепочке? - Каждый observeOn() включает планировщик (поток), в котором будут выполняться все последующие операторы. Сложные потоки RxJava могут выиграть от нескольких операторов observeOn()
* Difference between scan() and reduce()
* Difference between merge() and concat()
* Difference between zip() and combineLatest()
* Zip под капотом как работает
* Difference between flatMap(), concatMap() and switchMap() - https://medium.com/appunite-edu-collection/rxjava-flatmap-switchmap-and-concatmap-differences-examples-6d1f3ff88ee0
* Пример использования switchMap - поисковая строка (каждый последующий символ отменяет предыдущий запрос в сеть)
* Difference between throttleFirst() and debounce() (aka throttleWithTimeout())
* Custom operator - https://www.baeldung.com/rxjava-custom-operators



## Kotlin coroutines
* RxJava vs Coroutines - https://stackoverflow.com/questions/42066066/how-kotlin-coroutines-are-better-than-rxkotlin
* Отличие пулов потоков в RxJava и Coroutines - https://medium.com/capital-one-tech/coroutines-and-rxjava-an-asynchronicity-comparison-part-6-threading-2aa5e9c52c94
* Coroutine Scope, Coroutine Context - https://elizarov.medium.com/coroutine-context-and-scope-c8b255d59055
* CoroutineExceptionHandler - https://kotlinlang.org/docs/exception-handling.html
* launch vs async - https://stackoverflow.com/questions/46226518/what-is-the-difference-between-launch-join-and-async-await-in-kotlin-coroutines
* Корутины под капотом - https://rohit.fyi/blog/kotlin-coroutines-under-the-hood-part-1/
* Нужна ли синхронизация при использовании корутин? - Нужна - https://kotlinlang.org/docs/shared-mutable-state-and-concurrency.html



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
* Можно ли в Android запустить jar? - Android uses the Dalvik VM, whereas you need the Java VM to run a jar-file. So no, you can't run a jar-file on android - https://stackoverflow.com/questions/12905012/running-an-executable-jar-in-android - но при этом можно подключить к приложению jar-библиотеку - https://stackoverflow.com/questions/25660166/how-to-add-a-jar-in-external-libraries-in-android-studio 
* Как перехватить все runtime исключения? - https://stackoverflow.com/questions/32229170/catch-all-possible-android-exception-globally-and-reload-application === https://stackoverflow.com/questions/3171394/using-global-exception-handling-with-setuncaughtexceptionhandler-and-toast



### Basics
* Android components and what are they used for (Activity, Service, Content Provider, Broadcast Receiver)
* Почему Application не компонент? - Потому что это не точка входа в приложение
* Как Андроид компоненты влияют на приоритет процесса - https://medium.com/androiddevelopers/who-lives-and-who-dies-process-priorities-on-android-cb151f39044f
* Project structure of an Android application (modules, manifest, source, res, assets, Gradle scripts)
* What is AndroidManifest.xml?
* Context - https://developer.android.com/reference/android/content/Context
* Context types. Difference between Application Context and Activity Context

https://stackoverflow.com/questions/4128589/difference-between-activity-context-and-application-context 

https://medium.com/@banmarkovic/what-is-context-in-android-and-which-one-should-you-use-e1a8c6529652

* Отображение AlertDialog из app context - https://nhancv.medium.com/android-show-dialog-without-activity-context-94661d48400f
* raw vs assets - что где хранить, отличия? (в raw доступ через R.raw.id, в assets через asset manager) - https://stackoverflow.com/questions/5583608/difference-between-res-and-assets-directories



### Activity
* Single Activity vs Multiple Activity

https://stackoverflow.com/questions/44880822/multiple-activity-or-single-activity-and-multiple-fragments

https://oozou.com/blog/reasons-to-use-android-single-activity-architecture-with-navigation-component-36

* Можно ли сделать несколько MainActivity? - да, тогда на HomeScreen будет несколько иконок приложения. Пример - когда используешь библиотеку LeakCanary
* Activity lifecycle

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-i-single-activities-e49fd3d202ab

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-ii-multiple-activities-a411fd139f24

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-iii-fragments-afc87d4f37fd

https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-iv-49946659b094

* Для чего нужны onStart() и onResume() - Они нужны с точки зрения UI, Например, позволяют подписаться/отписаться на интенты. Если пользователь не смотрит на экран, то нет смысла ему что-то показывать. Например, в onPause и тем более onStop не имеет смысла проигрывать анимацию
* Why do we need to setContentView() in onCreate(), not in onStart()? (Because onCreate() is triggered only once)
* How to prevent activity from being destroyed on orientation change via manifest? - Use configChanges attribute - https://developer.android.com/guide/topics/manifest/activity-element#config
* Activity.onDestroy() - гарантируется ли вызов? - нет - https://developer.android.com/reference/android/app/Activity.html#onDestroy%28%29
* When only onDestroy is called for an activity without onPause() and onStop()? (If finish() is called in the onCreate method of an activity, the system will call onDestroy() method directly.)
* Что такое Window?

https://developer.android.com/reference/android/view/Window

https://stackoverflow.com/questions/9451755/what-is-an-android-window

* Как получить Window - Activity.getWindow() - https://stackoverflow.com/questions/7378644/how-to-call-getwindow-outside-an-activity-in-android
* Window DecorView - https://stackoverflow.com/questions/23276847/what-is-an-android-decorview
* Activity launch modes 

https://developer.android.com/guide/components/activities/tasks-and-back-stack

https://habr.com/ru/company/otus/blog/493802/
 
https://medium.com/mobile-app-development-publication/android-activity-launchmode-made-simple-df7f0ec5e037

* Для чего запускать разные активити в разных тасках?

https://developer.android.com/guide/components/activities/tasks-and-back-stack 

https://medium.com/androiddevelopers/tasks-and-the-back-stack-dbb7c3b0f6d4 

https://habr.com/ru/company/otus/blog/493802/ 

https://iammert.medium.com/android-launchmode-visualized-8843fc833dbe

* Task Affinity

https://stackoverflow.com/questions/17872989/android-task-affinity-explanation 

https://medium.com/@veeresh.charantimath8/playing-with-android-task-affinity-and-launch-modes-5c36a0421e83

* What are the means of data transfer between activities? (Intents, Shared preferences, DB, file, Eventbus, Singleton class)
* How to transfer a class between activities inside an Intent? (it must be Serializable or Parcelable)
* Активити A вызвала активити B. Как из B вернуть результат в A - B.setResult(), A.onActivityResult()
* Что происходит при повороте экрана? - активити пересоздается
* При каких еще условиях активити пересоздается? - поворот экрана, смена языка, смена темы, активити уничтожена в бэкстеке, активити уничтожена вместе с приложением
* How to save screen state on screen rotation (saveInstanceState, Presenter, ViewModel)?
* How to save state of an EditText? (provide an id, but it uses Bundle under the hood)
* Почему сохранение данных при повороте экрана в Bundle, а не в SharedPreferences? - Bundle хранится в памяти, поэтому быстрее === https://stackoverflow.com/questions/24822101/when-to-use-getsharedpreferences-vs-savedinstancestate



### Intents
* What is Intent used for? (to start activities, services and send broadcasts)
* Как передать данные через интент? - Bundle
* Что можно положить в Bundle? - Основные типы, Serializable, Parcelable
* Ограничения на размер Bundle - 500 КБ (2 МБ по другим источникам) - https://stackoverflow.com/questions/8552514/is-there-any-limit-of-bundle-in-android
* Serializable vs Parcelable - https://stackoverflow.com/questions/3323074/android-difference-between-parcelable-and-serializable
* Проблемы Serializable - 1. Рефлексия, 2. Если поле в Serializable классе будет не Serializable, то при десериализации оно будет просто null (а в случае Parcelable компилятор сразу это подсвечивает)
* Difference between implicit and explicit intents.
* How to open url in browser?

```
val uri = Uri.parse(websiteUrl)
val intent = Intent(Intent.ACTION_VIEW, uri)
```

* Pending intent
* How to make an activity start on some intent from other apps? (Add intent filter in the manifest)
* Механизм резолюшна интент-фильтра (последовательность действий, что с чем сравнивается) - https://www.androidcookbook.info/application-development/how-android-resolves-intent-filters.html
* Can I access data in another application's content provider via intent? (No, use ContentResolver instead)



### Fragments
* What is the purpose of Fragments? Limitations (2-3 fragments per activity)
* Способы добавления фрагмента в активити - Вручную с помощью FragmentManager, прописать жестко фрагмент в макете (но под капотом все равное будет использован FragmentManager), Jetpack Navigation, Cicerone 
* FragmentManager - https://developer.android.com/guide/fragments/fragmentmanager
* getSupportFragmentManager() vs getChildFragmentManager() - https://stackoverflow.com/questions/14740445/what-is-difference-between-getsupportfragmentmanager-and-getchildfragmentmanag/14775322
* How to create UI with BottomNavigationView where root fragments have child fragments and root fragments are not destroyed?
* Подводные камни FragmentManager.commit() при повороте экрана - commit() нельзя вызывать после того, как сработал onSaveInstanceState(), и поэтому можно вызывать commitAllowingStateLoss(), но тогда есть вероятность, что фрагмент потеряется после поворота экрана - https://medium.com/inloopx/demystifying-androids-commitallowingstateloss-cb9011a544cc
* FragmentManager commit, commitNow, commitAllowingStateLoss - в чем разница?

https://developer.android.com/reference/android/app/FragmentTransaction#commit()

https://stackoverflow.com/questions/38566628/how-is-the-new-fragmenttransaction-commitnow-working-internally

https://medium.com/@bherbst/the-many-flavors-of-commit-186608a015b1

* Есть ли у фрагмента метод onRestoreInstanceState - нет - https://stackoverflow.com/questions/5412746/android-fragment-onrestoreinstancestate
* How to share data between fragments? - https://developer.android.com/guide/fragments/communicate
* Fragment Result API - https://developer.android.com/guide/fragments/communicate#fragment-result
* Shared ViewModel - https://blog.mindorks.com/shared-viewmodel-in-android-shared-between-fragments
* How to pass data into Fragments? (Via arguments)
* Почему нельзя во фрагмент передавать параметры в конструкторе? - при пересоздании вызывается дефолтный конструктор без параметров - https://stackoverflow.com/questions/9245408/best-practice-for-instantiating-a-new-android-fragment
* Fragment.onDestroy() вызывается ли при вызове FragmentManager.remove() или replace() - да - https://stackoverflow.com/questions/62498487/fragmenttransaction-add-fragment-after-replace-old-fragment-but-ondestroyview-ca
* Зачем AlertDialog пихать в DialogFragment? - Чтобы диалогом управлял FragmentManger и восстанавливал при повороте экрана - https://developer.android.com/guide/fragments/dialogs
* BottomSheetDialogFragment - https://medium.com/@kosta.palash/using-bottomsheetdialogfragment-with-material-design-guideline-f9814c39b9fc
* Если фрагмент прописан в xml, то под капотом все равно будет использоваться FragmentManager
* What can go wrong when calling activity.startActivityForResult() inside fragment? (The result will be delivered to onActivityResult() of the activity, not the fragment)



### Services
* What is the purpose of Services? - https://developer.android.com/guide/components/services
* I am starting a network request from the Service. What problem can this cause? (Service runs on the main thread by default)
* Как стартовать сервис в бэкграунде, поможет ли вызов startService в бэкграунд потоке? - нет - https://stackoverflow.com/questions/18526131/how-to-run-service-not-on-main-thread
* Difference between Service and IntentService.
* When onStartCommand() gets triggered? (Every time when startService() is called, even if Service is already started)
* Типы сервисов - background, foreground, bound
* Bound services lifecycle - https://developer.android.com/guide/components/bound-services
* Started (unbound) Service lifecycle
* Начиная с Андроид 8, какие сервисы можно запускать
* Android 12 - что поменялось в плане startForegroundService? - You can't start foreground service, when the app is in background (ForegroundServiceStartNotAllowedException will be thrown)
* Время, в течение которого надо успеть показать уведомление из foreground Service - 5 секунд - https://stackoverflow.com/questions/57272203/context-startforegroundservice-did-not-then-call-service-startforeground-s
* Doze mode
* Interprocess communication (IPC) - https://habr.com/ru/post/139432/
* Как запустить сервис в отдельном процессе? - https://stackoverflow.com/questions/22514373/start-a-service-in-a-separate-process-android   
* Для чего запускать сервис в отдельном процессе?

https://stackoverflow.com/questions/48765700/what-is-the-advantage-of-running-a-service-in-a-different-process 

https://habr.com/ru/post/139432/

* Можно ли запускать активити из сервисов? - Начиная с Андроид 10 - только при определенных условиях - https://developer.android.com/guide/components/activities/background-starts



### Broadcast receivers
* Broadcast Receivers
 
https://developer.android.com/guide/components/broadcasts
 
http://developer.alexanderklimov.ru/android/broadcast.php

* Sticky Broadcast - https://stackoverflow.com/questions/3490913/what-is-a-sticky-broadcast



### Content Providers
* Content Providers - https://developer.android.com/guide/topics/providers/content-provider-basics?hl=ru



### ViewModel
* Google ViewModel - это вьюмодел в паттерне MVVM? - Нет, это просто способ пережить уничтожение активити. Чтобы ViewModel стала вьюмоделом из MVVM, надо подписать вью на вьюмодел (например, с помощью LiveData)
* Что будет, если во ViewModel объявить конструктор с параметрами - будет RuntimeException при инициализации вьюмодела
* Как этого избежать - сделать ViewModel Factory
* ViewModelFactory - https://developer.android.com/codelabs/kotlin-android-training-view-model#7
* Какие встречаются проблемы в ViewModel? - LiveData сохраняет последнее событие и отправляет его заново после пересоздания активити (например, сообщение об ошибке будет отправлено заново)
* LiveData value и postValue - в чем разница? - https://stackoverflow.com/questions/51299641/difference-of-setvalue-postvalue-in-mutablelivedata
* Как трансформировать LiveData - https://proandroiddev.com/livedata-transformations-4f120ac046fc



### Layouts
* Difference between LinearLayout and ConstraintLayout
* CoordinatorLayout - https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout
* Collapsing toolbar - https://medium.com/@ankitashettya/collapsing-toolbar-in-android-using-androidx-jetpack-d54678ac4cbc 
* RelativeLayout vs ConstraintLayout - производительность ConstraintLayout лучше - https://stackoverflow.com/questions/37321448/differences-between-constraintlayout-and-relativelayout
* ConstraintLayout Barriers and Guidelines - https://stackoverflow.com/questions/47114672/what-is-difference-between-barrier-and-guideline-in-constraint-layout
* Сколько проходов по детям с вызовом метода onMeasure() выполняется во FrameLayout? - Один, так как FrameLayout не говорит детям, как вставать друг относительно друга
* Сколько проходов по детям с вызовом метода onMeasure() выполняется в LinearLayout? - Один, если нет weight. Два, если есть weight.
* По скорости отрисовки лэйауты выстраиваются следующим образом (от самой быстрой к медленной):
FrameLayout - LinearLayout - RelativeLayout - ConstraintLayout 



### Animation
* Виды анимации
* Анимация с помощью ConstraintSet



### Views
* View Lifecycle

https://proandroiddev.com/the-life-cycle-of-a-view-in-android-6a2c4665b95e

https://proandroiddev.com/android-custom-view-level-3-81e767c8cc75

* Custom Views - https://developer.android.com/guide/topics/ui/custom-components
* Какие методы надо переопределить в кастомном вью?
* View.invalidate() и requestLayout() - https://stackoverflow.com/questions/13856180/usage-of-forcelayout-requestlayout-and-invalidate
* View.onMeasure() - что такое measureSpec, как вычисляется размер вью - https://stackoverflow.com/questions/14493732/what-are-widthmeasurespec-and-heightmeasurespec-in-android-custom-views === https://developer.android.com/reference/android/view/View.MeasureSpec
* Какие требования предъявляются к методу onDraw() - https://developer.android.com/training/custom-views/custom-drawing
* View.onDraw() может вызываться чаще, чем 16 мс, на новых устройствах (120 Гц). Вообще частота отрисовки берется из внешней переменной и зависит от устройства.
* Методы onFinishInflate(), onSaveInstanceState(), onFocusChanged()
* Какие методы надо вызывать, если у View поменялись цвет и размер? - Если поменялся только цвет, то invalidate(), если только размер - то requestLayout(). Так как вызов requestLayout() не гарантирует вызова onDraw(), то если поменялись цвет и размер, то надо вызвать оба метода: invalidate() и requestLayout()
* Какие мтоды надо переопределить во ViewGroup, чтобы вычислить размер и разместить потомков? - onMeasure() и onLayout() 
* Canvas.save() restore() -  https://stackoverflow.com/questions/29040064/save-canvas-then-restore-why-is-that
* Touch Event - https://developer.android.com/training/gestures/viewgroup === https://www.vogella.com/tutorials/AndroidTouch/article.html
* View Binding - https://developer.android.com/topic/libraries/view-binding
* Data Binding (отличие от View Binding) - https://developer.android.com/topic/libraries/data-binding
* Data Binding Adapters - https://developer.android.com/topic/libraries/data-binding/binding-adapters
* RecyclerView: when onCreateViewHolder and onBindViewHolder are called?



### Notifications
* Notifications since Android 8 (Notification channel required)
* Actions in Notifications (for example reply) - https://developer.android.com/training/notify-user/build-notification



### Permissions
* Обычные и опасные разрешения
* Последовательность запроса Permissions - https://developer.android.com/training/permissions/requesting



### Multithreading in Android
* Which operations are prohibited to run on the main thread?
* What is the disadvantage of AsyncTask? - 1. Пересоздается при пересоздании активити, 2. Держит ссылку на активити, что влечет за собой memory leaks 
* Handler, Looper, HandlerThread - https://blog.mindorks.com/android-core-looper-handler-and-handlerthread-bd54d69fe91a
* Как устроена MessageQueue? - MessageQueue обеспечивает асинхронный механизм выполнения и позволяет запланировать выполнение операций вместо того, чтобы они терялись. Упорядочен по timestamp. Если вызываем Handler.postDelayed, то message записывается в очередь со значением currentTimeStamp + delay. Если в очереди остались только элементы, запланированные в будущем (у которых timestamp > currentTimeStamp), то лупер будет просто в цикле крутиться и не будет забирать элементы из очереди
* Как будет работать MessageQueue, если вызывать Handler.postDelayed() - Очередь упорядочивается по времени - https://stackoverflow.com/questions/27240015/does-postdelayed-cause-the-message-to-jump-to-the-front-of-the-queue
* Если в Handler передать Runnable, то где он будет храниться? - У Message есть поле callback типа Runnable, там и будет храниться (см исходники Handler и Message)
* Как с помощью Handler сделать таймер, срабатывающий точно каждую 1 секунду? - Есть метод Handler.postAtTime(), второй вариант - использовать Timer - https://stackoverflow.com/questions/23007641/correct-handler-postdelay-time
* Для чего нужен MainLooper? - На главном потоке абсолютно всё работает через MainLooper. Без него Java-приложение завершится сразу же после старта (после завершения метода main)



### Network
* HTTP methods - https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods
* HTTP vs WebSocket
* Socket vs WebSocket - https://stackoverflow.com/questions/4973622/difference-between-socket-and-websocket

https://www.geeksforgeeks.org/what-is-web-socket-and-how-it-is-different-from-the-http/#:~:text=WebSocket%3A%20WebSocket%20is%20bidirectional%2C%20a,ws%3A%2F%2F%20or%20wss%3A%2F%2F.&text=When%20the%20connection%20is%20established,channel%20until%20it%20is%20terminated.

https://stackoverflow.com/questions/14703627/websockets-protocol-vs-http

* What is JSON?
* How to set up a name of the serialized property different from the property name? (Use @SerializedName("name") annotation)
* How to exclude a property from the serialization? (mark property as transient (keyword in Java or annotation in Kotlin))
* The app starts crashing on network call. What can be wrong? (Network call on the main thread, not added <uses-permission android:name="android.permission.INTERNET" /> in the manifest)
* Последовательность работы с Retrofit: какие классы нужно создать и что в них нужно описать?
* Retrofit - what to do, if an app needs to interact with 2 different hosts? (create 2 different retrofit objects)
* How to append some parameter (for example "platform=android") to all network queries? (Use interceptors)
* Multipart передача данных
* Как в JSON передавать бинарные данные без использования Base64 - https://stackoverflow.com/questions/1443158/binary-data-in-json-string-something-better-than-base64
* How to load images? (Use Glide, Picasso or Fresco)
* GraphQL
* Protobuf, для чего файл proto?



### Data persistence
* Какие есть способы сохранить данные - shared preferences, db, file
* Shared preferences persist after app has been uninstalled. How to prevent it? (Add android:allowBackup="false" in the application in the manifest)



### Room
* Последовательность работы с Room: какие классы нужно создать и что в них нужно описать? - https://developer.android.com/training/data-storage/room
* What does @Entity annotation do?
* What is @PrimaryKey?
* Что такое индекс в SQL? - https://www.datacamp.com/community/tutorials/introduction-indexing-sql?utm_source=adwords_ppc&utm_campaignid=1455363063&utm_adgroupid=65083631748&utm_device=c&utm_keyword=&utm_matchtype=b&utm_network=g&utm_adpostion=&utm_creative=278443377095&utm_targetid=aud-392016246653:dsa-429603003980&utm_loc_interest_ms=&utm_loc_physical_ms=9047030&gclid=Cj0KCQjwlMaGBhD3ARIsAPvWd6jxN4Dh86nixmxgtpWlbxipHxNrFAwjlVBqy7m4DYtR94rB9_rQXjsaAv9dEALw_wcB
* How to select only different items from the db? (SELECT DISTINCT)
* The app starts crashing after new entity has been added. What I forgot to do? (Update database version, add migration)



### Dagger
* What is Dependency Injection?
* Преимущества Dependency Inversion (Dagger) - зависимости предоставляются извне - легко менять составные части объектов, Dagger берет на себя генерацию графа зависимостей, упрощается тестирование - в тестах вместо реальных объектов можно подсовывать замоканные
* Dependency Injection vs Service Locator - https://habr.com/ru/post/465395/
* Плюсы-минусы Dagger - Dagger берет на себя генерацию графа зависимостей, но в больших проектах генерится много кода и увеличивается время сборки из-за кодогенерации
* What is the purpose of @Inject annotation?
* Modules and Components
* Is it possible not to use Modules and how?
* Dagger в мультипроцессном приложении - в каждом процессе свой экземпляр Application, свой Dagger со своими инстансами
* Dagger @Binds vs @Provides - https://stackoverflow.com/questions/52586940/what-is-the-use-case-for-binds-vs-provides-annotation-in-dagger2
* Недостатки @Provides - @Provides генерит больше кода, чем @Binds. Поэтому по возможности лучше использовать @Binds, а @Provides используется, когда по сути у объекта нет конструктора и нужно использовать билдер. 
* Dagger @IntoSet - https://habr.com/ru/post/336414/
* Dagger subcomponents vs component dependencies - https://stackoverflow.com/questions/29587130/dagger-2-subcomponents-vs-component-dependencies
* Dagger Scopes
* Управление жизненным циклом компонентов



### Clean architecture
* Clean Architecture - https://habr.com/ru/company/mobileup/blog/335382/
* UseCases лучше разбивать на отдельные функции (под каждую функцию свой UseCase)
* Для чего нужна Clean Architecture? - Развязывание классов (отсутствие сильной связанности, возможность замены компонентов), тестопригодность, уменьшение порога входа в проект для новых разработчиков (все понимают, что на каждом слое находится)
* MVP
* MVVM
* MVI
* Как сделать презентер без Moxy?
 
https://startandroid.ru/ru/blog/473-mvp-na-primere-jekrana-s-pin-kodom.html 

https://www.raywenderlich.com/7026-getting-started-with-mvp-model-view-presenter-on-android



### Moxy
* How to organize application? (View, Presenter)
* Что такое очередь команд?
* Strategies



### Testing
* Когда вызываются @Before, @After
* Когда вызывается @BeforeClass
* Как выполнить юнит-тестирование класса, если он зависит от класса, обращающегося к сети? - Использовать Mockito для создания класса-заглушки
* Как в Espresso нажать на элемент списка



### Gradle
* What to do, if external dependency is not found? (Add appropriate repository into: allprojects { repositories {...} })
* implementation vs api (compile)? - При использовании api мы можем использовать внутренние зависимости библиотеки в нашем основном проекте - https://stackoverflow.com/questions/44413952/gradle-implementation-vs-api-configuration
* How to build slightly different applications from one project? (Use flavors)
* Gradle build type vs flavor - https://wajahatkarim.com/2018/04/difference-between-build-type-flavour-and-build-variant-in-android/
* Можем ли мы создать свой build type? - Можем - https://stackoverflow.com/questions/49286743/how-to-add-more-build-types-in-app-than-library/49288390
* How to make some part of the code run only in debug? (if (BuildConfig.DEBUG) {...} else {...})
* What is multidex?



### Other
* Getting geolocation
* Deep links



## Practice
* Problems and improvements in the provided code samples:

https://github.com/gpetuhov/AndroidInterview/blob/master/app/src/main/java/com/gpetuhov/androidinterviewcodesamples/Utils.kt

https://github.com/gpetuhov/AndroidInterview/blob/master/app/src/main/java/com/gpetuhov/androidinterviewcodesamples/Solid.kt

https://github.com/gpetuhov/AndroidInterview/blob/master/app/src/main/java/com/gpetuhov/androidinterviewcodesamples/MainActivity.kt

* How to implement a layout shown on the screenshot.



## Algorithm coding task
Требуется умение писать код на бумаге с первого раз без переписываний, дебажить в голове, проверять краевые условия, оценивать вычислительную сложность и потребление памяти в терминах O()

* In text editor: https://code.yandex-team.ru/ or https://codeshare.io/

OR

* HackerRank (LeetCode)

Примеры задач:
* Собрать стек из двух очередей
* Собрать очередь из двух стеков



## Android coding task
Task: download list of items from the server and display them on screen. How would you organize your code?

Example of Clean Architecture in Android: https://github.com/gpetuhov/AndroidFundamentals2021/tree/master/01-CleanArchitecture



## Reference
https://github.com/MindorksOpenSource/android-interview-questions
