# Android Interview Questions and Code Samples
Basic plan and some typical questions and code samples for Android interview.

Latest update: 2022.07.26

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

* Как между собой связаны Dependency Injection, Dependency Inversion, Inversion of Control? - https://medium.com/ssense-tech/dependency-injection-vs-dependency-inversion-vs-inversion-of-control-lets-set-the-record-straight-5dc818dc32d1



## Design Patterns
* Design Patterns: creational, behavioral, structural

https://habr.com/ru/company/vk/blog/325492/

https://habr.com/ru/post/210288/

* Which Design Patterns did you use in your projects?
* RecyclerView Adapter является ли реализацией паттерна Адаптер? - нет - https://stackoverflow.com/questions/41626980/are-android-adapters-an-example-of-adapter-design-pattern
* Подводные камни singleton - https://stackoverflow.com/questions/137975/what-are-drawbacks-or-disadvantages-of-singleton-pattern
* Примеры паттернов проектирования в Android SDK, Dagger, RxJava



## Git
* Gitflow
* Git merge vs rebase



## Java

https://github.com/enhorse/java-interview

* Где используется ключевое слово final? - константы, классы, методы
* Как запретить переопределение метода в потомках? - Пометить метод как final
* Модификаторы доступа в Java - public, protected, private, package private (когда нет никакого ключевого слова) - https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
* Как можно менять модификаторы доступа в потомках? - Можно расширять, но нельзя сужать - https://docs.oracle.com/javase/tutorial/java/IandI/override.html
* What is an interface? - https://www.baeldung.com/java-interfaces
* Существует ли множественное наследование (extends) в Java? Если да, то к чему оно применимо? - Множественное наследование не поддерживается в классах, но оно поддерживается в интерфейсах (интерфейс может экстендить несколько интерфейсов, класс может имплементить несколько интерфейсов) - https://javarush.ru/groups/posts/731-mnozhestvennoe-nasledovanie-v-java-kompozicija-v-sravnenii-s-nasledovaniem
* Отличие interface от abstract class - в интерфейсе все методы public, не может быть private, абстрактный класс может хранить состояние и может иметь конструктор
* ClassLoader, getClass - https://www.baeldung.com/java-classloaders
* Когда ClassLoader грузит класс - при первом обращении к классу
* Структура памяти в JVM - http://tutorials.jenkov.com/java-concurrency/java-memory-model.html
* Краткая история изменений Java Memory Model в Android - https://proandroiddev.com/collecting-the-garbage-a-brief-history-of-gc-over-android-versions-f7f5583e433c
* Где хранятся значения примитивных типов, а где объекты? - Примитивы и ссылки на объекты в стеке, а сами объекты в куче - https://ru.stackoverflow.com/questions/980439/%D0%92-%D0%BA%D0%B0%D0%BA%D0%BE%D0%B9-%D0%BE%D0%B1%D0%BB%D0%B0%D1%81%D1%82%D0%B8-%D0%BF%D0%B0%D0%BC%D1%8F%D1%82%D0%B8-%D1%85%D1%80%D0%B0%D0%BD%D1%8F%D1%82%D1%81%D1%8F-%D0%BF%D0%B5%D1%80%D0%B5%D0%BC%D0%B5%D0%BD%D0%BD%D1%8B%D0%B5-%D0%B2-java#:~:text=%D0%92%20Java%20%D0%BF%D1%80%D0%B8%D0%BC%D0%B8%D1%82%D0%B8%D0%B2%D1%8B%20%D0%B8%20%D1%81%D1%81%D1%8B%D0%BB%D0%BA%D0%B8,%D1%81%D1%82%D1%8D%D0%BA%D0%B5%2C%20%D0%B0%20%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%83%D1%87%D0%B5.
* Где будет размещено поле класса примитивного типа? - В куче
* Где будет храниться объект созданный внутри какого-нибудь метода? - Сам объект в куче, но ссылка на него - в стеке
* Garbage collection

https://java-online.ru/garbage-collection.xhtml

https://habr.com/ru/post/269621/

https://habr.com/ru/post/269707/

https://habr.com/ru/post/269863/

https://www.geeksforgeeks.org/garbage-collection-java/

* В какой момент Garbage Collector может собрать объект?
* Как GC поймет, что на объект никто не ссылается

https://www.dynatrace.com/resources/ebooks/javabook/how-garbage-collection-works/ 

https://stackoverflow.com/questions/27186799/what-are-gc-roots-for-classes 

https://www.yourkit.com/docs/java/help/gc_roots.jsp

* Что является root для Garbage Collection?
* Ссылочный граф
* Стратегии очистки памяти g1, serial, parallel
* В памяти находятся два объекта и ссылаются друг на друга, больше на них никто не ссылается. Соберет ли их GC? - да, это называется island of isolation
* Для чего нужен Object? - Объявляет ряд базовых методов, в том числе для организации многопоточности, также нужен для того, чтобы garbage collector мог собрать объекты
* Методы Object - https://www.geeksforgeeks.org/object-class-in-java/
* Object.clone() можно ли вызвать? - Нет, если не имплеменить Cloneable интерфейс - https://en.wikipedia.org/wiki/Clone_(Java_method)
* Object.finalize()

https://www.tutorialspoint.com/java/lang/object_finalize.htm#:~:text=finalize()%20is%20called%20by,or%20to%20perform%20other%20cleanup. 

https://www.baeldung.com/java-finalize

* Зачем нужны методы equals и hashcode
* Если переопределил equals, то надо ли переопределять hashcode? - надо
* Контракт между equals и hashcode - если equals true, то хешкоды равны. Обратное может не выполняться - если хешкоды равны, то equals не обязательно true, так как для разных объектов существует вероятность получить одинаковый хешкод (коллизия) - https://www.baeldung.com/java-equals-hashcode-contracts
* Как вычисляется hashcode в Dalvik (Android 4.4) - Адрес объекта >> 3 бита
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

* Зачем нужна PhantomReference, привести практический пример использования

https://javarush.ru/groups/posts/2291-osobennosti-phantomreference

https://developer.android.com/reference/java/lang/ref/PhantomReference#:~:text=Phantom%20references%20are%20most%20often,with%20the%20Java%20finalization%20mechanism.&text=Unlike%20soft%20and%20weak%20references,collector%20as%20they%20are%20enqueued. 

