💱 Conversor de Moedas em Java
Projeto em Java que realiza conversão de moedas em tempo real utilizando a ExchangeRate API, com registro das consultas em um arquivo JSON como histórico.
    
📌 Funcionalidades
Conversão entre moedas internacionais
Consumo de API externa (ExchangeRate)
Separação em camadas (API, Service, Model, App)
Histórico de conversões salvo em arquivo JSON
Uso de boas práticas (variáveis de ambiente, organização de pacotes)

🛠️ Tecnologias Utilizadas

Java 11+
ExchangeRate API
Gson (serialização JSON)
IntelliJ IDEA

📂 Estrutura do Projeto
src/
app/Main.java

api/
ExchangeRateApiClient.java

service/
CurrencyService.java ;       HistoryService.java

model/
ExchangeRateResponse.java
ConversionHistory.java

🔑 Configuração da API Key

Este projeto utiliza variável de ambiente para armazenar a API Key de forma segura.
Linux / Mac / WSL
export EXCHANGE_API_KEY=SUA_CHAVE_AQUI

Windows (PowerShell)
setx EXCHANGE_API_KEY "SUA_CHAVE_AQUI"


▶️ Como Executar o Projeto
1️⃣ Compile os arquivos
javac src/app/Main.java src/api/ExchangeRateApiClient.java src/service/*.java src/model/*.java

2️⃣ Execute a aplicação
java app.Main

3️⃣ Exemplo de uso
Moeda origem (ex: USD): BRL
Moeda destino (ex: BRL): USD
Valor: 500
Resultado: 92.70 USD

📝 Histórico de Conversões
As conversões realizadas são salvas no arquivo:
history.json

Exemplo de registro:

{
"from": "BRL",
"to": "USD",
"value": 500.0,
"result": 92.7,
"timestamp": "2026-01-14T22:41:12.843"
}

🧠 Decisões Técnicas

Variáveis de ambiente para segurança da API Key
String para timestamp para evitar problemas de serialização com LocalDateTime
Separação clara de responsabilidades entre camadas
Tratamento básico de erros da API

🚀 Possíveis Melhorias Futuras
Transformar o projeto em Maven
Criar testes unitários
Melhorar tratamento de erros da API
Interface gráfica ou web
Persistência em banco de dados

👨‍💻 Autor

Lucas Sant’Ana
Estudante de programação Java, com foco em boas práticas e aprendizado contínuo.

⭐ Observação Final

Este projeto tem como objetivo praticar consumo de APIs, organização de código e fundamentos de Java, sendo ideal para portfólio e estudos.
