# Parking Spaces

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Muriloabreu/parking-spaces/blob/main/LINCESE) 

# Sobre o projeto

Parking Spaces é uma API REST.
Feita em Java utilizando o Fremawork Spring boot com o proposito de realizar Vários CRUDs para cadastrar vagas de estacionamento(Parking Spot) em codomínios.
Nessa API existe alguns CRUDs;
Os CRUDs são:

- Responsibles Cars;
- Cars;
- Parking Spots;

 ### Relatórios Customizados Utilizando Query Native
Foi criado um relatórios onde podemos obter informações mais precisas.
- 1° Podemos listar todas as vagas(Spots) só informando parte do nome do block;
![Web 1](https://github.com/Muriloabreu/db-assets/blob/main/parkingSpot/relatorio_QueryNative01.png))


# Tecnologias utilizadas
## Back end
- Java
- Maven
- Spring Boot



## Implantação em produção

- Banco de dados: Postgres 9.5

## Back end
- Pré-requisitos: Java 17

# Como executar o projeto

Necessário ter um servidor Tomcat para poder rodar o projeto Java

##  Utilize uma plataforma de consultas de API's e faça a requisição de acordo os modelos disponíveis na sessão abaixo.
</code></pre>
 - Modelos de requisição JSON
</p>

</P>
<h5>ResponsibleCar</h5>

```json
{
        "id": 2,
        "firstName": "José",
        "lastName": "Antônio",
        "cpf": "21673948125",
        "registrationDate": "2023-06-16T01:01:25.566398",
        "apartment": "1702",
        "block": "D2"
    }
```
</p>
<h5>Car</h5>

```json
{
        "id": 52,
        "licensePlateCar": "KIQ1B90",
        "brandCar": "Hyundai",
        "modelCar": "HB20",
        "colorCar": "BRANCA",
        "registrationDate": "2023-06-16T01:40:48.732998",
        "responsibleCarModel": {
                                  "id": 2,
                                  "firstName": "José",
                                  "lastName": "Antônio",
                                  "cpf": "21673948125",
                                  "registrationDate": "2023-06-16T01:01:25.566398",
                                  "apartment": "1702",
                                  "block": "D2"
                                }
    }
```
</p>
<h5>ParkingSpot</h5>

```json
{
        "id": 1,
        "parkingSpotNumberA": "AA0001",
        "parkingSpotNumberB": "AA0002",
        "cars": [{
                "id": 52,
                "licensePlateCar": "KIQ1B90",
                "brandCar": "Hyundai",
                "modelCar": "HB20",
                "colorCar": "BRANCA",
                "registrationDate": "2023-06-16T01:40:48.732998",
                "responsibleCarModel": {
                                        "id": 2,
                                        "firstName": "José",
                                        "lastName": "Antônio",
                                        "cpf": "21673948125",
                                        "registrationDate": "2023-06-16T01:01:25.566398",
                                        "apartment": "1702",
                                        "block": "D2"
                                        }
            }
        ],
        "registrationDate": "2023-06-17T23:11:28.821746"
    }
```
</p>
</p>

```bash
# clonar repositório
git clone git@github.com:Muriloabreu/parking-spaces.git
```

# Autor

Murilo Abreu do Nascimento

https://www.linkedin.com/in/murilo-abreu-07544973/
