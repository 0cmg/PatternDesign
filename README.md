# DesignCoding 设计模式
## 一、UML入门
+ UML基础
+ UML类图
> <!--![uml类图](./images/uml2020-06-07_095158.png)-->
> ![uml类图](https://s1.ax1x.com/2020/06/07/tgdEO1.png)
+ UML时序图
+ UML类关系
> <!--![uml类关系.png](./images/uml_2020-06-07_09-59-05.png)-->
> ![uml类关系.png](https://s1.ax1x.com/2020/06/07/tgdKYD.png)
+ UML记忆技巧
## 二、软件设计七大原则 
#### 2.1开闭原则    
+ 定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。    
+ 补充定义：用抽象构建框架，用实现扩展细节    
+ 优点：提高软件系统的可复用性以及维护性
#### 2.2里氏替换原则    
+ 定义：任何父类可以出现的地方，子类一定可以出现。    
+ 补充定义：里氏代换原则是对“开-闭”原则的补充。    
+ 引申意义：子类可以扩展父类的功能，但不能改变父类原有的功能。    
>* 含义1：子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。    
>* 含义2：子类中可以增加自己特有的方法。    
>* 含义3：当子类的方法重载父类的方法时，方法的前置条件(即方法的输入/入参)要比父类方法的输入参数更宽松。    
>* 含义4：当子类的方法实现父类的方法时(重写/重载或实现抽象方法)方法的后置条件(即方法的输出/返回值)要比父类更严格或相等。    

+ 优点：    
>* 约束继承泛滥，开闭原则的一种体现。    
>* 加强程序的健壮性，同时变更时也可以做到非常好的兼容性、提高程序的维护性、扩展性。降低需求变更时引入的风险。

#### 2.3依赖倒置原则    
+ 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象    
+ 补充定义：
>* 抽象不应该依赖细节，细节应该依赖抽象    
>* 针对接口编程，不要针对实现编程

+ 优点：
>* 可以减少类间的耦合性、提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险

#### 2.4单一职责原则    
+ 定义：不要存在多于一个导致类变更的原因    
+ 补充定义：一个类/接口/方法只负责一项职责    
+ 优点：
>* 降低类的复杂度、提高类的可读性，提高系统的可维护性、降低变更引起的风险

#### 2.5接口隔离原则    
+ 定义：用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口    
+ 补充定义：    
>* 一个类对一个类的依赖应该建立在最小的接口上    
>* 建立单一接口，不要建立庞大臃肿的接口    
>* 尽量细化接口，接口中的方法尽量少    
>* 注意适度原则，一定要适度    

+ 优点：
>* 符合我们常说的高内聚低耦合的设计思想，从而使的类具有很好的可读性、可扩展性和可维护性。

+ 接口隔离原则与单一职责异同：    
>* 接口隔离原则约束的接口依赖的隔离。针对的是抽象。    
>* 单一职责原则约束的是类/接口/方法的职责是单一的，强调的是职责。针对的是程序中的实现和细节 

#### 2.6迪米特原则    
+ 定义：一个对象应该对其他对象保持最少的了解，使得系统功能模块相对独立，这样当一个模块修改时，影响的模块就会	越少，扩展起来更加容易。又叫最少知道原则    
+ 补充定义：
>* 尽量降低类与类之间的耦合

+ 优点：
>* 降低类之间的耦合    
>* 强调只和朋友交流，不和陌生人说话

+ 朋友：出现在成员变量、方法的输入、输出参数中的类称为成员朋友类，而出现在方法体内部的类不属于朋
#### 2.7合成复用原则    
+ 定义：尽量首先使用合成/聚合的方式，而不是使用继承。    
+ 优点：可以使系统更加灵活，降低类与类之间的藕合度一个类的变化对其他类造成的影响相对较少 
## 三、23种设计模式 
#### 3.1简单工厂    
+ 定义：有一个工厂对象决定创建出哪一种产品类的实例    
+ 类型：创建型，但不属于GO23种设计模式    
+ 适用场景：
>* 工厂类负责创建的对象比较少    
>* 客户端（应用层）只知道传入的工厂类的参数，对于如何创建对象（逻辑）不关心

+ 优点：只需要传入一个正确的参数，就可以获取所需的对象，无须知道其创建细节    
+ 缺点：职责相对过重，增加新的产品，需要修改工厂类的判断逻辑，违背开闭原则    
+ 实际应用：
> LoggerFactory 

#### 3.2工厂方法模式    
> + 定义：定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类    
> + 补充定义：工厂方法让类的实例化推迟到子类中进行    
> + 类型：创建型    
+ 适用场景：
>* 创建对象需要大量重复代码    
>* 客户端（应用层）不依赖产品类实例如何被创建、实现等细节    
>* 一个类通过其子类来指定创建哪个对象

+ 优点：
>* 用户只需要关心所需产品对应的工厂，无须关心创建细节    
>* 加入新产品符合开闭原则，提高可扩展性

+ 缺点：
>* 类的个数容易过多，增加复杂度    
>* 增加了系统的抽象性和理解难度

+ 实际应用：
> Collection类、URLStreamHandlerFactory类 

#### 3.3抽象工厂模式    
+ 定义：抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口    
+ 补充定义：无须指定他们具体的类    
+ 类型：创建型    
+ 适用场景：
>* 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节    
>* 强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码    
>* 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现

+ 优点：
>* 具体产品在应用层代码隔离，无须关心创建细节    
>* 将一个系列的产品族统一到一起创建

+ 缺点：
>* 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口    
>* 增加了系统的抽象和理解难度

+ 实际应用：
> java.sql.Connection

#### 3.4建造者模式  
+ 定义：将一个复杂对象的创建与它的表示分离，使得同样的 创建过程可以创建不同的表示    
+ 补充定义：用户只需要指定需要建造的类型就可以得到他们，建造过程及细节不需要知道    
+ 类型：创建型    
+ 适用场景：
>* 如果一个对象有非常复杂的内部结构（很多属性）    
>* 想把复杂对象的创建和使用分离

+ 优点：
>* 封装性好，创建和使用分离    
>* 扩展性好、建造类之间独立、一定程度上解耦

+ 缺点：
>* 产生多余的Builder对象    
>* 产品内部发生变化，建造者都需要修改，成本较大

+ 实际应用：
> StringBuilder类、StringBuffer类、ImmutableSet类、BeanDefinitionBuilder类、SQLSessionFactoryBuilder类 

#### 3.5单例模式    
+ 定义：保证一个类仅有一个实例，并提供一个全局访问点    
+ 类型：创建型    
+ 适用场景：
>* 想确保任何情况下都绝对只有一个实例   
>* 例：网站计数器、数据库连接池

+ 优点：
>* 在内存里只有一个实例，减少了内存开销    
>* 可以避免对资源的多重占用    
>* 设置全局访问点，严格控制访问   

+ 	缺点：
>* 没有接口，扩展困难    

+ 重点：
>* 私有构造器    
>* 线程安全    
>* 延迟加载    
>* 序列化和反序列化安全    
>* 反射    

+ volatile:保证内存可见性,禁止指令重排序
>* 1）保证了不同线程对变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
>* 2）禁止进行指令重排序。

+ 备注：
>* "懒汉"单例模式无法禁止反射攻击，"饿汉"单例模式可以禁止反射攻击，原因在于对象加载顺序不同，"饿汉"是在类初始化时加载，"懒汉"是在调用时加载。

+ 实际应用：
>* 容器单例
>* ThreadLocal线程单例
>* RunTime类（饿汉式）、DeskTop（容器单例）、Spring，AbstractFactoryBean，ErrorContext（限制区域不同）、Mybatis

+ 例图 
<!-- ![单例DoubleCheck单线程](./images/singleton_2020-05-16_17-07-10.png) --> 
<!-- ![单例DoubleCheck多线程](./images/singleton_2020-05-16_17-08-37.png) -->
<!-- ![静态内部类](./images/singleton_2020-05-16_17-21-36.png) -->
>* ![单例DoubleCheck单线程](https://s1.ax1x.com/2020/05/20/Yod100.png)    
>* ![单例DoubleCheck多线程](https://s1.ax1x.com/2020/05/20/YodGkT.png)    
>* ![静态内部类](https://s1.ax1x.com/2020/05/20/YodRcd.png)   

#### 3.6原型模式
+ 定义：指原型实例指定创建对象的种类，并通过拷贝这些原型对象创建新的对象
+ 补充定义：不需要知道任何创建的细节，不调用构造函数
+ 类型：创建型
+ 适用场景：
>* 类初始化消耗较多资源
>* new产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
>* 构造函数比较复杂
>* 循环体中产生大量对象时

+ 优点：
>* 使用原型模式性能比直接new一个对象性能高
>* 简化创建过程

+ 缺点:
>* 必须配备克隆方法
>* 对克隆复杂对象或克隆出的对象进行复杂改造时，容易引入风险
>* 深拷贝、浅拷贝要运用得当

+ 扩展：
>* 深客隆
>* 浅克隆

+ 备注：
>* 原型模式克隆破坏单例，检查对象是否和预期是否一致

+ 实际应用：
> 实现Cloneable接口的类

#### 3.7外观模式
+ 定义：又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口
+ 补充定义：外观模式定义了一个高层接口，让子系统更容易使用
+ 类型：结构型
+ 适用场景：
>* 子系统越来越复杂，增加外观模式提供简单调用接口
>* 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用

+ 优点：
>* 简化了调用过程，无需深入了解子系统，防止带来风险
>* 减少系统依赖、松散耦合
>* 更好的划分访问层次
>* 符合迪米特法则，即最少知道原则

+ 缺点：
>* 增加子系统、扩展子系统行为容易引入风险
>* 不符合开闭原则

+ 相关设计模式：
>* 外观模式与中介者模式
>* 外观模式与单例模式
>* 外观模式与抽象工厂模式

+ 实际应用：
> sping:JDBC，Mybatis:Configuration，Tomcat:RequestFacade、ResponseFacade、StandardSessionFacade等等

#### 3.8装饰者模式
+ 定义：在不改变原有对象的基础上，将功能附加到对象上
+ 补充定义：提供了比继承更有弹性的替代方案（扩展原有对象功能）
+ 类型：结构型
+ 适用场景：
>* 扩展一个类的功能或给一个类添加附加职责
>* 动态的给一个对象添加功能，这些功能可以再动态的撤销

+ 优点：
>* 继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
>* 通过使用不同的装饰类以及这些装饰类的排列组合，可以实现不同效果
>* 符合开闭原则

+ 缺点：
>* 会出现更多的代码，更多的类，增加程序复杂性
>* 动态装饰时，多层装饰时会更复杂

+ 相关设计模式：
>* 装饰者模式与代理模式
>* 装饰者模式与适配器模式

+ 实际应用：
> BufferReader类、TransactionAwareCacheDecorator类

#### 3.9适配器模式
+ 定义：讲一个类的接口转换成客户期望的另一个接口
+ 补充定义：使原本接口不兼容的类可以一起工作
+ 类型：结构型
+ 使用场景：
>+ 已经存在的类，它的方法和需求不匹配时（方法结果相同或相似）
>+ 不是软件设计阶段考虑的设计模式，是随着软件的维护，由于不同产品、不同厂家造成功能类似而接口不相同情况下的解决方案

+ 优点:	
>* 能提高类的透明性和复用性，现有的类复用但不需要改变
>* 目标类和适配器类解耦，提高程序扩展性
>* 符合开闭原则

+ 缺点:
>* 适配器编写过程中需要全面考虑，可能增加系统的复杂性
>* 增加系统代码可读的难度

+ 扩展：
>* 对象适配器->继承
>* 类适配器->组合

+ 相关设计模式
>* 适配器模式和外观模式

+ 实际应用：
> XmlAdapter类、AdvisorAdapter接口、JpaVendorAdapter接口

#### 3.10享元模式
+ 定义：提供了减少对象数量从而改善应用所需的对象结构的方式
+ 补充定义：运用共享技术有效地支持大量细粒度的对象
+ 类型：结构型
+ 使用场景：
>* 常常应用于系统底层的开发，以便解决系统的性能问题
>* 系统有大量相似对象、需要缓冲池的场景

+ 优点：
>* 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
>* 减少内存之外的其他资源占用

+ 缺点：
>* 关注内/外部状态、关注线程安全问题
>* 使系统、程序的逻辑复杂化

+ 扩展：
>* 内部状态
>* 外部状态

+ 相关设计模式：
>* 享元模式和代理模式
>* 享元模式和和单例模式

+ 实际应用：
> Integer类、Long类

#### 3.11组合模式
+ 定义：将对象组合成树形结构以表示“部分-整体”的层次结构
+ 补充定义：组合模式使客户端对单个对象和组合对象保持一致的处理方式
+ 类型：结构型
+ 使用场景：
>* 希望客户端可以忽略组合对象与单个对象的差异时
>* 处理一个树形结构

+ 优点：
>* 清楚地定义分层次的复杂对象，表示对象的全部或部分层次
>* 让客户端忽略了层次的差异，方便对整个层次结构进行控制
>* 简化了客户端代码
>* 符合开闭原则

+ 缺点：
>* 限制类型时会较为复杂
>* 使设计变得更加抽象

+ 相关设计模式：
>* 组合模式和访问者模式

+ 实际应用：
> java.util.HashMap类，java.util.List类,Maybits的SqlNode

+ 例图：
<!-- ![组合模式](./images/composite_2020-05-30_15-01-59.png) -->
> ![组合模式](https://s1.ax1x.com/2020/05/30/tMyVBD.png)

#### 3.12桥接模式
+ 定义：将抽象部分与它的具体实现分离，使它们都可以独立地变化
+ 补充定义：通过组合的方式建立两个类之间的联系，而不是继承
+ 类型：结构型
+ 使用场景：
>* 抽象和具体实现之间增加更多的灵活性
>* 一个类存在两个（或多个）独立变化的维度，而且这两个（或多个）维度都需要独立进行扩展
>* 不希望使用继承，或因为多层继承导致系统类的个数剧增

+ 优点：
>* 分离抽象部分及具体实现部分
>* 提高了系统的可扩展性
>* 符合开闭原则
>* 符合合成复用原则

+ 缺点：
>* 增加了系统的理解与设计维度
>* 需要正确地识别出系统中两个独立变化的维度

+ 相关设计模式：
>* 桥接模式和组合模式
>* 桥接模式和适配器模式

+ 实际应用：
> JDBC的Driver类

#### 3.13代理模式
+ 定义：为其他对象提供一种代理，以控制对这个对象的访问
+ 补充定义：代理对象在客户端和目标对象之间起到中介的作用
+ 类型：结构型
+ 使用场景：
>* 保护目标对象
>* 增强目标对象

+ 优点：
>* 代理模式能将代理对象与真实被调用的目标对象分离
>* 一定程度上降低了系统的耦合度，扩展性好
>* 保护目标对象
>* 增强目标对象

+ 缺点：
>* 代理模式会造成系统设计中类的数目增加
>* 在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
>* 增加系统的复杂度

+ 扩展：
>* 静态代理
>* 动态代理
>* CGlib代理

+ Spring代理选择扩展：
>* 当Bean有实现接口时，Spring就会用JDK的动态代理
>* 当Bean没有实现接口时，Spring使用CGlib
>* 可以强制使用CGlib
>>* 在spring配置中加入 `<aop:aspectj-autoproxy proxy-target-class="true"/>`
>> <!-- ![Spring代理选择扩展](./images/proxy_2020-05-31_220037.png) -->
>> ![Spring代理选择扩展](https://s1.ax1x.com/2020/05/31/t333WD.png)

+ 代理速度对比扩展：
>* CGlib 
>* JDK动态代理
>* 速度对比

+ 相关设计模式：
>* 代理模式和装饰者模式 
>* 代理模式和适配器模式

+ 实际应用：
> java.lang.reflect.Proxy类，spring的proxyFactoryBean类、CglibAopProxy类，Mybatis的MapperProxyFactory类

#### 3.14模板方法模式
+ 定义：定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
+ 补充定义：模版方法使子类可以在不改变算法结构的情况下，重新定义算法的某些步骤
+ 类型：行为型
+ 使用场景：
>* 一次性实现一个算法的不变的部分，并将可变的行为留给子类实现
>* 各子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复

+ 优点：
>* 提高复用性
>* 提高扩展性
>* 符合开闭原则

+ 缺点：
>* 类数目增加
>* 增加了系统实现的复杂度
>* 继承关系自身缺点，如果父类添加新的抽象方法，所有子类都要改一遍

+ 扩展：
>* 钩子方法

+ 相关设计模式：
>* 模板方法模式和工厂方法模式
>* 模板方法模式和策略模式

+ 实际应用：
> jdk的AbstractList类，HttpServlet类，mybatis的BaseExecutor类

#### 3.15迭代器模式
+ 定义：提供一种方法，顺序访问一个集合对象中的各个元素，而又不暴露该对象的内部表示
+ 类型：行为型
+ 使用场景：
>* 访问一个集合对象的内容而无需暴露它的内部表示
>* 为遍历不同的集合结构提供一个统一的接口

+ 优点：
>* 分离了集合对象的遍历行为

+ 缺点：
>* 类的个数成对增加

+ 相关设计模式：
>* 迭代器模式和访问者模式

+ 实际应用：
> jdk的ArrayList类

#### 3.16策略模式
+ 定义：定义了算法家族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化不会影响到使用算法的用户
+ 补充定义：if...else...
+ 类型：行为型
+ 使用场景：
>* 系统有很多类，而他们的区别仅仅在于他们的行为不同
>* 一个系统需要动态地在几种算法中选择一种

+ 优点：
>* 开闭原则
>* 避免使用多重条件转移语句
>* 提高算法的保密性和安全性

+ 缺点：
>* 客户端必须知道所有的策略类，并自行决定使用哪一个类
>* 产生很多策略类

+ 相关设计模式：
>* 策略模式和工厂模式
>* 策略模式和状态模式

#### 3.17解释器模式
+ 定义：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
+ 补充定义：为了解释一种语言，而为语言创建的解释器
+ 类型：行为型
+ 使用场景：
>* 某个特定类型问题发生频率足够高

+ 优点：
>* 语法由很多类表示，容易扩展此"语言"

+ 缺点：
>* 当语法规则数目太多时，增加了系统复杂度

+ 相关设计模式：
>* 解释器模式和适配器模式

+ 实际应用：
> org.springframework.expression.ExpressionParser类

#### 3.18观察者模式
+ 定义：定义了对象之间的一对多依赖，放多个观察者对象同时监听某一个主题对象，当主体对象发生变化时，它所依赖者（观察者）都会收到通知并更新
+ 类型：行为型
+ 使用场景：
>* 关联行为场景，建立一套触发机制

+ 优点：
>* 观察者与被观察者之间建立一个抽象的耦合
>* 观察者模式支持广播通信

+ 缺点：
>* 观察者之间有过多的细节依赖，提高时间消耗及程序复杂度
>* 使用要得当，要避免循环调用

+ 实际应用：
> RequestListener类，EventListener类

#### 3.19备忘录模式

+ 定义：保存一个对象的某个状态，以便在适当的时候恢复对象
+ 补充定义：“后悔药”
+ 类型：行为型
+ 使用场景：
>* 保存恢复数据相关业务场景
>* 后悔的时候，即想恢复到之前的状态

+ 优点：
>* 为用户提供一种可恢复机制
>* 存档信息的封装

+ 缺点：
>* 资源占用

+ 相关设计模式：
>* 备忘录模式和状态模式

+ 实际应用：
> spring-webflow

#### 3.20命令模式

+ 定义：将“请求”封装成对象，以便使用不同的请求
+ 补充定义：命令模式解决了应用程序中对象的职责以及它们之间的通信方式
+ 类型：行为型
+ 使用场景：
>* 请求的调用者和请求者需要解耦，是调用者和接收者不直接交互
>* 需要抽象出等待执行的行为

+ 优点：
>* 降低耦合
>* 容易扩展新命令或者一组命令

+ 缺点：
>* 命令的无限扩展会增加类的数量，提高系统的实现复杂度

+ 相关设计模式：
>* 命令模式和备忘录模式

+ 实际应用：
> Runable接口，Junit的Test方法

#### 3.21中介者模式
+ 定义：定义了一个封装一组对象如何交互的对象
+ 补充定义：通过使对象明确地相互引用来促进松散耦合，并允许独立地改变他们的交互
+ 类型：行为型
+ 使用场景：
>* 系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解
>* 交互的公共行为，如果需要改变行为规则则可以增加新的中介者类

+ 优点：
>* 将一对多转化成了一对一，降低程序复杂度
>* 类之间解耦

+ 缺点：
>* 中介者过多，导致系统复杂

+ 相关设计模式：
>* 中介者模式和观察者模式

+ 实际应用：
> JDK的Timmer类

#### 3.22责任链模式
+ 定义：为请求创建一个接收此次请求对象的链
+ 类型：行为型
+ 使用场景：
>* 一个请求的处理需要多个对象当中的一个或几个协作处理

+ 优点：
>* 请求的发送至和接收者（请求的处理）解耦
>* 责任链可以动态组合

+ 缺点：
>* 责任链太长或者处理时间过长，影响性能
>* 责任链有可能过多

+ 相关设计模式：
>* 责任了模式和状态模式

+ 实际应用：
> servlet的Filter类

#### 3.23状态模式

+ 定义：允许一个对象在其内部状态改变时，改变其行为
+ 类型：行为型
+ 使用场景：
>* 一个对象存在多个状态（不同状态下行为不同），且状态可相互转换

+ 优点：
>* 将不同的状态隔离
>* 将各种状态的转换逻辑，分布到State的子类中，减少相互依赖
>* 增加新的状态非常简单

+ 缺点：
>* 状态多的业务场景导致类数目增加，系统变复杂

+ 相关设计模式：
>* 状态模式和享元模式

+ 实际应用：
> jsf-api的Lifecycle类

## 四、总结
+ UML入门
>* UML基础
>* UML类图
>* UML时序图
>* UML类关系
>* UML记忆技巧

+ 七大设计原则
>* 开闭原则
>* 依赖倒置原则
>* 单一职责原则
>* 接口隔离原则
>* 迪米特原则
>* 里氏替换原则
>* 合成复用原则

+ 设计模式-创建型
>* **工厂方法模式**
>* **抽象工厂模式**
>* **建造者模式**
>* **单例模式**
>* 原型模式

+ 设计模式-结构型
>* **适配器模式**
>* **装饰者模式**
>* **代理模式**
>* **外观模式**
>* **桥接模式**
>* 组合模式
>* **享元模式**

+ 设计模式-行为型
>* **策略模式**
>* 观察者模式
>* **责任链模式**
>* 备忘录模式
>* **模板方法模式**
>* 迭代器模式
>* 中介者模式
>* 命令模式
>* 访问者模式
>* 解释器模式
>* **状态模式**