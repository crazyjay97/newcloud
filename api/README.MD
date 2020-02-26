#### Spring boot 集成 Graphql

### API [测试地址](http://127.0.0.1:10601/graphiql)

### 重要文件


##### root.graphqls
定义方法参数以及返回值

```
type Query{
    listTest(count: Int): [TestModel]
    allTest: [TestModel]
}
```
##### schema.graphqls
定义实体的结构
```
type TestModel{
    id: Int
    name: String
    version: String
    testTime: Long
    example: TestExampleModel
}

type TestExampleModel{
    id: Int
    name: String
    desc: String
}
```

***

### 组成

##### Query 
查询相关的操作

* 实现`GraphQLQueryResolver`
对应`root.graphqls`当中查询方法的定义
* 实现`GraphQLResolver<T>`
可以注入`GraphQLQueryResolver`返回结果的属性中
##### mutation
修改相关的操作


##### 测试用例

###### 查询
```graphql
{
  listTest(page:1,size:10){
    id
    name
    testTime
    example {
      id
      name
      description
    }
  }
}
```
###### 添加测试
```graphql
mutation {
  addTest(name:"TEST",version:"1.0.0")
}
```
###### 添加测试案例
```graphql
mutation {
  addExample(testId:1,name:"I AM IRON MAN",description:"LOVE 3000 TIMES")
}
```