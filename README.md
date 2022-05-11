# SpringDemo

## Spring5 相关基础

### 一、IOC
#### 1、Bean 管理 xml方式
1、创建对象

2、注入属性
1. 无参构造函数注入
2. 有参构造函数注入
3. p 名称空间注入
4. 注入null值和特殊字符
5. 注入外部bean
6. 注入内部bean和级联赋值
7. 注入集合类型属性

3、FactoryBean实现

4、bean的作用域
1. 默认值 singleton，表示单实例对象
2. prototype，表示多实例对象

5、bean的生命周期
1. 通过构造器创建bean实例（无参构造函数）
2. 为bean的属性设置值和对其他bean引用（调用set方法）
3. 调用bean的初始化的方法（需要进行配置）
4. bean可以使用了（对象获取到了）
5. 当容器关闭时，调用bean销毁的方法（需要进行配置销毁的方法）

6、有后置处理器时，bean的生命周期
1. 通过构造器创建bean实例（无参构造函数）
2. 为bean的属性设置值和对其他bean引用（调用set方法）
3. 把bean实例传递给bean的后置处理器方法 postProcessBeforeInitialization
4. 调用bean的初始化的方法（需要进行配置）
5. 把bean实例传递给bean的后置处理器方法 postProcessAfterInitialization
6. bean可以使用了（对象获取到了）
7. 当容器关闭时，调用bean销毁的方法（需要进行配置销毁的方法）

7、xml自动装配

8、外部属性引入
```xml
<!--引入外部属性文件-->
<context:property-placeholder location="classpath:test.properties"/>
```

#### 2、Bean 管理 注解方式
1、 创建对象

2、 组件扫描配置

3、注解方式实现属性注入
1. @Autowired：根据属性类型进行自动装配
2. @Qualifier：根据属性名称进行注入，这个@Qualifier注解的使用，需要和上面@Autowired一起使用

4、完全注解开发，基于java类添加注解 @Configuration

### 二、AOP
1、JDK动态代理 JdkProxyTest

2、xml方式配置aop AopTest

3、注解方式配置aop AopTest

### 三、JdbcTemplate
1、准备工作
1. 引入相关jar包
2. 在spring配置文件中配置数据库连接池
3. 配置JdbcTemplate对象，注入DataSource

2、添加

3、更新

4、删除

5、查询
1. 查询返回某个值 queryForObject(String sql, Class<T> requiredType)
2. 查询返回对象 queryForObject(String sql, RowMapper<T> rowMapper, Object... args)
3. 查询返回集合 query(String sql, RowMapper<T> rowMapper, Object... args)

6、批量添加
1. batchUpdate(String sql, List<Object[]> batchArgs)

7、批量修改和删除

### 四、事务管理
1、 事务环境配置

2、编程式事务

3、声明式事务
1. 基于注解方式
2. 基于xml配置方式

4、完全注解方式开发

### 五、Spring5新功能-Webflux