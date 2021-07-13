<p align="center"><img src="src/main/resources/logo/logo.gif" width = "723px" height="383px"></p>



 [![Build Status](https://www.travis-ci.com/Mario23junior/Constelacoes-API.svg?branch=main)](https://www.travis-ci.com/Mario23junior/Constelacoes-API)
 
 
👨‍💻

# Api de consulta de Constelaçãos

API REST de código aberto para dados de consulta de  pesquisa  as informações nela contida  foi desenvolvida usando como base organizacional um sistema de CRUD
<p align="center">


### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.java.com/pt-BR/)
- [Mysql](https://www.mysql.com/)
- [SpringBoot](https://spring.io/projects/spring-boot)
- [Hibernate](https://hibernate.org/)
- [Swagger-UI](https://swagger.io/tools/swagger-ui/)
- [Travis-CI](https://swagger.io/tools/swagger-ui/)


💻
## Primeiro execute o mave
```bash
 mvn package
```

## Em seguida faça compile o projeto

```
java -jar target/constelacoes-1.0-SNAPSHOT.jar
```

# Para obter mais detalhes da documentação acesso o swagger
```
http://localhost:8080/swagger-ui.html
```
# uso

## Obtendo resultado
```
localhost:8080/v1/api/listAll
```

## Resultado das informações das costelaçãoes API
```
[
    {
        "id": 4,
        "visibilidadeOlhoNu": false,
        "estrelaPrincipal": "ANT",
        "magnitudeAparente": "05/04",
        "coordenadasDTOs": [
            {
                "id": 1,
                "scencaoReta": "10:30",
                "declinacao": -30.0,
                "areaTotal": 239.0
            }
        ],
        "dadosObservacionaisDTOs": [
            {
                "id": 3,
                "latitudeMinima": -90.0,
                "latitudeMaxima": 45.0,
                "passagemMeridianal": "05/05",
                "hora": 21.0
            }
        ],
        "fatosCostelecaoDTOs": [
            {
                "id": 2,
                "imagem": "http://4.bp.blogspot.com/-mPQymd-zYrs/UOd13Cpw1eI/AAAAAAAAE-s/BlnxigMGWFk/s1600/Antlia_constellation_mapFINAL+INVERTIDO.jpg",
                "nome": "antlia",
                "abreviacao": "ant"
            }
        ]
    }
]
```


# Contribuindo
Solicitações pull são bem-vindas. Para mudanças importantes, abra um problema primeiro para discutir o que você gostaria de mudar.

Certifique-se de atualizar os testes conforme apropriado

## License
[MIT](https://choosealicense.com/licenses/mit/)