https://stackoverflow.com/questions/53822132/java-phantomreference-vs-finalize

https://o7planning.org/13697/java-phantomreference

* Практический пример использования PhantomReference в Android
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
* Какие еще бывают оценки сложности, кроме большое O?
 
- малое O описывает верхнюю границу, исключая точную оценку

- омега описывает нижнюю границу сложности

- тета описывает точную оценку сложности

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
* Как устроен HashSet под капотом? - это HashMap, у которой ключом является элемент множества, а значением константа

https://javarush.ru/groups/posts/2147-hashset-v-java

https://habr.com/ru/company/otus/blog/495032/

* TreeMap under the hood

https://javarush.ru/groups/posts/2584-osobennosti-treemap

https://www.geeksforgeeks.org/treemap-in-java/

https://www.baeldung.com/java-treemap

* Левоассоциативность (И, ИЛИ) - https://ru.wikipedia.org/wiki/%D0%9E%D1%87%D0%B5%D1%80%D1%91%D0%B4%D0%BD%D0%BE%D1%81%D1%82%D1%8C_%D0%BE%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B9
* Аннотации - что это? - https://www.baeldung.com/java-custom-annotation
* RetentionPolicy в аннотациях - https://www.java2novice.com/java-annotations/retention-policy/#:~:text=Description%3A,point%20annotation%20should%20be%20discarded.&text=Annotation%20with%20retention%20policy%20RUNTIME,pass%20the%20retention%20policy%20type.
* RetentionPolicy SOURCE, CLASS, RUNTIME
* Аннотации NotNull/Nullable - https://www.jetbrains.com/help/idea/nullable-and-notnull-annotations.html
* Как происходит кодогенерация?
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
* IntegerCache - https://www.geeksforgeeks.org/java-integer-cache/
* StringPool - https://www.baeldung.com/java-string-pool



## Generics
* Что такое Generics - https://habr.com/ru/company/sberbank/blog/416413/
* С какой версии Java появились дженерики? - Java 5
* Стирание типов - https://javarush.ru/groups/posts/2315-stiranie-tipov
* PECS - https://stackoverflow.com/questions/2723397/what-is-pecs-producer-extends-consumer-super
* Ковариантность (extends T), контрвариантность (super T), инвариантность (просто T)
* Можно сделать так: instanceOf List<String> - нельзя из-за стирания типов



## Multithreading

https://github.com/gpetuhov/MultithreadingTutorial

* Чем отличается асинхронность, многопоточность и конкурентность?
 
https://medium.com/swift-india/concurrency-parallelism-threads-processes-async-and-sync-related-39fd951bc61d
 
https://www.baeldung.com/cs/async-vs-multi-threading
 
https://codewala.net/2015/07/29/concurrency-vs-multi-threading-vs-asynchronous-programming-explained/ 

* Thread vs Runnable - https://medium.com/@bharatkulratan/difference-between-runnable-and-thread-in-java-aacced9dca44
* Which means of organizing multithreading do you know? (Java Thread, ExecutorService, Handler, AsyncTask, RxJava, Kotlin coroutines)
* ExecutorService

https://www.baeldung.com/java-executor-service-tutorial

* Какие состояния может иметь поток и каков смысл каждого состояния Thread.getState()
 
https://www.baeldung.com/java-thread-lifecycle
 
https://www.geeksforgeeks.org/lifecycle-and-states-of-a-thread-in-java/ 

* Race condition - точное определение
* synchronized vs volatile

https://www.baeldung.com/java-synchronized

https://stackoverflow.com/questions/3519664/difference-between-volatile-and-synchronized-in-java

* Поможет ли volatile от гонки? - нет - Почему не помогает?
 
https://www.javatpoint.com/volatile-keyword-in-java
 
https://www.baeldung.com/java-volatile-variables-thread-safety 

* Можно ли все переменные сделать volatile? - В зависимости от процессора volatile может дать увеличение времени из-за чтения не из кэша ядра, а из основной памяти - https://stackoverflow.com/questions/4633866/is-volatile-expensive
* synchronized vs static synchronized - https://stackoverflow.com/questions/6367885/difference-between-synchronizing-a-static-method-and-a-non-static-method
* Deadlock - что это и как бороться?

https://www.baeldung.com/java-deadlock-livelock

https://www.baeldung.com/java-dining-philoshophers

* Механизмы неблокирующей многопоточности 
* Как использовать tryLock, чтобы избежать deadlock? - https://www.baeldung.com/java-deadlock-livelock
* Synchronized vs Lock - https://www.geeksforgeeks.org/lock-framework-vs-thread-synchronization-in-java/ 
* Честная блокировка - https://blog.katastros.com/a?ID=01750-09f35317-998a-46e0-898f-90568ca53cdc 
* Является ли synchronized честной блокировкой? - нет - https://senior.ua/articles/mnogopotochnost-v-java-lekciya-3-blokirovki-i-klassy-sinhronizacii-potokov 
* Что такое атомарность? 
* Почему инкремент не атомарный? - http://java.msk.ru/%D0%BD%D0%B5-%D0%B0%D1%82%D0%BE%D0%BC%D0%B0%D1%80%D0%BD%D0%BE%D1%81%D1%82%D1%8C-i-volatile-%D0%B8-synchronized/
* Механизмы работы Atomic (CAS/FAA) - https://habr.com/ru/post/319036/
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
* Средства синхронизации потоков (семафор, фазер) - https://habr.com/ru/post/277669/ 
* Семафоры - CountDownLatch, CyclicBarrier, Phaser
 
https://www.baeldung.com/java-semaphore
 
https://www.baeldung.com/java-countdown-latch
 
https://www.baeldung.com/java-cyclic-barrier
 
https://www.baeldung.com/java-phaser 

* CountDownLatch vs CyclicBarrier - https://www.baeldung.com/java-cyclicbarrier-countdownlatch
* Для чего появился Phaser? - https://habr.com/ru/post/117185/ 
* Семафоры, мониторы - https://www.baeldung.com/cs/monitor
* Mutex
 
https://javarush.ru/groups/posts/2174-v-chem-raznica-mezhdu-mjhjuteksom-monitorom-i-semaforom
 
https://www.baeldung.com/java-mutex 

