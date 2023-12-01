# TesteCloundPark

## Exercicio_1

* O exercicio 1 foi utilizado a linguagem Java
* Abra na IDE a __pasta__ chamada `LeituraEGravacaoArquivoJson`
* Execute a classe chamada `Main` que está dentro do diretório **sr**

### Execução do programa
Ao executar a classe principal, serão exibidas três opções no console:


```
1 - Read configuration - (Escrever no arquivo)
2 - Write configuration - (Ler arquivo)
0 - Exit - (Sair)
```
Ao digitar a opção **1**, serão apresentados campos para você adicionar/editar no arquivo chamado ``config.json``. O console exibirá:


Primeiro, aparecerá a opção 1. Após preencher e pressionar Enter, aparecerá a opção 2, e assim por diante:
```
1 - Informe o nome do servidor: localhost
2 - Informe o IP do servidor: 123.234.222.88
3 - Informe a senha do servidor: password
```
Ao finalizar o preenchimento, será exibida a mensagem __Salvo com sucesso__ no console, e as alterações feitas no ``config.json`` serão exibidas:

```
Salvo com sucesso

{"server_name":"localhost","server_ip":"123.234.222.88","server_password":"password"}
```
O programa voltará ao início após a conclusão.

Ao escolher a opção **2**, será exibido o conteúdo do arquivo config.json, que já foi salvo:

```
Server{server_name='Jailson', server_ip='123.123.123', server_password='Jailson'}
```
Se escolher a opção **0**, o programa será encerrado.

## Obsercação
> _A tradução correta de **Write configuration** seria **Configuração de gravação** e **Read configuration** seria **Ler configuração.**_

## Exercicio_2
