# Spring Batch

## Sistemas em batch
- *Definição:* Um sistema que realiza um processamento de uma quantidade finita de dados sem interação ou interrupção

- Os dados são processados em lotes e normalmente é usado 
quando há um grande volume de dados

- *Exemplos:* Sistema que trabalha de forma automática para enviar emails ou notificações, 
processar a folha de pagamento;

## Quando utilizar sistemas em batch
- Extração, transformação e carregamento (ETL)
- Migração de dados
- Processamento paralelo
- Tarefas que envolvem o processamento contínuo

## Spring Batch
Principais questões a serem pensadas ao trabalhar com um grande volume de dados usando o Spring Batch:
- tempo
- integridade
- execução
- monitoramento

Outros pontos chaves para implementação destes sistemas:
- escalabilidade
- disponibilidade
- usabilidade

## Componentes do Spring Batch

- Job
- Step
	- tasklets
	- chunks
		- Item Reader
		- Item Processor
		- Item Writer
- Job Repository
- Job Launcher

## Tabelas do Spring Batch

#### BATCH_JOB_INSTANCE
- quantidades de execuções lógicas

#### BATCH_STEP_EXECUTION
- tempo que iniciou o batch e finalizou

https://github.com/devsuperior/hello-world-spring-batch <br/>
https://github.com/devsuperior/user-request-spring-batch <br/>
https://github.com/devsuperior/send-book-email-spring-batch <br/>

## Dependências
#### pom.xml

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-batch</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
<!-- Spring Batch Test para Spring Boot 2.7.x -->
<dependency>
    <groupId>org.springframework.batch</groupId>
    <artifactId>spring-batch-test</artifactId>
    <scope>test</scope>
</dependency>
```

Plugins 
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-resources-plugin</artifactId>
    <version>3.1.0</version>
</plugin>
```

#### application.properties

```
spring.application.name=spring-batch

spring.datasource.url=jdbc:mysql://127.0.0.1:3307/spring_batch
spring.datasource.username=root
spring.datasource.password=1234567
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.batch.jdbc.initialize-schema=always
```
>**OBS** é necessário criar o banco primeiro
