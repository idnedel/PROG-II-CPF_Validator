# PROG-II-CPF_Validator
 
Assumindo o design pattern Observer, construa um leitor de CPFs capaz de ler do console n
CPFs, suspendendo as leituras quando for inserido o string sair. Para cada CPF lido seu
validador deverá calcular os dígitos verificadores, validando ou não o CPF. Você deverá
implementar dois observadores (A e B) que observarão seu leitor, sendo o leitor um assunto
observável. O observador A escreve no console se o CPF informado é válido ou inválido.
Quando válido, o texto de saída deverá ser verde, quando inváido, o texto será vermelho. O
observador B anota em um arquivo de saída (cpfs.txt) o CPF lido e um respectivo caractere
de status (V para válido e I para inválido).

Observe a seguir os exemplos de entrada e de saídas para os observadores A e B.
Exemplo de entrada:
840.103.320-93
274.198.563-54
844.496.920-63
039.261.320-43
745.124.256-82
sair

Exemplo de saída para o observador A:
CPF Valido!
CPF Invalido!
CPF Valido!
CPF Valido!
CPF Invalido!

Exemplo de saída para o observador B (linhas escritas em cpfs.txt):
CPF: 840.103.320-93 -> V
CPF: 274.198.563-54 -> I
CPF: 844.496.920-63 -> V
CPF: 039.261.320-43 -> V
CPF: 745.124.256-82 -> I