* Object wait(), notify(), notifyAll() - https://howtodoinjava.com/java/multi-threading/wait-notify-and-notifyall-methods/
* notify vs notifyAll
 
https://stackoverflow.com/questions/37026/java-notify-vs-notifyall-all-over-again
 
https://www.geeksforgeeks.org/difference-between-notify-and-notifyall-in-java/

* Какие два метода класса Object можно использовать для реализации простого сценария producer / consumer? - https://www.baeldung.com/java-producer-consumer-problem
* Почему потоки создаются долго (что при этом происходит)? - https://stackoverflow.com/questions/5483047/why-is-creating-a-thread-said-to-be-expensive
* Разница между synchronized и concurrent collections - https://javarevisited.blogspot.com/2016/05/what-is-difference-between-synchronized.html#axzz7ZSljBC9o 
* Synchronized collections - https://www.baeldung.com/java-synchronized-collections
* Concurrent collections (появились в Java 5) - https://www.developer.com/design/an-introduction-to-concurrent-collection-apis-in-java/
* Почему Thread.stop() deprecated - https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/threadPrimitiveDeprecation.html#:~:text=stop%20deprecated%3F,monitors%20that%20it%20has%20locked.&text=Unlike%20other%20unchecked%20exceptions%2C%20ThreadDeath,his%20program%20may%20be%20corrupted.
* Способы остановки потока - https://www.baeldung.com/java-thread-stop
* Как правильно остановить поток в Java, не вызывая метода Thread.stop(), так как он deprecated? - https://stackoverflow.com/questions/10961714/how-to-properly-stop-the-thread-in-java
* Есть ли у enum подводные камни в многопоточке? - нет - https://www.geeksforgeeks.org/advantages-and-disadvantages-of-using-enum-as-singleton-in-java/#:~:text=Creation%20of%20Enum%20instance%20is,some%20line%20of%20code%20enum.
* Что такое Happens Before? - https://www.geeksforgeeks.org/happens-before-relationship-in-java/#:~:text=Happens%2Dbefore%20is%20not%20any,code%20that%20produces%20incorrect%20output. 
* Дефолтный приоритет нового потока в Java и его аналог Linux
 
https://www.baeldung.com/java-thread-priority 
 
https://medium.com/@vikas.singh_67409/deep-dive-into-thread-priority-in-java-be1a5da30a34
* Starvation и LiveLock - https://www.baeldung.com/cs/deadlock-livelock-starvation
* sleep vs wait - https://www.geeksforgeeks.org/difference-between-wait-and-sleep-in-java/ 
* Что произойдет, если в run() выбросить исключение? - https://aozturk.medium.com/how-to-handle-uncaught-exceptions-in-java-abf819347906
* Как обрабатывать InterruptedException? - https://www.baeldung.com/java-interrupted-exception
* Java Util Concurrent (JUC) - https://habr.com/ru/company/luxoft/blog/157273/ 
* Свойства ordering, visibility, atomicity, happens-before, mutual exclusion на примере volatile - http://www.duct-tape-architect.ru/?p=294#14__ordering_visibility_atomicity_happens-before_mutual_exclusion___volatile_AtomicInteger_synchronize
* BlockingQueue - https://www.baeldung.com/java-blocking-queue
 


## Kotlin
* What are the advantages of Kotlin?
* Как разрешить переопределение метода в потомках? - Пометить метод как open
* Any, Unit, Nothing - https://gb.ru/posts/razbiraemsya-v-tipah-kotlin-unit-nothing-any-i-null
* Класс Any - назначение, методы класса (equals, hashCode, toString) - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/ 
* Как связаны Kotlin Any и Java Object? - https://stackoverflow.com/questions/38761021/does-any-object
* Как Any используется в nullability и multiplatform? 
* Класс Nothing - это null нет? - нет, Nothing - это наследник всех классов в Kotlin, он описывает функции, которые могут ничего не вернуть (если функция кидает исключение, то она возвращает Nothing). А Nothing? уже может быть null. - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing.html
* Как Nothing может являться сабклассом любого объекта? - https://the-cogitator.com/posts/blog/2018/06/29/the-nature-of-nothing-in-kotlin.html 
* Класс Unit - это аналог void в Java - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/
* Unit vs Nothing - https://stackoverflow.com/questions/55953052/kotlin-void-vs-unit-vs-nothing 
* Как переопределить finalize? - https://kotlinlang.org/docs/java-interop.html#finalize 
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
* Типы делегатов - property, interface 
* Property delegates
 
https://medium.com/nuances-of-programming/%D0%B4%D0%B5%D0%BB%D0%B5%D0%B3%D0%B0%D1%82%D1%8B-%D0%B2-kotlin-%D0%B4%D0%BB%D1%8Fandroid-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D1%83%D0%B9%D1%82%D0%B5-%D1%81%D0%B8%D0%BB%D1%83-%D0%B4%D0%B5%D0%BB%D0%B5%D0%B3%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D1%85-%D1%81%D0%B2%D0%BE%D0%B9%D1%81%D1%82%D0%B2-%D0%B2-%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B5-%D0%BF%D0%BE%D0%B4-android-ca4d88d42800
 
https://kotlinlang.org/docs/delegation.html#overriding-a-member-of-an-interface-implemented-by-delegation

https://kotlinlang.org/docs/delegated-properties.html#property-delegate-requirements
 
* Delegates - как там реализована потокобезопасность?
 
https://www.codementor.io/@packt/delegated-properties-in-kotlin-kqda9rze4
 
https://medium.com/androiddevelopers/built-in-delegates-4811947e781f

* Interface delegates - https://medium.com/@Joseph82/interface-delegation-in-kotlin-1404dfcd9167 
* inline functions - https://medium.com/android-news/inline-noinline-crossinline-what-do-they-mean-b13f48e113c2
* crossinline
* Можно ли узнать тип дженерика в inline функции? - только если сделать reified parameters - https://stackoverflow.com/questions/33146160/how-to-check-generic-type-in-kotlin
* reified type parameters (речь только про функции, классы не могут иметь reified полей) - https://kotlinlang.org/docs/inline-functions.html#reified-type-parameters
* noinline - https://kotlinlang.org/docs/inline-functions.html
* Байткод inline, crossinline, noinline

https://www.baeldung.com/kotlin/inline-functions

