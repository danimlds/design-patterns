# Design-patterns
Utilização dos Design Patterns em java.

## Factory Method ##
Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.

Considere um sistema bancário que precisa enviar mensagens aos seus clientes. Por exemplo, após a realização de uma compra com cartão de crédito, uma mensagem contendo informações sobre a compra pode ser enviada ao cliente.
Se esse cliente for uma pessoa física, poderá optar pelo recebimento da mensagem através de Email ou SMS. Por outro lado, se for uma pessoa jurídica, poderá também receber a mensagema através de JMS(Java Message Service).
