<h2>Diagrama do Projeto</h2>
![Diagrama.PNG](imagens%2FDiagrama.PNG)


<h2>Comandos para executar o projeto </h2>
docker-compose up -d


<h2>Links importantes </h2>
RabbitMq:<br>
http://localhost:15672/<br>
MailHog:<br>
http://localhost:8025/<br>

<br>
TODO
<br>
![PrintToDo](https://github.com/user-attachments/assets/4f95a4a0-5b87-44fa-9bb4-9eae0f81a636)

melhorar, adicionar a funcionalidade de mandar o email de pedido processado

<br>
<h3>Payload</h3>
curl --location 'http://localhost:8080/api/v1/pedidos' \
--header 'Content-Type: application/json' \
--data-raw '{
    "cliente": "zezinho",
    "itens": [
        {
            "produto": {
                "nome": "Fone de ouvido",
                "valor": 30.00
            },
            "quantidade": 2
        }
    ],
    "valorTotal": 60.00,
    "emailNotificacao": "fulan@gmail.com"
}'
