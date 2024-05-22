

Catalogue

[TOC]





**Installation steps**

1. Get a free API Key at [https://example.com](https://example.com/)
2. Clone the repo

```
 git clone  git@github.com:xxjiafu/Yashandb_flowable.git
```
整体演示
上面的代码写好后就可以演示下整体流程了

1.启动好此项目，然后创建一个流程：

访问：http://localhost:8081/expense/add?userId=123&money=123321&descption=test123

返回：提交成功.流程Id为：2501

2.查询待办列表:

访问：http://localhost:8081/expense/list?userId=123

输出：Task[id=2507, name=出差报销]

3.同意：

访问：http://localhost:8081/expense/apply?taskId=2507

返回：processed ok!

4.生成流程图：

访问：http://localhost:8081/expense/processDiagram?processId=2501

 


** **


**Project tree**

```
D:\PROJECT\FLOWABLE6.8_YAS
├─.idea
├─src
│  ├─main
│  │  ├─java
│  │  │  ├─com
│  │  │  │  └─sics
│  │  │  │      ├─config
│  │  │  │      └─controller
│  │  │  ├─liquibase
│  │  │  │  ├─database
│  │  │  │  │  └─core
│  │  │  │  └─datatype
│  │  │  │      └─core
│  │  │  └─org
│  │  │      └─flowable
│  │  │          ├─common
│  │  │          │  ├─db
│  │  │          │  │  └─properties
│  │  │          │  └─engine
│  │  │          │      └─impl
│  │  │          └─dmn
│  │  │              ├─db
│  │  │              │  └─liquibase1
│  │  │              └─engine
│  │  │                  └─impl
│  │  │                      └─db
│  │  └─resources
│  │      ├─META-INF
│  │      │  └─services
│  │      ├─org
│  │      │  └─flowable
│  │      │      ├─batch
│  │      │      │  └─service
│  │      │      │      └─create
│  │      │      ├─common
│  │      │      │  └─db
│  │      │      │      ├─create
│  │      │      │      └─properties
│  │      │      ├─db
│  │      │      │  └─create
│  │      │      ├─dmn
│  │      │      │  ├─db
│  │      │      │  │  └─liquibase
│  │      │      │  └─engine
│  │      │      │      └─impl
│  │      │      ├─entitylink
│  │      │      │  └─service
│  │      │      │      └─db
│  │      │      │          └─create
│  │      │      ├─eventsubscription
│  │      │      │  └─service
│  │      │      │      └─db
│  │      │      │          └─create
│  │      │      ├─identitylink
│  │      │      │  └─service
│  │      │      │      └─db
│  │      │      │          └─create
│  │      │      ├─idm
│  │      │      │  └─db
│  │      │      │      └─create
│  │      │      ├─job
│  │      │      │  └─service
│  │      │      │      └─db
│  │      │      │          └─create
│  │      │      ├─task
│  │      │      │  └─service
│  │      │      │      └─db
│  │      │      │          └─create
│  │      │      └─variable
│  │      │          └─service
│  │      │              └─db
│  │      │                  └─create
│  │      └─processes
│  └─test
│      └─java
└─target
    ├─classes
    │  ├─com
    │  │  └─sics
    │  │      ├─config
    │  │      └─controller
    │  ├─liquibase
    │  │  ├─database
    │  │  │  └─core
    │  │  └─datatype
    │  │      └─core
    │  ├─META-INF
    │  │  └─services
    │  ├─org
    │  │  └─flowable
    │  │      ├─batch
    │  │      │  └─service
    │  │      │      └─create
    │  │      ├─common
    │  │      │  ├─db
    │  │      │  │  ├─create
    │  │      │  │  └─properties
    │  │      │  └─engine
    │  │      │      └─impl
    │  │      ├─db
    │  │      │  └─create
    │  │      ├─dmn
    │  │      │  ├─db
    │  │      │  │  └─liquibase
    │  │      │  └─engine
    │  │      │      └─impl
    │  │      │          └─db
    │  │      ├─entitylink
    │  │      │  └─service
    │  │      │      └─db
    │  │      │          └─create
    │  │      ├─eventsubscription
    │  │      │  └─service
    │  │      │      └─db
    │  │      │          └─create
    │  │      ├─identitylink
    │  │      │  └─service
    │  │      │      └─db
    │  │      │          └─create
    │  │      ├─idm
    │  │      │  └─db
    │  │      │      └─create
    │  │      ├─job
    │  │      │  └─service
    │  │      │      └─db
    │  │      │          └─create
    │  │      ├─task
    │  │      │  └─service
    │  │      │      └─db
    │  │      │          └─create
    │  │      └─variable
    │  │          └─service
    │  │              └─db
    │  │                  └─create
    │  └─processes
    ├─generated-sources
    │  └─annotations
    ├─generated-test-sources
    │  └─test-annotations
    ├─maven-archiver
    ├─maven-status
    │  └─maven-compiler-plugin
    │      ├─compile
    │      │  └─default-compile
    │      └─testCompile
    │          └─default-testCompile
    └─test-classes


```


### Aarchitecture
Monomer architecture



### Technology

- springboot2.7.3

- Flowable 6.8.0

- liquibase 4.9.1 

  

####  How to join us 

1.  Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Version Control 

v1.0.0 -- 20240522

### From

xu



The project has signed the[Apache-2.0 license](https://github.com/xxjiafu/Yashandb_flowable/tree/main#Apache-2.0-1-ov-file) License, please refer to [LICENSE.txt](https://github.com/shaojintian/Best_README_template/blob/master/LICENSE.txt) for details

### Thanks

- xu