https://www.baeldung.com/kotlin/crossinline-vs-noinline

* tailrec - преобразует tail recursion метод в метод с циклом - https://kotlinlang.org/docs/functions.html#tail-recursive-functions
* infix functions - https://kotlinlang.org/docs/functions.html#infix-notation
* Может ли infix функция содержать дефолтные параметры - нет
* Как сделаны под капотом extension functions - это static методы - https://moshenskyi.medium.com/kotlin-under-the-hood-extension-functions-1d61fabdf631
* Extension functions - существует мнение, что это антипаттерн, им легко злоупотреблять и тяжело тестировать
* Всегда ли extension functions статические?
* Extension functions во что компилируются и как их использовать из Java - https://stackoverflow.com/questions/28294509/accessing-kotlin-extension-functions-from-java 
* Nested functions, во что компилируются - https://discuss.kotlinlang.org/t/how-are-functions-inside-functions-translated/2785 
* Литералы - https://kotlinlang.org/docs/basic-types.html#literal-constants 
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
* Разница между Java stream и Kotlin sequence 
* Подводный камень sequence - на каждый шаг создается лямбда, поэтому для малого количества элементов выгоднее использовать обычные коллекции - https://typealias.com/guides/when-to-use-sequences/
* Kotlin SAM - https://kotlinlang.org/docs/fun-interfaces.html#sam-conversions
* Есть ли в Kotlin checked exceptions, как в Java? - Нет. Аннотация @Throws нужна только если метод будет вызван из Java кода
* Kotlin scope functions (let, run, apply, also, with) - https://kotlinlang.org/docs/scope-functions.html
* Иерархия коллекций в Kotlin
* Немутабельные и мутабельные коллекции в Kotlin и Java - в Kotlin под капотом немутабельной коллекции лежит мутабельная, поэтому list.toMutableList() += 5 сработает, а в Java - нет (см. Collection.unModifiableList())
* Kotlin @Synchronized
* typealias, что это, во что компилируется - https://www.baeldung.com/kotlin/type-aliases
* @JvmStatic - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/ 



## RxJava

https://github.com/gpetuhov/RxJavaTutorial

* What design pattern does RxJava implement? (Observer Pattern)
* Типы Observable - https://medium.com/mindorks/rxjava-types-of-observables-404d75605e35
* Difference between cold and hot observables.
* ConnectableObservable - это холодный observable, начинает эмитить только после вызова метода connect() - http://reactivex.io/RxJava/javadoc/rx/observables/ConnectableObservable.html
* Какой метод вызвать для начала эмита у горячего Observable - метод ConnectableObservable.connect() - https://medium.com/tompee/rxjava-ninja-hot-and-cold-observables-19b30d6cc2fa
* Как преобразовать холодный Observable в горячий - Вызвать publish() - https://medium.com/tompee/rxjava-ninja-hot-and-cold-observables-19b30d6cc2fa
* Как преобразовать горячий Observable в холодный - Вызвать defer() - https://stackoverflow.com/questions/34030793/transform-a-hot-observable-to-a-cold-observable
* Отличие just от from - from эмитит каждый элемент отдельно, а just один раз все сразу - https://stackoverflow.com/questions/30819349/rxjava-just-vs-from#:~:text=from%20works%20mostly%20with%20data,array%20item%20or%20integer%20item. 
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
* Что произойдет если при применении оператора zip упадет сначала один поток данныхх, а затем второй? - Произойдет exception, подписка onError не будет отработана второй раз
* Difference between flatMap(), concatMap() and switchMap() - https://medium.com/appunite-edu-collection/rxjava-flatmap-switchmap-and-concatmap-differences-examples-6d1f3ff88ee0
* Пример использования switchMap - поисковая строка (каждый последующий символ отменяет предыдущий запрос в сеть)
* Difference between throttleFirst() and debounce() (aka throttleWithTimeout())
* Custom operator - https://www.baeldung.com/rxjava-custom-operators
* Тестирование rx цепочек, проблема одного потока, TestSubscriber, TestObserver
 
https://www.baeldung.com/rxjava-testing
 
https://medium.com/@vanniktech/testing-rxjava-code-made-easy-4cc32450fc9a
 
* Переопределение шедулера с помощью RxJavaPlugins и введение абстракции над шедулерами - https://stackoverflow.com/questions/43285064/rxjava-2-overriding-io-scheduler-in-unit-test 



## Kotlin coroutines
* RxJava vs Coroutines - https://stackoverflow.com/questions/42066066/how-kotlin-coroutines-are-better-than-rxkotlin
* Отличие пулов потоков в RxJava и Coroutines - https://medium.com/capital-one-tech/coroutines-and-rxjava-an-asynchronicity-comparison-part-6-threading-2aa5e9c52c94
* Coroutine Scope, Coroutine Context - https://elizarov.medium.com/coroutine-context-and-scope-c8b255d59055
* Обработка исключений в корутинах 
* CoroutineExceptionHandler - https://kotlinlang.org/docs/exception-handling.html
* launch vs async - https://stackoverflow.com/questions/46226518/what-is-the-difference-between-launch-join-and-async-await-in-kotlin-coroutines
* runBlocking - https://habr.com/ru/company/dododev/blog/541650/ 
* Корутины под капотом - https://rohit.fyi/blog/kotlin-coroutines-under-the-hood-part-1/
* Нужна ли синхронизация при использовании корутин? - Нужна - https://kotlinlang.org/docs/shared-mutable-state-and-concurrency.html
* Во что компилируется suspend функция? - https://medium.com/androiddevelopers/the-suspend-modifier-under-the-hood-b7ce46af624f
* Синхронизация в корутинах
 
https://kotlinlang.org/docs/shared-mutable-state-and-concurrency.html
 
https://kt.academy/article/cc-state
 
* Что будет, если использовать synchronized в корутинах?
 
https://blog.danlew.net/2020/01/28/coroutines-and-java-synchronization-dont-mix/
 
https://jacquessmuts.github.io/post/coroutine_sync_mutex/ 



## Android
### Low level details
* JVM vs Dalvik vs ART

https://habr.com/ru/post/513928/
 
https://medium.com/programming-lite/android-core-jvm-dvm-art-jit-aot-855039a9a8fa
 
https://russianblogs.com/article/1180831184/ 

