<h2 align="center">
  Desafio Senha Segura 🔒
</h2>

Resolução do desafio proposto pelo repositorio Backend Brasil, confira detalhes [neste link](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md).

---

#### ☕ Tecnologias utilizadas:

- Java
- Spring Boot

---

## ⚙️ Passo a passo

#### 1 - Inicie a aplicação e ela estará disponível em:

- http://localhost:8080/validate-password

#### 2 - Abra algum aplicativo para realizar suas requisições

- Algumas recomendações:  
  [Insomnia](https://insomnia.rest/)  
  [Postman](https://www.postman.com/)

--- 

## 📨 Requisições

| Método | Url                         | Descrição                         | Corpo da requisição          |
| ------ | --------------------------- | --------------------------------- | ---------------------------- |
| POST   | /validate-password          | Valide uma senha.                 | [JSON](#validarsenha)        |

---

## 📄 Corpo das requisições

##### <a id="validarsenha">/validate-password.</a>

```json
{
  "password": "vYQIYxO&p$yfI^r"
}
```


