# Exercicio avaliativo 2 📁

**Integrantes**
- Augusto G Serrano
- Caio S Lopes

## Descrição
O projeto consiste no desenvolvimento de uma biblioteca para trabalhar com armazenagem de dados em arquivos.

## Problema
O subsistema criado para manipular os arquivos possui diversas funcionaliades que precisam ser utilizadas de forma correta, gerando uma complexibidade para seu uso.

## Pattern(s)
- Facade

A implantação do Repository (como um Facade) abstrai a complexibidade da manipulação dos arquivos.

## Implementação
Foi implementado o _design pattern Facade_ no projeto através de uma classe chamada Repository, está classe instacia todas as ferramentas necessárias para realizar a manipulação dos arquivos (CRUD - Create, Read, Update, Delete). Repository é usado para abstrair a manipulação dos arquivos, fazendo com que o cliente acesse apenas a interface Repository sem se preocupar com a implementação.

## UML do Projeto
![UML-ex-ava](https://github.com/user-attachments/assets/764d00e9-eb54-4417-85b8-65e2254e7b65)

* Obs: Note que no package Domain está sendo mostrado apenas a entidade User enquanto que no projeto também existe a classe Game. Isso acontece pois o ObjectConverter faz a abstração e conversão das entidades sempre da mesma forma independente de qual seja, sendo assim, decidimos não representar a classe Game apenas para simplificar o diagrama.