* Разница между hotspot jvm, dalvik и art - https://chowdera.com/2022/04/202204110617280331.html
* DEX format - https://stackoverflow.com/questions/36356330/difference-between-bytecode-in-class-file-and-that-of-dex-file
* What is a compiler?

https://habr.com/ru/company/mailru/blog/451894/

https://habr.com/ru/post/99162/

* JIT, AOT
 
https://source.android.com/devices/tech/dalvik/jit-compiler
 
https://stackoverflow.com/questions/40336455/difference-between-aot-and-jit-compiler-in-the-art
 
https://itsobes.ru/JavaSobes/v-chyom-raznica-mezhdu-interpretatorom-aot-i-jit-kompilyatorom/ 

* Из какого кода в какой компилируется JIT и AOT компиляторами? - из java bytecode в машинный 
 
https://habr.com/ru/company/skillbox/blog/441798/
 
https://ru.stackoverflow.com/questions/1033427/%D0%9A%D0%B0%D0%BA-%D0%BF%D1%80%D0%BE%D0%B8%D1%81%D1%85%D0%BE%D0%B4%D0%B8%D1%82-%D0%BA%D0%BE%D0%BC%D0%BF%D0%B8%D0%BB%D1%8F%D1%86%D0%B8%D1%8F-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B9-%D0%BD%D0%B0-android
  
* Можно ли разрабатывать под Андроид на Python, Scala или других языках? - Можно, если есть возможность компиляции языка в Java байт-код

https://tproger.ru/translations/python-development-on-android/

https://habr.com/ru/post/327782/

* Как R8 может исходный код напрямую преобразовать в DEX?
* OOM Killer (Out of memory killer)
* Можно ли в Android запустить jar? - Android uses the Dalvik VM, whereas you need the Java VM to run a jar-file. So no, you can't run a jar-file on android - https://stackoverflow.com/questions/12905012/running-an-executable-jar-in-android - но при этом можно подключить к приложению jar-библиотеку - https://stackoverflow.com/questions/25660166/how-to-add-a-jar-in-external-libraries-in-android-studio 
* Как перехватить все runtime исключения? - https://stackoverflow.com/questions/32229170/catch-all-possible-android-exception-globally-and-reload-application === https://stackoverflow.com/questions/3171394/using-global-exception-handling-with-setuncaughtexceptionhandler-and-toast
* Как выглядит cold путь запуска приложения

https://habr.com/ru/post/521522/ 

 https://medium.com/android-news/android-application-launch-explained-from-zygote-to-your-activity-oncreate-8a8f036864b
 
https://proandroiddev.com/android-internals-101-how-android-os-starts-you-application-e1c98a014c05 

* Zygote
* ActivityTaskManager 
* Уровни архитектуры Android

Application - уровень приложений

Application Framework - уровень фреймворков для работы приложений (так же называется каркас): View, ContentProviders, ResourceManager, ActivityManager и т.д.

Library - уровень с/с++ библиотек для работы разных компонентов ос, например System C Library (libc для linux), MediaLibraries, SurfaceManager, SQLite, SGL, SSL и т.д.

Android Runtime - среда выполнения, набор утилит для ядра и виртуальная машина (Dalvik, Art)

Linux Kernel - уровень ядра Linux, основные службы по работе с железом находятся тут, например IPC Driver, Power Manager и другие
 
https://data-flair.training/blogs/android-architecture/#:~:text=Now%2C%20we%20will%20start%20with,Android%20runtime%2C%20and%20System%20applications.
 
https://developer.android.com/guide/platform
 
https://www.guru99.com/android-architecture.html 
 
* Детали ОС Android:
 
https://habr.com/ru/company/solarsecurity/blog/334796/
 
https://habr.com/ru/company/solarsecurity/blog/338292/
 
https://habr.com/ru/company/solarsecurity/blog/338494/
 
https://habr.com/ru/company/solarsecurity/blog/427431/ 

* Можно ли запустить компоненты разных приложений в одном процессе? - да, это дефолтное поведение (например в случае Intent.ACTION_VIEW), но можно вообще сделать разные приложения, работающие в одном процессе - https://stackoverflow.com/questions/17664090/can-multiple-android-applications-share-a-single-process-and-application-context
* Можно ли запустить компоненты одного приложения в разных процессах? - да
* AIDL
 
https://habr.com/ru/post/537660/
 
https://developer.android.com/guide/components/aidl 
 
 

### Basics
* Android components and what are they used for (Activity, Service, Content Provider, Broadcast Receiver)
* Почему Application не компонент? - Потому что это не точка входа в приложение
* Как Андроид компоненты влияют на приоритет процесса - https://medium.com/androiddevelopers/who-lives-and-who-dies-process-priorities-on-android-cb151f39044f
* Project structure of an Android application (modules, manifest, source, res, assets, Gradle scripts)
* What is AndroidManifest.xml?
* Состав манифеста: permissions, intent filters, features, meta 
* Манифест многомодульного проекта, manifest merge - https://android-doc.github.io/tools/building/manifest-merge.html 
* Context - https://developer.android.com/reference/android/content/Context
* Context types. Difference between Application Context and Activity Context

https://stackoverflow.com/questions/4128589/difference-between-activity-context-and-application-context 

https://medium.com/@banmarkovic/what-is-context-in-android-and-which-one-should-you-use-e1a8c6529652

* Отображение AlertDialog из app context - https://nhancv.medium.com/android-show-dialog-without-activity-context-94661d48400f
* raw vs assets - что где хранить, отличия? (в raw доступ через R.raw.id, в assets через asset manager) - https://stackoverflow.com/questions/5583608/difference-between-res-and-assets-directories
* Что такое утечки памяти, как они возникают, как их диагностировать (профилировщик, Leak Canary)?
 
https://www.raywenderlich.com/4690472-memory-leaks-in-android
 
https://dropbox.tech/mobile/detecting-memory-leaks-in-android-applications
 
https://proandroiddev.com/everything-you-need-to-know-about-memory-leaks-in-android-d7a59faaf46a 
 
* В чем проблема утечки памяти в случае активити?
* На основе какого принципа основана Leak Canary?
 
http://developer.alexanderklimov.ru/android/debug/leakcanary.php
 
https://russianblogs.com/article/80601561279/
 
