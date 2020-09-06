# Chapter2 RabbitMQ入门

## 基本概念介绍`

### 生产者与消费者
- Producer 生产者  
    - producer负责创建消息 将消息发布(publish)到broker当中  
    - 消息一般包括两个部分
    - payload 消息体 一般是一个带有业务逻辑的结构数据  e.g. a json string  
    - label 标签 比如一个交换器(exchange)和一个路由键(route key)

- Consumer 消费者  
    - consumer负责从broker接收消息(仅消费消息体
    - 因为在路由过程中label会被丢弃 存入队列(queue)的消息只是payload
    - consumer并不知道producer是谁(也不用知道
    
- Broker 消息中间件的中间节点
    - 在RabbitMQ中可以看作是RabbitMQ的一个服务节点 一个实例

### 队列
- 在RabbitMQ中，消息只能储存在队列中 -- 与Kafka相反
- 多个consumer可以订阅(subscribe)同一个队列 但在RabbitMQ中 队列并不能进行消息广播 即消息只能被一个consumer所消费
- 可以进行二次开发 来实现广播消息 但不建议这样做

### 交换器 路由键 绑定
- Exchange 交换器
    - 在RabbitMQ中producer将消息投递到交换器中 再由exchange来路由到队列
    - 有四种常用类型 fanout，direct，topic，headers
    
- Route key 路由键
    - producer在投递消息时需要一般会指定一个路由键 来指定该消息的路由规则
    - 路由键需要会跟绑定键(binding key)联合使用
    - 当交换器和绑定键确定时 通过路由键来指定消息的流向

- Binding 绑定
    - 在RabbitMQ中 通过绑定将交换器和队列绑定起来
    - 绑定时 指定一个绑定键 从而将消息路由到队列
    - 绑定键也是一种路由键 用于绑定 其他地方提到的路由键 则指的是消息中的路由键

### 交换器类型
- fanout 会将所有消息发送到fanout的消息路由到所有绑定了的队列

- direct 会精确匹配route key和binding key到队列
    
- topic 会模糊匹配route key和binding key到队列
    - binding key 用. # *来作模糊匹配
    - .表示单词分隔符 *匹配一个单词 #匹配多个

- headers 不按route key来匹配 而是绑定时指定的键值对 性能低 基本不用

## AMQP
- RabbitMQ是AMQP的erlang实现
- 消息流程
    - 建立连接(connection)
    - 建立信道(channel)
    - 发送/等待/接收消息,consumer还可以选择确认消息(发送ack)
    - 释放资源

