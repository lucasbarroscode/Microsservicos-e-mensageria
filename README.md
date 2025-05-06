## 🗂️ Diagrama do Projeto

![Diagrama do Projeto](imagens/Diagrama.PNG)


<h2>Comandos para executar o projeto </h2>
docker-compose up -d


---

## 🔗 Links Úteis

- 🐇 **RabbitMQ**: [http://localhost:15672/](http://localhost:15672/)
- 📧 **MailHog**: [http://localhost:8025/](http://localhost:8025/)

---

## ✅ TODO
![PrintToDo.PNG](imagens/PrintToDo.PNG)

melhorar, adicionar a funcionalidade de mandar o email de pedido processado

## 🧪 Testando com Payload

```bash
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
```