https://developpaper.com/android-leakcanary-memory-leak-detection-principle/ 
 
* Способы отрисовать интерфейс. Можно ли отобразить вью без активити/фрагмента? - да, с помощью WindowManager - https://levelup.gitconnected.com/add-view-outside-activity-through-windowmanager-1a70590bad40 



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
* Методы Activity onContentChanged, onPostCreate, onPostResume, onAttachedToWindow, onUserInteraction, onWindowFocusChanged, onDetachedFromWindow 
* Жизненный цикл Activity с retain фрагментом - https://habr.com/ru/post/280586/ 
* Что такое Window?

https://developer.android.com/reference/android/view/Window

https://stackoverflow.com/questions/9451755/what-is-an-android-window

* Как получить Window - Activity.getWindow() - https://stackoverflow.com/questions/7378644/how-to-call-getwindow-outside-an-activity-in-android
* Window DecorView - https://stackoverflow.com/questions/23276847/what-is-an-android-decorview
* Activity launch modes 

https://developer.android.com/guide/components/activities/tasks-and-back-stack

https://habr.com/ru/company/otus/blog/493802/
 
https://medium.com/mobile-app-development-publication/android-activity-launchmode-made-simple-df7f0ec5e037

* Два способа как задать launch mode? - манифест и intent flags
* Общая особенность singleTask и singleInstance - эти режимы очистят активити стоящие сверху заданной активити
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
* Ограничения на размер Bundle - зависит от устройства, но самое распространенное значение 1 МБ - https://stackoverflow.com/questions/8552514/is-there-any-limit-of-bundle-in-android
* С чем связано ограничение на размер Bundle? - https://stackoverflow.com/questions/8552514/is-there-any-limit-of-bundle-in-android#:~:text=It%20depends%20on%20the%20purpose,save%20the%20state%20of%20activities. 
* Serializable vs Parcelable - https://stackoverflow.com/questions/3323074/android-difference-between-parcelable-and-serializable
* Проблемы Serializable - 1. Рефлексия, 2. Если поле в Serializable классе будет не Serializable, то при десериализации оно будет просто null (а в случае Parcelable компилятор сразу это подсвечивает)
* Как под капотом устроен Serializable? - https://www.infoworld.com/article/2072752/the-java-serialization-algorithm-revealed.html 
* Когда использовать Serializable? - https://proandroiddev.com/serializable-or-parcelable-why-and-which-one-17b274f3d3bb
* Всегда ли оправдано применение Parcelable? - Только при большом количестве операций в единицу времени (1000 и больше), а также в IPC (Binder, AIDL)
* Можно ли использовать Parcelable для записи на диск? - нет - https://guides.codepath.com/android/using-parcelable
* Как под капотом устроен Parcelable?  
* Difference between implicit and explicit intents.
* How to open url in browser?

```
val uri = Uri.parse(websiteUrl)
val intent = Intent(Intent.ACTION_VIEW, uri)
```

* Pending intent
* How to make an activity start on some intent from other apps? (Add intent filter in the manifest)
* Механизм резолюшна интент-фильтра (последовательность действий, что с чем сравнивается) - https://www.androidcookbook.info/application-development/how-android-resolves-intent-filters.html
* Как в интент-фильтре реагировать только на определенные интенты? - Action, category, data (scheme, mimetype) - https://developer.android.com/guide/components/intents-filters 
* Can I access data in another application's content provider via intent? (No, use ContentResolver instead)



### Fragments
* What is the purpose of Fragments? Limitations (2-3 fragments per activity)
* Способы добавления фрагмента в активити - Вручную с помощью FragmentManager, прописать жестко фрагмент в макете (но под капотом все равное будет использован FragmentManager), Jetpack Navigation, Cicerone 
* FragmentManager - https://developer.android.com/guide/fragments/fragmentmanager
* Как FragmentManager управляет жизненным циклом фрагмента? - https://developer.android.com/guide/fragments/lifecycle 
* FragmentTransaction разница методов add() и replace()
 
https://rohitksingh.medium.com/difference-between-add-and-replace-in-fragmenttransaction-in-android-87289b00824f
 
https://stackoverflow.com/questions/18634207/difference-between-add-replace-and-addtobackstack 

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
* Headless fragments
 
https://luboganev.dev/blog/headless-fragments/
 
https://stackoverflow.com/questions/22799759/what-is-the-difference-between-a-headless-fragment-and-a-service-in-android
 
https://medium.com/@ali.muzaffar/use-headless-fragment-for-android-m-run-time-permissions-and-to-check-network-connectivity-b48615f6272d 
 
* Можно ли заинжектить что-то в конструктор фрагмента? - да, с помощью FragmentFactory - https://medium.com/@diousk507/using-fragmentfactory-with-dagger-2-c3ec136c860d



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
* Когда вызывается onCreate()? - Перед вызовом onCreate() у Application 



### ViewModel
* Google ViewModel - это вьюмодел в паттерне MVVM? - Нет, это просто способ пережить уничтожение активити. Чтобы ViewModel стала вьюмоделом из MVVM, надо подписать вью на вьюмодел (например, с помощью LiveData)
* Что будет, если во ViewModel объявить конструктор с параметрами - будет RuntimeException при инициализации вьюмодела
* Как этого избежать - сделать ViewModel Factory
* ViewModelFactory - https://developer.android.com/codelabs/kotlin-android-training-view-model#7
* Какие встречаются проблемы в ViewModel? - LiveData сохраняет последнее событие и отправляет его заново после пересоздания активити (например, сообщение об ошибке будет отправлено заново)
* LiveData value и postValue - в чем разница? - https://stackoverflow.com/questions/51299641/difference-of-setvalue-postvalue-in-mutablelivedata
* Как трансформировать LiveData - https://proandroiddev.com/livedata-transformations-4f120ac046fc
* Жизненный цикл ViewModel - https://developer.android.com/topic/libraries/architecture/viewmodel
* Жизненный цикл LiveData
* Как новая активити после пересоздания узнает о том, какую вьюмодель использовать? - https://proandroiddev.com/viewmodel-magic-revealed-330476b5ab27



