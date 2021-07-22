# gestaoDeTarefas
Orientações:
Utilizei o Tomcat v9.0 para Localhost
No pacote de JPA, no arquivo Pesistence.xml
Declarar a lista de configurações
	<properties>
		<property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5433/gestaodetarefas"/>
		<property name="javax.persistence.jdbc.user" value="postgres"/>
		<property name="javax.persistence.jdbc.password" value="admin"/>
		<property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver"/>
		<property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
		<property name="hibernate.show_sql" value="true"/>
		<property name="hibernate.format_sql" value="true"/>
		<property name="hibernate.hbm2ddl.auto" value="update"/>
	</properties>

---------------------------------------------------------------------------------------------------------------
Criando um new Maven Projetc
configurando para ser projeto web
Configurando pesistencia 2.1

baixando as bibioteclas no Maven para o hibernate e JPA
Criando primeira class TarefaBean, que controlara Tarefa, com os metodos, novo, deletar,
carregar e cadastrar uma tarefa

Fazendo o Mapeamento com Hibernate e JPA

Criando um pacote chamado entidades, e uma classe Tarefa com os objetos
id,titulo, descricao,responsavel,data, prioridade, concluido.
equals() e hashCode para id
Usando o @Entity para transforma a classe em uma tabela no banco de dados
@Id para indentificar o primery key
@GeneratedValue(strategy = GenerationType.AUTO) Gerador de primery automatico

Configurando PostgreSQL, Pesistence.xml
	<properties>
		<property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5433/gestaodetarefas"/>
		<property name="javax.persistence.jdbc.user" value="postgres"/>
		<property name="javax.persistence.jdbc.password" value="admin"/>
		<property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver"/>
		<property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
		<property name="hibernate.show_sql" value="true"/>
		<property name="hibernate.format_sql" value="true"/>
		<property name="hibernate.hbm2ddl.auto" value="update"/>
	</properties>

Criando uma classe para teste JPA

Criando um pacote JPAUtil, implementar uma classe util, onde nosso objeto vai ser responsavel 
de prover a pesistencia. 

Implementando um DAO, onde estara os metodos salvar, delete e List.

Criando uma pagina .xhtml para as configurações front end
Implementando o Merge Update com JSF e JPA
o Merge salva e retorna o objeto(entidade)

Implentando o editar e remover com setPropertyActionListener
-------------------------------------------------------------------------------
