# busca-preco-api

REST API para buscar preços.

Uma API RESTful criada usando Spring Boot. Usei PostgreSQL como banco de dados relacional e JdbcTemplate para interagir com ele.
Além disso, usei JSON Web Token (JWT) para adicionar autenticação. Usei o JWT, podemos proteger certos terminais e garantir que o usuário deve estar logado para acessá-los.



## Configuração e instalação

1. **Clonar o repositorio do GitHub**
   ```sh
   git clone https://github.com/clschroeder/busca-preco-api.git
   cd busca-preco-api
   ```
2. **Spin-up da instancia  do banco PostgreSQL**

   Você pode usar qualquer uma das 2 opções abaixo:
   - uma maneira é baixar o postgres [aqui](https://www.postgresql.org/download) e instalar localmente na maquina
   - outra opão é executar o postgres em um container  docker postgres:
     ```sh
     docker container run --name postgresdb -e POSTGRES_PASSWORD=admin -d -p 5432:5432 postgres
     ```
3. **Criar objetos do banco de dados**

  No diretório raiz do aplicativo (expens-tracker-api), o arquivo de script SQL (expensetracker_db.sql) está presente para a criação de todos os objetos de banco de dados
      - se estiver usando docker (caso contrário, pule esta etapa), primeiro copie este arquivo para o container em execução usando o comando abaixo e, em seguida, execute no container em execução:
     ```
     docker container cp expensetracker_db.sql postgresdb:/
     docker container exec -it postgresdb bash
     ```
   - execute o script utilizando o cliente psql:
     ```
     psql -U postgres --file buscapreco_db.sql
     ```
4. **(Opcional) Atualize as configurações do banco de dados em application.properties**
   
   Se o seu banco de dados estiver hospedado em alguma plataforma de nuvem ou se você modificou o arquivo de script SQL com algum nome de usuário e senha diferentes, atualize o src/main/resources/application.properties de acordo com o arquivo:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/expensetrackerdb
   spring.datasource.username=expensetracker
   spring.datasource.password=password
   ```
5. **Execute o APP Spring Boot**
   ```sh
   ./mvnw spring-boot:run
   ```
   isso é executado na porta 8080 e, portanto, todos os terminais podem ser acessados a partir de http://localhost:8080