### Layouts
* Difference between LinearLayout and ConstraintLayout
* CoordinatorLayout - https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout
* Collapsing toolbar - https://medium.com/@ankitashettya/collapsing-toolbar-in-android-using-androidx-jetpack-d54678ac4cbc 
* RelativeLayout vs ConstraintLayout - производительность ConstraintLayout лучше - https://stackoverflow.com/questions/37321448/differences-between-constraintlayout-and-relativelayout
* Какие проблемы решает ConstraintLayout 
* ConstraintLayout Barriers and Guidelines - https://stackoverflow.com/questions/47114672/what-is-difference-between-barrier-and-guideline-in-constraint-layout
* Сколько проходов по детям с вызовом метода onMeasure() выполняется во FrameLayout? - Один, так как FrameLayout не говорит детям, как вставать друг относительно друга
* Сколько проходов по детям с вызовом метода onMeasure() выполняется в LinearLayout? - Один, если нет weight. Два, если есть weight.
* По скорости отрисовки лэйауты выстраиваются следующим образом (от самой быстрой к медленной):
FrameLayout - LinearLayout - RelativeLayout - ConstraintLayout 



### Animation
* Виды анимации - https://www.geeksforgeeks.org/animation-in-android-with-example/
* Анимация с помощью ConstraintSet



### Views
* View Lifecycle

https://proandroiddev.com/the-life-cycle-of-a-view-in-android-6a2c4665b95e

https://proandroiddev.com/android-custom-view-level-3-81e767c8cc75

* Custom Views
 
https://developer.android.com/guide/topics/ui/custom-components
 
https://medium.com/@Zielony/guide-to-android-custom-views-basics-7dfed4583841
 
https://medium.com/@Zielony/guide-to-android-custom-views-constructors-df47476e334c
 
https://medium.com/@Zielony/guide-to-android-custom-views-attributes-ab28de3e54b7 

* Какие методы надо переопределить в кастомном вью?
* View.invalidate() и requestLayout() - https://stackoverflow.com/questions/13856180/usage-of-forcelayout-requestlayout-and-invalidate
* Всегда ли вызывается onLayout? - У ViewGroup новое измерение дочерних view не гарантируется. Вместо этого используются закэшированные значения. Поэтому используют метод forceLayout()
* Что такое forceLayout() и когда он нужен? - https://itsobes.ru/AndroidSobes/dlia-chego-nuzhen-metod-view-forcelayout/
* View.onMeasure() - что такое measureSpec, как вычисляется размер вью - https://stackoverflow.com/questions/14493732/what-are-widthmeasurespec-and-heightmeasurespec-in-android-custom-views === https://developer.android.com/reference/android/view/View.MeasureSpec
* Статические методы MeasureSpec - https://developer.android.com/reference/android/view/View.MeasureSpec 
* Какие требования предъявляются к методу onDraw() - https://developer.android.com/training/custom-views/custom-drawing
* View.onDraw() может вызываться чаще, чем 16 мс, на новых устройствах (120 Гц). Вообще частота отрисовки берется из внешней переменной и зависит от устройства.
* В чем проблема выделения памяти в onDraw? - https://stackoverflow.com/questions/27717093/drawallocation-memory-allocations-within-drawing-code 
* Методы onFinishInflate(), onSaveInstanceState(), onFocusChanged()
* Какие методы надо вызывать, если у View поменялись цвет и размер? - Если поменялся только цвет, то invalidate(), если только размер - то requestLayout(). Так как вызов requestLayout() не гарантирует вызова onDraw(), то если поменялись цвет и размер, то надо вызвать оба метода: invalidate() и requestLayout()
* Какие методы надо переопределить во ViewGroup, чтобы вычислить размер и разместить потомков? - onMeasure() и onLayout() 
* Как сохранить состояние кастомной вьюхи?
 
https://www.netguru.com/blog/how-to-correctly-save-the-state-of-a-custom-view-in-android
 
https://stackoverflow.com/questions/3542333/how-to-prevent-custom-views-from-losing-state-across-screen-orientation-changes 

* На каком треде выполняется сохранения/восстановление состояния в Bundle? - main thread - https://developer.android.com/topic/libraries/architecture/saving-states 
* Canvas.save() restore() -  https://stackoverflow.com/questions/29040064/save-canvas-then-restore-why-is-that
* Touch Event - https://developer.android.com/training/gestures/viewgroup === https://www.vogella.com/tutorials/AndroidTouch/article.html
* View Binding - https://developer.android.com/topic/libraries/view-binding
* Data Binding (отличие от View Binding) - https://developer.android.com/topic/libraries/data-binding
* Data Binding Adapters - https://developer.android.com/topic/libraries/data-binding/binding-adapters
* RecyclerView: when onCreateViewHolder and onBindViewHolder are called?
* Как сделать, чтобы в RecyclerView менялся только один TextView только в одном элементе? - использовать DiffUtils и payloads - https://www.valueof.io/blog/recyclerview-diffutil-change-payloads
* Способы генерации id вьюхи - https://stackoverflow.com/questions/1714297/android-view-setidint-id-programmatically-how-to-avoid-id-conflicts 
* Как создать custom attributes? - https://developer.android.com/training/custom-views/create-view
* Зачем нужен оверрайд конструктора вьюхи? - https://stackoverflow.com/questions/9195713/do-i-need-all-three-constructors-for-an-android-custom-view 
* Темы и стили - https://developer.android.com/guide/topics/ui/look-and-feel/themes
* Что такое overdray и инструменты его обнаружения - https://medium.com/android-news/reduce-overdraw-from-your-android-application-6cf15f4aa85f 
* ImageView fit_center и center_inside - https://stackoverflow.com/questions/11353973/whats-the-difference-between-center-inside-and-fit-center-scale-types
* Как у ImageView сделать соотношение сторон 3:4 - https://betterprogramming.pub/aspect-ratio-with-constraint-layout-with-constraintdimensionratio-d55828ec4aae 



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
* Почему Looper.loop() не вызывает ANR (всегда ли там гоняется вечный цикл)?
 
https://blog.karatos.in/a?ID=01000-2fa77d6e-e7da-4365-b7c6-7ddddc6fd826
 
https://blog.krybot.com/a?ID=00400-4706c861-f02b-4e61-aee5-6b07b1eeb5dc 



### Network
* HTTP methods - https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods
* Структура HTTP запроса (метод, хедер, тело)
* Хедер - структура (key-value) и назначение 
* HTTP vs WebSocket
* Socket vs WebSocket - https://stackoverflow.com/questions/4973622/difference-between-socket-and-websocket

