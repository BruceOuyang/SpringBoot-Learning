## 思路

### 不同数据源配置文件分开

### 关注每次使用的数据源

* 有多个DataSource时系统如何判断
* 对应的设施（事物，ORM等）如何选择DataSource


## SpringBoot 中多数据源配置

### 手工配置两组DataSource及相关内容

### 与SpringBoot协同工作（二选一）

* 配置@Primary类型的Bean

* 排除SpringBoot的自动配置
    * DataSourceAutoConfiguration 
    * DataSourceTransactionAutoConfiguration
    * JdbcTemplateAutoConfiguration