https://www.geeksforgeeks.org/what-is-web-socket-and-how-it-is-different-from-the-http/#:~:text=WebSocket%3A%20WebSocket%20is%20bidirectional%2C%20a,ws%3A%2F%2F%20or%20wss%3A%2F%2F.&text=When%20the%20connection%20is%20established,channel%20until%20it%20is%20terminated.

https://stackoverflow.com/questions/14703627/websockets-protocol-vs-http

* OkHttp Websocket
 
https://ssaurel.medium.com/learn-to-use-websockets-on-android-with-okhttp-ba5f00aea988
 
https://square.github.io/okhttp/4.x/okhttp/okhttp3/-web-socket/ 

* Scarlet - https://github.com/Tinder/Scarlet
* SignalR 
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
* Другие библиотеки для работы с сетью, кроме Retrofit - Volley, Fuel
* Как установить соединение без использования библиотек? - HttpUrlConnection
 
https://stackoverflow.com/questions/8654876/http-get-using-android-httpurlconnection
 
https://developer.android.com/reference/java/net/HttpURLConnection
 
* Другие протоколы прикладного уровня OSI, кроме HTTP - SMTP, POP и др
* Разница между REST и gRPC
 
https://www.baeldung.com/rest-vs-grpc
 
https://habr.com/ru/post/565020/

 
 
### WorkManager
* Какие проблемы решает? - https://developer.android.com/topic/libraries/architecture/workmanager
* Гарантирует ли выполнение точно по времени? - нет - https://stackoverflow.com/questions/50299814/how-to-schedule-notifications-using-workmanager
* Может ли система снять с выполнения задачи WorkManager?
* В каком потоке выполняются задачи WorkManager? - background по умолчанию - https://developer.android.com/topic/libraries/architecture/workmanager/advanced/threading
* Как из WorkManager показать прогресс в активити? 



### Data persistence
* Какие есть способы сохранить данные - shared preferences, db, file
* Shared preferences persist after app has been uninstalled. How to prevent it? (Add android:allowBackup="false" in the application in the manifest)
* Особенности и различия разных типов БД (sql, nosql, строковые, колоночные) 



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
* Можно ли делать модуль в модуле? - да
* Можно ли делать компонент в компоненте?
* Можно ли делать компонент в модуле?
* Можно ли делать модуль в компоненте? 
* Dagger в многомодульном приложении
 
https://developer.android.com/training/dependency-injection/dagger-multi-module
 
https://www.raywenderlich.com/12275430-dagger-in-multi-module-clean-applications

* Dagger в мультипроцессном приложении - в каждом процессе свой экземпляр Application, свой Dagger со своими инстансами
* Dagger @Binds vs @Provides - https://stackoverflow.com/questions/52586940/what-is-the-use-case-for-binds-vs-provides-annotation-in-dagger2
* Недостатки @Provides - @Provides генерит больше кода, чем @Binds. Поэтому по возможности лучше использовать @Binds, а @Provides используется, когда по сути у объекта нет конструктора и нужно использовать билдер. 
* Multibindings

https://habr.com/ru/post/336414/

https://dagger.dev/dev-guide/multibindings.html
 
https://medium.com/mobile-app-development-publication/dagger-2-multibindings-reference-rewrite-70c23842b782 

 * @IntoMap 
* Dagger @IntoSet - https://habr.com/ru/post/336414/
* @IntoMap, @IntoSet - для чего они нужны, практический пример 
* Dagger subcomponents vs component dependencies - https://stackoverflow.com/questions/29587130/dagger-2-subcomponents-vs-component-dependencies
* Dagger Scopes
* Управление жизненным циклом компонентов
* Как обойти циклические зависимости (cyclic dependency aka circular dependency) в многомодульном проекте (например, модуль чата вызывает модуль профиля, а модуль профиля опять вызывает модуль чата)?

https://proandroiddev.com/greatest-android-modularization-mistake-and-how-to-undo-it-50eda336a595
 
https://medium.com/@mydogtom/modularization-part-2-dagger-structure-5c2daf5e849c

https://itnext.io/multi-module-navigation-in-android-63cb9924ffbd



### Clean architecture
* Clean Architecture - https://habr.com/ru/company/mobileup/blog/335382/
* UseCases лучше разбивать на отдельные функции (под каждую функцию свой UseCase)
* Для чего нужна Clean Architecture? - Развязывание классов (отсутствие сильной связанности, возможность замены компонентов), тестопригодность, уменьшение порога входа в проект для новых разработчиков (все понимают, что на каждом слое находится)
* MVP, достоинства и недостатки

https://stackoverflow.com/questions/40766185/advantage-of-mvp-in-android

https://www.bornfight.com/blog/mvp-vs-mvvm-choosing-the-right-android-architecture/

* MVVM
* MVI
* На каком слое располагаются MVP, MVVM, MVI? - Это способ организации презентационного слоя 
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
* Интеграционные тесты

https://proandroiddev.com/writing-integration-tests-in-android-b0436978ed7b

https://habr.com/ru/company/rambler_and_co/blog/279799/



### Gradle
* What to do, if external dependency is not found? (Add appropriate repository into: allprojects { repositories {...} })
* implementation vs api (compile)? - При использовании api мы можем использовать внутренние зависимости библиотеки в нашем основном проекте - https://stackoverflow.com/questions/44413952/gradle-implementation-vs-api-configuration
* How to build slightly different applications from one project? (Use flavors)
* Gradle build type vs flavor - https://wajahatkarim.com/2018/04/difference-between-build-type-flavour-and-build-variant-in-android/
* Можем ли мы создать свой build type? - Можем - https://stackoverflow.com/questions/49286743/how-to-add-more-build-types-in-app-than-library/49288390
* How to make some part of the code run only in debug? (if (BuildConfig.DEBUG) {...} else {...})
* What is multidex?
* Gradle parallel - https://docs.gradle.org/current/userguide/performance.html
* Плюсы и минусы многомодульных проектов - https://stackoverflow.com/questions/41632599/dis-advantage-of-having-multiple-modules-in-an-android-studio-project
* Сложности dependency injection в многомодульных проектах - https://developer.android.com/training/dependency-injection/dagger-multi-module



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
